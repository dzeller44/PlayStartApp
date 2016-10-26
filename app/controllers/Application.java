package controllers;

import models.User;
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
import com.fasterxml.jackson.databind.node.ObjectNode;

import static play.data.Form.form;

/**
 * Login and Logout. User: yesnault
 */
public class Application extends Controller {

	/*
	public static Result signup2() {
		return ok("success");
	}
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
		//return ok(index.render());
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
				return "Full name is required";
			}

			if (isBlank(inputPassword)) {
				return "Password is required";
			}
			else {
				// Need to make sure we have:
				// 8 characters; 1 Uppercase character; 1 Lowercase character; 1 Number; 1 Special Character
				String passwordPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
				if(!inputPassword.matches(passwordPattern)) {
					return "Password must be 8 characters, contain 1 UPPERCASE character, 1 lowercase character, 1 number, and 1 special character.";
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
			return badRequest(index.render(registerForm, loginForm));
			//return badRequest(index.render());
			//return badRequest();
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

}