package controllers;

import static play.data.Form.form;

import java.awt.Desktop;
import java.io.FileWriter;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import org.apache.commons.mail.EmailException;
import com.opencsv.CSVWriter;
import controllers.helpers.AccessMiddleware;
import managers.SessionData;
import models.AuditLog;
import models.Profile;
import models.RemovedProfile;
import models.RemovedUser;
import models.Service;
import models.User;
import models.enums.RoleType;
import models.utils.AppException;
import models.utils.Mail;
import play.Configuration;
import play.Logger;
import play.data.Form;
import play.data.validation.Constraints;
import play.i18n.Messages;
import play.libs.mailer.MailerClient;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.auth;
import views.html.accessdenied;
import views.html.useraccount;
import views.html.profile.profile;
import views.html.profile.profilecreated;
import views.html.profile.editprofile;
import views.html.profile.displayprofiles;
import views.html.admin.searchusers;
import views.html.admin.searchprofiles;
import views.html.export;
import views.html.manager.manager;
import views.html.admin.admin;
import views.html.admin.usermaint;
import views.html.admin.getuser;
import views.html.admin.showuser;
import views.html.admin.showprofile;
import views.html.admin.displayuser;
import views.html.admin.openuser;
import views.html.admin.saveduser;
import views.html.admin.deleteconfirm;
import views.html.admin.deleteduser;
import views.html.admin.deleteprofconfirm;
import views.html.admin.deletedprofile;
import views.html.admin.profilesaved;
import views.html.exportready;
import views.html.user.user;

/**
 * Login and Logout. User: yesnault
 */
public class Application extends Controller {

	public static Result GO_ADMIN = redirect(routes.Application.adminHome());

	public static Result GO_DASHBOARD = redirect(routes.Dashboard.index());

	public static Result GO_HOME = redirect(routes.Application.index());

	public static Result GO_MANAGER = redirect(routes.Application.managerHome());

	public static Result GO_USER = redirect(routes.Application.userHome());

	public static Result USER_LOGIN = redirect(routes.Application.openLogin());

	public static Result ACCESS_DENIED = redirect(routes.Application.accessDenied());

	@Inject
	MailerClient mailerClient;

	public static class AdminRegister {

		public String approved;

		@Constraints.Required
		public String email;

		@Constraints.Required
		public String fullname;

		public String inputPassword;

		public String role;

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}

		public String validate() {
			if (isBlank(email)) {
				return "Email is required";
			}

			if (isBlank(fullname)) {
				return "User name is required";
			}

			return null;
		}
	}

	public static class FindUser {

		public String approved;

		public String email;

		public String fullname;

		public String role;

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}

		public String validate() {

			User user = User.findByEmail(email);
			if (user != null) {
				// Open user record...
				return null;
			} else {
				// Display message...
				return Messages.get("search.user.bademail");
			}
		}

	}

	/**
	 * Login class used by Login Form.
	 */
	public static class Login {

		@Constraints.Required
		public String email;
		String errMessage = "";

		@Constraints.Required
		public String password;

		/**
		 * Validate the authentication.
		 *
		 * @return null if validation ok, string with details otherwise
		 */
		public String validate() {
			Logger.debug("Login - validate()");
			User user = null;
			try {
				user = User.authenticate(email, password);
				SessionData createUserSession = AccessMiddleware.createUserSession(user);
				AuditLog.setLog(user.fullname, user.getEmail(), "Login", "validate()", "User authenticated", user.fullname);
			} catch (AppException e) {
				errMessage = Messages.get("error.technical");
				return errMessage;
			}
			if (user == null) {
				errMessage = Messages.get("invalid.user.or.password");
				return errMessage;
			} else if (!user.validated) {
				errMessage = Messages.get("account.not.validated.check.mail");
				return errMessage;
			}
			return null;
		}

	}

	public static class ProfileRegister {

		@Constraints.Required
		public String name;
		
		@Constraints.Required
		public String address;

		public String address1;

		@Constraints.Required
		public String city;
		
		@Constraints.Required
		public String state;

		@Constraints.Required
		public String zip;

		@Constraints.Required
		public String country;
		
		@Constraints.Required
		public String county;
		
		@Constraints.Required
		public String billname;
		
		@Constraints.Required
		public String billaddress;

		public String billaddress1;

		@Constraints.Required
		public String billcity;
		
		@Constraints.Required
		public String billstate;

		@Constraints.Required
		public String billzip;

		@Constraints.Required
		public String billcountry;
		
		@Constraints.Required
		public String billcounty;

		@Constraints.Required
		public String primaryEmail;

		@Constraints.Required
		public String primaryNameFirst;

		@Constraints.Required
		public String primaryNameLast;

		@Constraints.Required
		public String primaryPhone;

		@Constraints.Required
		public String secondaryEmail;

		@Constraints.Required
		public String secondaryNameFirst;

		@Constraints.Required
		public String secondaryNameLast;

		@Constraints.Required
		public String secondaryPhone;

		@Constraints.Required
		public String services;

		public String servicesOther;
		
		public Date dateCreation;

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}

		/**
		 * Validate the authentication.
		 *
		 * @return null if validation ok, string with details otherwise
		 */
		public String validate() {
			if (isBlank(name)) {
				return "Business Name is required";
			}

			if (isBlank(address)) {
				return "Business Address 1 is required";
			}

			if (isBlank(city)) {
				return "Business Address City is required";
			}

			if (isBlank(state)) {
				return "Business Address State is required";
			}

			if (isBlank(zip)) {
				return "Business Address Zip is required";
			}

			if (isBlank(country)) {
				return "Business Address Country is required";
			}
			
			if (isBlank(county)) {
				return "Business Address County is required";
			}

			if (isBlank(billname)) {
				return "Billing Name is required";
			}
			
			if (isBlank(billaddress)) {
				return "Billing Address 1 is required";
			}

			if (isBlank(billcity)) {
				return "Billing Address City is required";
			}

			if (isBlank(billstate)) {
				return "Billing Address State is required";
			}

			if (isBlank(billzip)) {
				return "Billing Address Zip is required";
			}

			if (isBlank(billcountry)) {
				return "Billing Address Country is required";
			}
			
			if (isBlank(billcounty)) {
				return "Billing Address County is required";
			}
			
			if (isBlank(primaryNameFirst)) {
				return "Business Hours Contact First Name is required";
			}

			if (isBlank(primaryNameLast)) {
				return "Business Hours Contact Last Name is required";
			}

			if (isBlank(primaryPhone)) {
				return "Business Hours Contact Phone is required";
			}

			if (isBlank(primaryEmail)) {
				return "Business Hours Contact Email is required";
			}

			if (isBlank(secondaryNameFirst)) {
				return "After Hours Contact First Name is required";
			}

			if (isBlank(secondaryNameLast)) {
				return "After Hours Contact Last Name is required";
			}

			if (isBlank(secondaryPhone)) {
				return "After Hours Contact Phone is required";
			}

			if (isBlank(secondaryEmail)) {
				return "After Hours Contact Email is required";
			}

			if (isBlank(services)) {
				return "Services is required";
			}

			return null;
		}
	}

	public static class Register {

		public String approved;

		@Constraints.Required
		public String email;

		@Constraints.Required
		public String fullname;

		public String agency;

		@Constraints.Required
		public String inputPassword;

		// Custom fields...
		@Constraints.Required
		public String role;

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}

		/**
		 * Validate the authentication.
		 *
		 * @return null if validation ok, string with details otherwise
		 */
		public String validate() {
			if (isBlank(email)) {
				return "Email is required";
			}

			if (isBlank(fullname)) {
				return "User name is required";
			}

			if (isBlank(inputPassword)) {
				return "Password is required";
			} else {
				// Need to make sure we have:
				// 8 characters; 1 Uppercase character; 1 Lowercase character; 1
				// Number; 1 Special Character
				String passwordPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$!%^&+=])(?=\\S+$).{8,}";
				if (!inputPassword.matches(passwordPattern)) {
					return Messages.get("password.message");
				}
			}

			if (isBlank(role)) {
				return "Account Role is required";
			}

			return null;
		}
	}

	/*
	 * public static Result signup2() { return ok("success"); }
	 */

	public static class SaveProfile {

		@Constraints.Required
		public String email;

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}

		public String validate() {
			if (isBlank(email)) {
				return "Email is required";
			} else {
				User user = User.findByEmail(email);
				if (user != null) {
					// Open user record...
					return null;
				} else {
					// Display message...
					return Messages.get("search.user.bademail");
				}
			}
		}

	}

	public Result accessDenied() {

		// Get the current role and compare...
		String roleToDisplay = "";
		RoleType currentRole = AccessMiddleware.getSessionRole();
		if (currentRole != null) {
			roleToDisplay = currentRole.getRoleTextName(currentRole);
		}
		// Direct to access denied...
		return ok(accessdenied.render(roleToDisplay));

	}

	public Result addProfile() {
		List<Service> services = Service.find.all();
		return ok(profile.render(form(ProfileRegister.class), services));
		// return ok(profile.render(form(ProfileRegister.class)));
		/*
		 * @for(service <- servicesList) { <input type='checkbox'
		 * name='servicesThis' value=@service>@service <br> }
		 */
	}

	public Result adminHome() {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			return ok(admin.render(form(Login.class)));
		}
	}

	public Result adminSearch() {
		// NEED TO CORRECT THIS -- NEED NEW ROUTE/VIEW
		List<User> users = User.find.all();
		return ok(searchusers.render(form(Login.class), users));
	}

	/**
	 * Handle login form submission.
	 *
	 * @return Dashboard if auth OK or login form if auth KO
	 */
	public Result authenticate() {
		String errorMessage = "";

		Form<Login> loginForm = form(Login.class).bindFromRequest();
		Logger.debug("authenticate");
		Form<Register> registerForm = form(Register.class);

		if (loginForm.hasErrors()) {
			Logger.debug("authenticate - bad request");
			// return badRequest(index.render(registerForm, loginForm));
			return badRequest(auth.render(loginForm));
			// return badRequest(index.render());
			// return badRequest();
		} else {
			Logger.debug("authenticate - good request");
			session("email", loginForm.get().email);

			boolean isAuth = AccessMiddleware.isAuthenticated();
			RoleType role = AccessMiddleware.getSessionRole();

			switch (role.toString()) {
			case "1":
				return GO_USER;

			case "2":
				return GO_MANAGER;

			case "3":
				return GO_ADMIN;

			default:
				return GO_HOME;

			}

		}
	}

	public Result deleteProfile(String name) {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			// Locate the profile record and delete...
			Profile profile = Profile.findByName(name);

			if (profile != null) {
				// Open profile record...
				Logger.debug("Application.deleteProfile: Found Profile based on " + name);
			} else {
				// Display message...
				Logger.debug("Application.deleteProfile: No Profile found based on " + name);
			}

			// Create record in removed profiles table
			// Capture profile and date/time
			// Remove from profile table...
			RemovedProfile removedProfile = new RemovedProfile();

			// Copy the record over...
			removedProfile.name = profile.name;
			removedProfile.address = profile.address;
			removedProfile.address1 = profile.address1;
			removedProfile.city = profile.city;
			removedProfile.state = profile.state;
			removedProfile.zip = profile.zip;
			removedProfile.county = profile.county;
			removedProfile.billname = profile.billname;
			removedProfile.billaddress = profile.billaddress;
			removedProfile.billaddress1 = profile.billaddress1;
			removedProfile.billcity = profile.billcity;
			removedProfile.billstate = profile.billstate;
			removedProfile.billzip = profile.billzip;
			removedProfile.billcountry = profile.billcountry;
			removedProfile.billcounty = profile.billcounty;
			removedProfile.primaryNameFirst = profile.primaryNameFirst;
			removedProfile.primaryNameLast = profile.primaryNameLast;
			removedProfile.primaryPhone = profile.primaryPhone;
			removedProfile.primaryEmail = profile.primaryEmail;
			removedProfile.secondaryNameFirst = profile.secondaryNameFirst;
			removedProfile.secondaryNameLast = profile.secondaryNameLast;
			removedProfile.secondaryPhone = profile.secondaryPhone;
			removedProfile.secondaryEmail = profile.secondaryEmail;
			removedProfile.services = profile.services;
			removedProfile.servicesOther = profile.servicesOther;
			removedProfile.dateCreation = profile.dateCreation;
			removedProfile.profilekey = profile.profilekey;
			removedProfile.updatedBy = profile.updatedBy;
			removedProfile.dateUpdated = profile.dateUpdated;
			removedProfile.userkey = profile.userkey;

			// Set custom fields...
			removedProfile.dateRemoved = new Date();
			removedProfile.removedBy = AccessMiddleware.getSessionEmail();
			removedProfile.save();

			// Delete the profile...
			profile.delete();
			
			AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "Profile", "deleteProfile()", "Profile DELETED by Admin", AccessMiddleware.getSessionID());

			return ok(deletedprofile.render());
		}

	}

	public Result deleteProfileConfirm(String name) {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			return ok(deleteprofconfirm.render(name));
		}
	}

	public Result deleteUser(String email) {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			// Locate the user record and delete...
			User user = User.findByEmail(email);

			if (user != null) {
				// Open user record...
				Logger.debug("Application.deleteUser: Found User based on " + email);
			} else {
				// Display message...
				Logger.debug("Application.deleteUser: No User found based on " + email);
			}

			// Create record in removedusers table
			// Capture user and date/time
			// Remove from user table...
			RemovedUser removedUser = new RemovedUser();

			// Copy the record over...
			removedUser.email = user.getEmail();
			removedUser.fullname = user.fullname;
			removedUser.passwordHash = user.passwordHash;
			removedUser.confirmationToken = user.confirmationToken;
			removedUser.dateCreation = user.dateCreation;
			removedUser.active = user.active;
			removedUser.role = user.role;
			removedUser.approved = user.approved;
			removedUser.validated = user.validated;
			removedUser.userkey = user.userkey;
			removedUser.updatedBy = user.updatedBy;
			removedUser.dateUpdated = user.dateUpdated;

			// Set custom fields...
			removedUser.dateRemoved = new Date();
			removedUser.removedBy = AccessMiddleware.getSessionEmail();
			removedUser.save();

			// Delete the user...
			user.delete();

			AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "User", "deleteUser()", "User DELETED by Admin", AccessMiddleware.getSessionID());
			
			return ok(deleteduser.render());
		}

	}

	public Result deleteUserConfirm(String email) {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			return ok(deleteconfirm.render(email));
		}
	}

	public Result displayUser(String actionType) {
		return ok(getuser.render(form(FindUser.class)));
	}

	public Result exportUsers(String whatData) {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true && hasCorrectAccess(RoleType.MANAGER) != true) {
			return ACCESS_DENIED;
		} else {
			List<User> users = null;
			String userRole = "";
			String fileName = "";
			// Download file to "Downloads" folder
			String home = System.getProperty("user.home");
			String fileLocation = home + "\\Downloads\\";
			RoleType role = AccessMiddleware.getSessionRole();
			if (role != null) {
				userRole = role.getRoleTextName(role);
			} else {
				// Will force user back to home page, since no Role was found...
				userRole = "";
			}

			try {
				switch (whatData) {
				case "EMNeedApproval":
					users = User.findUnapprovedEM();
					fileName = "em_need_approval";
					break;
				default:
					users = User.find.all();
					fileName = "all_users";
					break;
				}

				String fileDate = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
				fileName = fileLocation + fileName + "_" + fileDate + ".csv";
				CSVWriter usersWriter = new CSVWriter(new FileWriter(fileName));
				List<String[]> usersArr = new ArrayList<String[]>();
				usersArr.add(new String[] { "ID", "Email", "Role" });

				for (User user : users) {
					usersArr.add(new String[] { user.getFullname(), user.getEmail(),
							user.getRoleNameString(user.getRole().toString()) });
				}

				usersWriter.writeAll(usersArr);
				usersWriter.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			return ok(exportready.render(fileName, userRole));
		}

	}

	public Result exportProfiles(String whatData) {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true && hasCorrectAccess(RoleType.MANAGER) != true) {
			return ACCESS_DENIED;
		} else {
			List<Profile> profiles = null;
			String userRole = "";
			String fileName = "";
			// Download file to "Downloads" folder
			String home = System.getProperty("user.home");
			String fileLocation = home + "\\Downloads\\";
			RoleType role = AccessMiddleware.getSessionRole();
			if (role != null) {
				userRole = role.getRoleTextName(role);
			} else {
				// Will force user back to home page, since no Role was found...
				userRole = "";
			}

			try {
				switch (whatData) {

				default:
					profiles = Profile.find.all();
					fileName = "all_profiles";
					break;
				}

				String fileDate = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
				fileName = fileLocation + fileName + "_" + fileDate + ".csv";
				CSVWriter outputFile = new CSVWriter(new FileWriter(fileName));
				List<String[]> objectArray = new ArrayList<String[]>();
				objectArray.add(new String[] { "Business Name", "Business Address", "Business Address 1",
						"Business City", "Business Zip", "Business Country", "Primary Contact", "Primary Contact Phone",
						"Primary Contact Email", "Secondary Contact", "Secondary Contact Phone",
						"Secondary Contact Email", "Services", "Services Other" });

				for (Profile profile : profiles) {
					objectArray.add(new String[] { profile.name, profile.address, profile.address1, profile.city,
							profile.zip, profile.country, profile.primaryNameFirst + " " + profile.primaryNameLast,
							profile.primaryPhone, profile.primaryEmail,
							profile.secondaryNameFirst + " " + profile.secondaryNameLast, profile.secondaryPhone,
							profile.secondaryEmail, profile.services, profile.servicesOther });
				}

				outputFile.writeAll(objectArray);
				outputFile.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			return ok(exportready.render(fileName, userRole));
		}

	}

	public Result exportOpenFile(String fileName) {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true && hasCorrectAccess(RoleType.MANAGER) != true) {
			return ACCESS_DENIED;
		} else {
			// Open the file that was exported...
			try {
				Desktop.getDesktop().open(new File(fileName));
			} catch (Exception e) {
				e.printStackTrace();
			}

			RoleType role = AccessMiddleware.getSessionRole();
			if (role != null) {
				switch (role.toString()) {
				case "1":
					return GO_USER;

				case "2":
					return GO_MANAGER;

				case "3":
					return GO_ADMIN;

				default:
					return GO_HOME;

				}
			} else {
				return GO_HOME;
			}
		}
	}

	public Result findUser() {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			return ok(getuser.render(form(FindUser.class)));
		}
	}

	public Result getAllProfiles() {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true && hasCorrectAccess(RoleType.MANAGER) != true) {
			return ACCESS_DENIED;
		} else {
			List<Profile> profiles = Profile.find.all();
			List<Service> services = Service.find.all();
			return ok(searchprofiles.render(profiles, services));
		}
	}

	public Result getProfilesByService(String service) {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true && hasCorrectAccess(RoleType.MANAGER) != true) {
			return ACCESS_DENIED;
		} else {
			// Find those profiles that contain the service...
			List<Profile> profiles = null;
			if (service.equals("All")) {
				profiles = Profile.find.all();
			} else {
				profiles = Profile.findAllByService(service);
			}
			List<Service> services = Service.find.all();
			return ok(searchprofiles.render(profiles, services));
		}
	}

	public Result getAllUsers() {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			List<User> users = User.find.all();
			return ok(searchusers.render(form(Login.class), users));
		}
	}

	public Result getProfilesByUser() {
		// Grab the current user's userkey...
		String userkey = AccessMiddleware.getSessionUserKey();
		List<Profile> profiles = Profile.findAllByUserKey(userkey);
		return ok(displayprofiles.render(profiles));
	}

	public Result getUserByEmail() {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();

			if (findUserForm.hasErrors()) {
				Logger.debug("getUserByEmail - errors");
				return badRequest(getuser.render(findUserForm));
			} else {
				// Find user and display...
				Logger.debug("getUserByEmail - good request");
				String email = findUserForm.get().email;
				User user = User.findByEmail(email);
				String name = user.fullname;
				RoleType role = user.role;
				String roleToDisplay = role.getRoleTextName(role);
				return ok(showuser.render(findUserForm, email, name, roleToDisplay));
			}
		}

	}

	public Result getUserByUrl(String email) {
		Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();

		if (findUserForm.hasErrors()) {
			Logger.debug("getUserByUrl - errors");
			return badRequest(getuser.render(findUserForm));
		} else {
			// Find user and display...
			Logger.debug("getUserByUrl - good request");
			User user = User.findByEmail(email);
			String name = user.fullname;
			// String role = user.role;
			RoleType role = user.role;
			String roleToDisplay = role.toString();
			return ok(showuser.render(findUserForm, email, name, roleToDisplay));

		}
	}

	public boolean hasCorrectAccess(RoleType accessRole) {
		// Make sure user has correct role to access...
		// Pass in Role user should have use...
		// Compare with user's current role...

		// Is the user authenticated?
		boolean isAuth = AccessMiddleware.isAuthenticated();
		if (isAuth) {
			// Get the current role and compare...
			RoleType currentRole = AccessMiddleware.getSessionRole();
			if (currentRole == accessRole) {
				// Good to go...
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Display the login page or dashboard if connected
	 *
	 * @return login page or dashboard
	 */
	public Result index() {
		// Check that the email matches a confirmed user before we redirect
		String email = ctx().session().get("email");
		if (email != null) {
			User user = User.findByEmail(email);
			if (user != null && user.validated) {
				boolean isAuth = AccessMiddleware.isAuthenticated();
				if (isAuth) {
					RoleType role = AccessMiddleware.getSessionRole();
					if (role != null) {
						switch (role.toString()) {
						case "1":
							return GO_USER;

						case "2":
							return GO_MANAGER;

						case "3":
							return GO_ADMIN;

						default:
							return GO_HOME;

						}
					} else {
						Logger.debug("Application.index() - No Role - Clearing invalid session credentials");
						session().clear();
						return GO_HOME;
					}
				} else {
					Logger.debug("Application.index() - No user authenticated - Clearing invalid session credentials");
					session().clear();
					return GO_HOME;
				}
			} else {
				Logger.debug("Application.index() - Clearing invalid session credentials");
				session().clear();
			}
		}

		return ok(index.render(form(Register.class), form(Login.class)));
		// return ok(index.render());
	}

	/**
	 * Logout and clean the session.
	 *
	 * @return Index page
	 */
	public Result logout() {
		session().clear();
		flash("success", Messages.get("youve.been.logged.out"));
		return GO_HOME;
	}

	public Result managerHome() {
		return ok(manager.render(form(Login.class)));
	}

	public Result openLogin() {
		boolean isAuth = AccessMiddleware.isAuthenticated();
		if (isAuth) {
			RoleType role = AccessMiddleware.getSessionRole();
			if (role != null) {
				switch (role.toString()) {
				case "1":
					return GO_USER;

				case "2":
					return GO_MANAGER;

				case "3":
					return GO_ADMIN;

				default:
					return GO_HOME;

				}
			} else {
				Logger.debug("Application.index() - No Role - Clearing invalid session credentials");
				session().clear();
				return ok(auth.render(form(Login.class)));
			}
		} else {
			Logger.debug("Application.index() - No user authenticated - Clearing invalid session credentials");
			session().clear();
			return ok(auth.render(form(Login.class)));
		}
	}

	public Result openProfileAdmin(String name) {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			Form<ProfileRegister> profileEntry = form(ProfileRegister.class).bindFromRequest();
			List<Service> services = Service.find.all();
			// Find profile and display...
			Profile profile = Profile.findByName(name);
			// Grab the current services...
			String currentServices = profile.services;
			List<String> selectedServices = new ArrayList<String>(Arrays.asList(currentServices.split(",")));
			return ok(showprofile.render(profileEntry, services, profile, selectedServices));
		}
	}

	public Result openProfile(String name) {
		Form<ProfileRegister> profileEntry = form(ProfileRegister.class).bindFromRequest();
		List<Service> services = Service.find.all();
		// Find profile and display...
		Profile profile = Profile.findByName(name);
		// Grab the current services...
		String currentServices = profile.services;
		List<String> selectedServices = new ArrayList<String>(Arrays.asList(currentServices.split(",")));
		return ok(editprofile.render(profileEntry, services, profile, selectedServices));
		// return ok(showprofile.render(profileEntry, services, profile));
	}

	public Result openUser() {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			return ok(openuser.render());
		}
	}

	public Result openUserAccount(String email) {
		Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();
		User user = User.findByEmail(email);
		String name = user.fullname;

		if (findUserForm.hasErrors()) {
			Logger.debug("Open User Account - errors");
			return badRequest(useraccount.render(findUserForm, email, name));
		} else {
			// Find user and display...
			Logger.debug("Open User Account - good request");
			return ok(useraccount.render(findUserForm, email, name));
		}
	}

	public Result processUserRequest(String actionType) {
		Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();

		String email;
		String name;
		String approved;
		String roleString;
		User user;
		RoleType role;

		switch (actionType) {
		case "find":
			if (findUserForm.hasErrors()) {
				Logger.debug("processUserRequest - errors");
				return badRequest(getuser.render(findUserForm));
			}
			// Find user and display...
			Logger.debug("processUserRequest - good request");
			email = findUserForm.get().email;
			user = User.findByEmail(email);
			name = user.fullname;
			role = user.role;
			roleString = role.toString();
			return ok(showuser.render(findUserForm, email, name, roleString));
		// break;
		case "save":
			if (findUserForm.hasErrors()) {
				Logger.debug("processUserRequest - errors");
				return badRequest(showuser.render(findUserForm, "", "", ""));
			}
			// Find user and save changes...
			Logger.debug("processUserRequest - good request");
			// Get values from the form...
			email = findUserForm.get().email;
			name = findUserForm.get().fullname;
			approved = findUserForm.get().approved;
			roleString = findUserForm.get().role;

			// Let's get the correct user...
			user = User.findByEmail(email);
			user.fullname = name;
			switch (roleString) {
			case "user":
				user.role = RoleType.USER;
				break;
			case "manager":
				user.role = RoleType.MANAGER;
				break;
			case "admin":
				user.role = RoleType.ADMIN;
				break;
			default:
				user.role = RoleType.UNDEFINED;
				break;
			}
			if (approved.equals("approved")) {
				user.approved = "Y";
			} else {
				user.approved = "N";
			}
			// Save the user...
			user.save();

			return ok(saveduser.render());
		// break;
		default:
			return badRequest(getuser.render(findUserForm));
		// break;
		}

	}

	public Result saveProfile() {
		Form<ProfileRegister> profileEntry = form(ProfileRegister.class).bindFromRequest();

		if (profileEntry.hasErrors()) {
			List<Service> services = Service.find.all();
			Logger.debug("Save Profile - errors");
			return badRequest(profile.render(profileEntry, services));
		}
		// Save the profile...
		ProfileRegister profileForm = profileEntry.get();
		Logger.debug("Save Profile - good request");
		Profile profile = new Profile();
		profile.name = profileForm.name;
		profile.address = profileForm.address;
		profile.address1 = profileForm.address1;
		profile.city = profileForm.city;
		profile.state = profileForm.state;
		profile.zip = profileForm.zip;
		profile.country = profileForm.country;
		profile.county = profileForm.county;
		profile.billname = profileForm.billname;
		profile.billaddress = profileForm.billaddress;
		profile.billaddress1 = profileForm.billaddress1;
		profile.billcity = profileForm.billcity;
		profile.billstate = profileForm.billstate;
		profile.billzip = profileForm.billzip;
		profile.billcountry = profileForm.billcountry;
		profile.billcounty = profileForm.billcounty;
		profile.primaryNameFirst = profileForm.primaryNameFirst;
		profile.primaryNameLast = profileForm.primaryNameLast;
		profile.primaryPhone = profileForm.primaryPhone;
		profile.primaryEmail = profileForm.primaryEmail;
		profile.secondaryNameFirst = profileForm.secondaryNameFirst;
		profile.secondaryNameLast = profileForm.secondaryNameLast;
		profile.secondaryPhone = profileForm.secondaryPhone;
		profile.secondaryEmail = profileForm.secondaryEmail;
		profile.services = profileForm.services;
		// profile.services = selectedServices;
		profile.servicesOther = profileForm.servicesOther;
		profile.dateCreation = new Date();
		profile.profilekey = profile.createProfileKey();
		profile.userkey = AccessMiddleware.getSessionUserKey();
		profile.save();

		AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "Profile", "saveProfile()", "New Profile created and saved", AccessMiddleware.getSessionID());
		
		return ok(profilecreated.render());
	}
	
	public void sendMailEMDenied(User user) throws EmailException, MalformedURLException {
		String subject = Messages.get("mail.deny.subject");

		String urlString = "http://" + Configuration.root().getString("server.hostname");
		urlString += "/confirm/" + user.confirmationToken;
		URL url = new URL(urlString); // validate the URL, will throw an
										// exception if bad.
		String message = Messages.get("mail.deny.message", url.toString());

		Mail.Envelop envelop = new Mail.Envelop(subject, message, user.getEmail());
		Mail mailer = new Mail(mailerClient);
		mailer.sendMail(envelop);
	}

	private void sendMailManagerConfirmation(User user) throws EmailException, MalformedURLException {
		String subject = Messages.get("mail.managerconfirm.subject");

		String urlString = "http://" + Configuration.root().getString("server.hostname");
		urlString += "/confirm/" + user.confirmationToken;
		URL url = new URL(urlString); // validate the URL, will throw an
										// exception if bad.
		String message = Messages.get("mail.managerconfirm.message", url.toString());

		Mail.Envelop envelop = new Mail.Envelop(subject, message, user.getEmail());
		Mail mailer = new Mail(mailerClient);
		mailer.sendMail(envelop);
	}
	
	public Result updateProfileAdmin(String name) {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			Form<ProfileRegister> profileEntry = form(ProfileRegister.class).bindFromRequest();

			if (profileEntry.hasErrors()) {
				List<Service> services = Service.find.all();
				Logger.debug("updateProfileAdmin - errors");
				return badRequest(profile.render(profileEntry, services));
			}
			// Save the profile...
			ProfileRegister profileForm = profileEntry.get();
			Logger.debug("updateProfileAdmin - good request");
			Profile profile = Profile.findByName(name);
			profile.name = profileForm.name;
			profile.address = profileForm.address;
			profile.address1 = profileForm.address1;
			profile.city = profileForm.city;
			profile.state = profileForm.state;
			profile.zip = profileForm.zip;
			profile.country = profileForm.country;
			profile.county = profileForm.county;
			profile.billname = profileForm.billname;
			profile.billaddress = profileForm.billaddress;
			profile.billaddress1 = profileForm.billaddress1;
			profile.billcity = profileForm.billcity;
			profile.billstate = profileForm.billstate;
			profile.billzip = profileForm.billzip;
			profile.billcountry = profileForm.billcountry;
			profile.billcounty = profileForm.billcounty;
			profile.primaryNameFirst = profileForm.primaryNameFirst;
			profile.primaryNameLast = profileForm.primaryNameLast;
			profile.primaryPhone = profileForm.primaryPhone;
			profile.primaryEmail = profileForm.primaryEmail;
			profile.secondaryNameFirst = profileForm.secondaryNameFirst;
			profile.secondaryNameLast = profileForm.secondaryNameLast;
			profile.secondaryPhone = profileForm.secondaryPhone;
			profile.secondaryEmail = profileForm.secondaryEmail;
			profile.services = profileForm.services;
			profile.servicesOther = profileForm.servicesOther;
			profile.updatedBy = AccessMiddleware.getSessionEmail();
			profile.dateUpdated = new Date();
			profile.save();

			AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "Profile", "updateProfileAdmin()", "Profile updated by Admin", AccessMiddleware.getSessionID());
						
			return ok(profilesaved.render("admin"));
		}

	}

	public Result updateProfile(String name) {
		Form<ProfileRegister> profileEntry = form(ProfileRegister.class).bindFromRequest();

		if (profileEntry.hasErrors()) {
			List<Service> services = Service.find.all();
			Logger.debug("updateProfile - errors");
			return badRequest(profile.render(profileEntry, services));
		}
		// Save the profile...
		ProfileRegister profileForm = profileEntry.get();
		Logger.debug("updateProfile - good request");
		Profile profile = Profile.findByName(name);
		profile.name = profileForm.name;
		profile.address = profileForm.address;
		profile.address1 = profileForm.address1;
		profile.city = profileForm.city;
		profile.state = profileForm.state;
		profile.zip = profileForm.zip;
		profile.country = profileForm.country;
		profile.county = profileForm.county;
		profile.billname = profileForm.billname;
		profile.billaddress = profileForm.billaddress;
		profile.billaddress1 = profileForm.billaddress1;
		profile.billcity = profileForm.billcity;
		profile.billstate = profileForm.billstate;
		profile.billzip = profileForm.billzip;
		profile.billcountry = profileForm.billcountry;
		profile.billcounty = profileForm.billcounty;
		profile.primaryNameFirst = profileForm.primaryNameFirst;
		profile.primaryNameLast = profileForm.primaryNameLast;
		profile.primaryPhone = profileForm.primaryPhone;
		profile.primaryEmail = profileForm.primaryEmail;
		profile.secondaryNameFirst = profileForm.secondaryNameFirst;
		profile.secondaryNameLast = profileForm.secondaryNameLast;
		profile.secondaryPhone = profileForm.secondaryPhone;
		profile.secondaryEmail = profileForm.secondaryEmail;
		profile.services = profileForm.services;
		profile.servicesOther = profileForm.servicesOther;
		profile.updatedBy = AccessMiddleware.getSessionEmail();
		profile.dateUpdated = new Date();
		profile.save();

		AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "Profile", "updateProfile()", "Profile updated by user", AccessMiddleware.getSessionID());
		
		return ok(profilesaved.render("user"));
	}

	public Result updateUser() {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			String email;
			String name;
			String approved;
			String role;
			User user;

			Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();

			// Get values from the form...
			email = findUserForm.get().email;
			name = findUserForm.get().fullname;
			approved = findUserForm.get().approved;
			role = findUserForm.get().role;

			Logger.debug("Update User");

			if (findUserForm.hasErrors()) {
				Logger.debug("Update User - errors");
				return badRequest(showuser.render(findUserForm, "", "", ""));
			}

			// Find user and save changes...
			Logger.debug("Update User - good request");

			// I know we have the user, but let's make sure we get the correct
			// user...
			user = User.findByEmail(email);
			user.fullname = name;
			switch (role) {
			case "user":
				user.role = RoleType.USER;
				break;
			case "manager":
				user.role = RoleType.MANAGER;
				break;
			case "admin":
				user.role = RoleType.ADMIN;
				break;
			default:
				user.role = RoleType.UNDEFINED;
				break;
			}
			if (approved != null) {
				if (approved.equals("Y")) {
					user.approved = "Y";
					try {
						sendMailManagerConfirmation(user);
					} catch (Exception e) {
						Logger.error("Can't send confirm email to approved emergency manager", e);
						flash("error", Messages.get("error.technical"));
					}
				} else {
					user.approved = "N";
					try {
						sendMailEMDenied(user);
					} catch (Exception e) {
						Logger.error("Can't send deny email to denied emergency manager", e);
						flash("error", Messages.get("error.technical"));
					}
				}
			}

			// Save the user...
			user.updatedBy = AccessMiddleware.getSessionEmail();
			user.dateUpdated = new Date();
			user.save();

			return ok(saveduser.render());
		}

	}

	public Result updateUserAccount() {
		String email;
		String name;
		String approved;
		String role;
		User user;

		Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();

		// Get values from the form...
		email = findUserForm.get().email;
		name = findUserForm.get().fullname;
		Logger.debug("Updating User Account");

		if (findUserForm.hasErrors()) {
			Logger.debug("Update User Account - errors");
			return badRequest(useraccount.render(findUserForm, "", ""));
		}

		// Find user and save changes...
		Logger.debug("Update User Account - good request");

		// I know we have the user, but let's make sure we get the correct
		// user...
		user = User.findByEmail(email);
		user.fullname = name;

		// Save the user...
		user.updatedBy = AccessMiddleware.getSessionEmail();
		user.dateUpdated = new Date();
		user.save();
		
		AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "User Account", "updateUserAccount()", "User account updated", AccessMiddleware.getSessionID());
		
		return ok(saveduser.render());
	}

	public Result userHome() {
		return ok(user.render());
	}

	public Result userMaintenance() {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			return ok(usermaint.render(form(Login.class)));
		}
	}
	
}