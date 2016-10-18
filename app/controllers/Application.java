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

		//return ok(index.render(form(Register.class), form(Login.class)));
		return ok(index.render());
	}

	/**
	 * Login class used by Login Form.
	 */
	public static class Login {

		@Constraints.Required
		public String email;
		@Constraints.Required
		public String password;

		/**
		 * Validate the authentication.
		 *
		 * @return null if validation ok, string with details otherwise
		 */
		public String validate() {

			User user = null;
			try {
				user = User.authenticate(email, password);
			} catch (AppException e) {
				return Messages.get("error.technical");
			}
			if (user == null) {
				return Messages.get("invalid.user.or.password");
			} else if (!user.validated) {
				return Messages.get("account.not.validated.check.mail");
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
		Form<Login> loginForm = form(Login.class).bindFromRequest();
		System.out.println("authenticate");
		Form<Register> registerForm = form(Register.class);

		if (loginForm.hasErrors()) {
			System.out.println("authenticate - bad request");
			return badRequest(index.render());
			//return badRequest();
		} else {
			System.out.println("authenticate - good request");
			session("email", loginForm.get().email);
			return GO_DASHBOARD;
		}
	}
	
	public Result openLogin() {
		System.out.println("openLogin");
		return ok(auth.render());
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