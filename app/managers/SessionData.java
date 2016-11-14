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
	private Long userId;

	/**
	 * 
	 * @return
	 */
	public Long getUserId() {
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

        sessionData.setUserId(user.getId());
        sessionData.setEmail(user.getEmail());
//        sessionData.setUserRole(user.getRole());
		
		
        return sessionData;
	}


	private void setUserId(Long id) {
		userId = id;
	}


	public static SessionData getNew() {
		return new SessionData();
	}

}
