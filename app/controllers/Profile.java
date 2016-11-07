package controllers;

import static play.data.Form.form;
import controllers.Application.Login;
import play.data.validation.Constraints;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.profile;

/**
 * @author zellerd
 *
 */
public class Profile extends Controller {
	
	
	public static class Register {

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
	
	public Result addProfile() {
		return ok(profile.render(form(Register.class)));
	}

}
