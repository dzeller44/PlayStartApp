/**
 * 
 */
package controllers.helpers;

import java.util.List;

import javax.annotation.Nullable;

import com.avaje.ebean.Ebean;
import com.google.common.base.Optional;

import managers.SessionData;
import managers.SessionManager;
import models.User;
import models.enums.RoleType;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Http;

/**
 * @author rhelton
 *
 */
public class AccessMiddleware extends Controller {

	/**
	 * 
	 * @param sessionData
	 * @return
	 */
	protected static boolean isAuthenticated(@Nullable SessionData sessionData) {
		if (sessionData == null)
			return false;

		User user = Ebean.find(models.User.class).where().eq("id", sessionData.getUserId()).findUnique();
		Integer userId = 0;
		if (user != null) {
			userId = user.getId().intValue();
		}
		return userId != 0;
	}

	/**
	 * Return true if user have session
	 * 
	 * @return boolean value
	 */
	public static boolean isAuthenticated() {
		SessionData sessionData = SessionManager.getSessionData(session());
		return isAuthenticated(sessionData);
	}

	/**
	 * Return String role
	 * 
	 * @return boolean value
	 */
	public static RoleType getSessionRole() {
		SessionData sessionData = SessionManager.getSessionData(session());
		User user = Ebean.find(models.User.class).where().eq("id", sessionData.getUserId()).findUnique();
		if (user == null)
			return null;
		return user.getRole();
	}

	/**
	 * 
	 * @param user
	 * @return
	 */
	public static SessionData createUserSession(User user) {
		// Logger.debug("createUserSession(User user)--->"+user.getEmail());
		SessionData sessionData = SessionData.createFromUser(user);
		Http.Session session = session();

		SessionManager.putSessionData(session, sessionData, user.getId());

		return sessionData;
	}

}
