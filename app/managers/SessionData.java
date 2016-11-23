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
	public static SessionData getNew() {
		return new SessionData();
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
	 * @return
	 */
	public String getUserId() {
		return userId;
	}


	public String getUserkey() {
		return userkey;
	}


	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	private void setUserId(String id) {
		userId = id;
	}

	public void setUserkey(String userkey) {
		this.userkey = userkey;
	}

}
