/**
 * 
 */
package managers;

import models.User;
//import models.enums.RoleType;

/**
 * @author rhelton
 *
 */
public class SessionData {

	private String email;
	private String userId;
	private String userkey;

	/**
	 * 
	 * @return
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public static SessionData createFromUser(User user) {
        //store user session
        SessionData sessionData = new SessionData();
        
        sessionData.setUserId(user.getFullname());
        sessionData.setEmail(user.getEmail());
        sessionData.setUserkey(user.getUserkey());
//        sessionData.setUserRole(user.getRole());
		
		
        return sessionData;
	}


	private void setUserId(String id) {
		userId = id;
	}


	public static SessionData getNew() {
		return new SessionData();
	}

	public String getUserkey() {
		return userkey;
	}

	public void setUserkey(String userkey) {
		this.userkey = userkey;
	}

}
