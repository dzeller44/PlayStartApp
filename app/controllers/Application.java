package controllers;

import models.User;
import models.enums.RoleType;
import models.utils.AppException;
import play.Logger;
import play.data.Form;
import play.data.validation.Constraints;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.Json;
import views.html.index;
import views.html.auth;
import views.html.admin.searchusers;
import views.html.export;
import views.html.manager.manager;
import views.html.admin.admin;
import views.html.admin.usermaint;
import views.html.admin.getuser;
import views.html.admin.showuser;
import views.html.admin.openuser;
import views.html.user.user;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.node.ObjectNode;

import static play.data.Form.form;

import java.util.List;

/**
 * Login and Logout. User: yesnault
 */
public class Application extends Controller {

	/*
	 * public static Result signup2() { return ok("success"); }
	 */

	public static Result GO_HOME = redirect(routes.Application.index());

	public static Result GO_DASHBOARD = redirect(routes.Dashboard.index());

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
				return GO_DASHBOARD;
			} else {
				Logger.debug("Clearing invalid session credentials");
				session().clear();
			}
		}

		return ok(index.render(form(Register.class), form(Login.class)));
		// return ok(index.render());
	}

	/**
	 * Login class used by Login Form.
	 */
	public static class Login {

		@Constraints.Required
		public String email;
		@Constraints.Required
		public String password;

		String errMessage = "";

		/**
		 * Validate the authentication.
		 *
		 * @return null if validation ok, string with details otherwise
		 */
		public String validate() {
			System.out.println("Login - validate()");
			User user = null;
			try {
				user = User.authenticate(email, password);
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

	public static class Register {

		@Constraints.Required
		public String email;

		@Constraints.Required
		public String fullname;

		@Constraints.Required
		public String inputPassword;

		// Custom fields...
		@Constraints.Required
		public String role;
		
		public String approved;

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

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}
	}
	
	public static class AdminRegister {

		@Constraints.Required
		public String email;

		@Constraints.Required
		public String fullname;

		public String inputPassword;

		public String role;
		
		public String approved;
		
		public String validate() {
			if (isBlank(email)) {
				return "Email is required";
			}

			if (isBlank(fullname)) {
				return "User name is required";
			}

			return null;
		}

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}
	}
	
	public static class ProfileRegister {

		@Constraints.Required
		public String name;
		
		@Constraints.Required
		public String address;
		
		@Constraints.Required
		public String city;
		
		@Constraints.Required
		public String state;
		
		@Constraints.Required
		public String zip;
		
		@Constraints.Required
		public String country;
		
		@Constraints.Required
		public String primaryNameFirst;
		
		@Constraints.Required
		public String primaryNameLast;
		
		@Constraints.Required
		public String primaryPhone;
		
		@Constraints.Required
		public String primaryEmail;
		
		@Constraints.Required
		public String secondaryNameFirst;
		
		@Constraints.Required
		public String secondaryNameLast;
		
		@Constraints.Required
		public String secondaryPhone;
		
		@Constraints.Required
		public String secondaryEmail;
		
		@Constraints.Required
		public String services;
		
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
			
			if (isBlank(primaryNameFirst)) {
				return "Primary Contact First Name is required";
			}
			
			if (isBlank(primaryNameLast)) {
				return "Primary Contact Last Name is required";
			}
			
			if (isBlank(primaryPhone)) {
				return "Primary Contact Phone is required";
			}
			
			if (isBlank(primaryEmail)) {
				return "Primary Contact Email is required";
			}

			if (isBlank(secondaryNameFirst)) {
				return "Secondary Contact First Name is required";
			}
			
			if (isBlank(secondaryNameLast)) {
				return "Secondary Contact Last Name is required";
			}
			
			if (isBlank(secondaryPhone)) {
				return "Secondary Contact Phone is required";
			}
			
			if (isBlank(secondaryEmail)) {
				return "Secondary Contact Email is required";
			}
			
			if (isBlank(services)) {
				return "Services is required";
			}

			return null;
		}

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}
	}

	/**
	 * Handle login form submission.
	 *
	 * @return Dashboard if auth OK or login form if auth KO
	 */
	public Result authenticate() {
		String errorMessage = "";

		Form<Login> loginForm = form(Login.class).bindFromRequest();
		System.out.println("authenticate");
		Form<Register> registerForm = form(Register.class);

		if (loginForm.hasErrors()) {
			System.out.println("authenticate - bad request");
			// return badRequest(index.render(registerForm, loginForm));
			return badRequest(auth.render(loginForm));
			// return badRequest(index.render());
			// return badRequest();
		} else {
			System.out.println("authenticate - good request");
			session("email", loginForm.get().email);
			return GO_DASHBOARD;
		}
	}

	public Result openLogin() {
		System.out.println("openLogin");
		return ok(auth.render(form(Login.class)));
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

	public Result adminHome() {
		return ok(admin.render(form(Login.class)));
	}
	
	public Result userHome() {
		return ok(user.render());
	}

	public Result userMaintenance() {
		return ok(usermaint.render(form(Login.class)));
	}

	public Result adminSearch() {
		// NEED TO CORRECT THIS -- NEED NEW ROUTE/VIEW
		List<User> users = User.find.all();
		return ok(searchusers.render(form(Login.class), users));
	}
	
	public Result getAllUsers() {
		List<User> users = User.find.all();
		return ok(searchusers.render(form(Login.class), users));
	}
	
	public Result exportData() {
		return ok(export.render(form(Login.class)));
	}

	public Result findUser() {
		return ok(getuser.render(form(FindUser.class)));
	}
	
	public Result openUser() {
		return ok(openuser.render());
	}

	public static class FindUser {

		@Constraints.Required
		public String email;

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

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}

	}

	public Result getUserByEmail() {
		Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();

		if (findUserForm.hasErrors()) {
			System.out.println("Find User - errors");
			return badRequest(getuser.render(findUserForm));
		} else {
			// Find user and display...
			System.out.println("Find User - good request");
			String email = findUserForm.get().email;
			User user = User.findByEmail(email);
			String name = user.fullname;
			//String role = user.role;
			RoleType role = user.role;
			String roleToDisplay = role.toString();
			return ok(showuser.render(findUserForm, email, name, roleToDisplay));

		}

	}
	
	public Result getUserByUrl(String email) {
		Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();

		if (findUserForm.hasErrors()) {
			System.out.println("Find User - errors");
			return badRequest(getuser.render(findUserForm));
		} else {
			// Find user and display...
			System.out.println("Find User - good request");
			User user = User.findByEmail(email);
			String name = user.fullname;
			//String role = user.role;
			RoleType role = user.role;
			String roleToDisplay = role.toString();
			return ok(showuser.render(findUserForm, email, name, roleToDisplay));

		}

	}
	

}