/**
 * 
 */
package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avaje.ebean.*;

import models.enums.RoleType;
import play.mvc.Http;

/**
 * @author rhelton
 *
 */
@Entity
@Table(name = "audit_log")
public class AuditLog {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "role")
	private String role;

	@Column(name = "context")
	private String context;

	@Column(name = "screen")
	private String screen;

	@Column(name = "field")
	private String field;

	@Column(name = "value")
	private String value;

	@Column(name = "ip")
	private String ip;

	@Column(name = "created")
	private Date created;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the context
	 */
	public String getContext() {
		return context;
	}

	/**
	 * @param context
	 *            the context to set
	 */
	public void setContext(String context) {
		this.context = context;
	}

	/**
	 * @return the screen
	 */
	public String getScreen() {
		return screen;
	}

	/**
	 * @param screen
	 *            the screen to set
	 */
	public void setScreen(String screen) {
		this.screen = screen;
	}

	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}

	/**
	 * @param field
	 *            the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip
	 *            the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * 
	 * @param userId
	 * @param context
	 * @param screen
	 * @param field
	 * @param value
	 */
	public static void setLog(Integer userId, String context, String screen, String field, String value) {
		setLog(userId, context, screen, field, value, Http.Context.current().request().remoteAddress());
	}
	public static void setLog(Long userId, String context, String screen, String field, String value) {
		
		Integer id = userId.intValue();
		setLog(id, context, screen, field, value, Http.Context.current().request().remoteAddress());
	}

	
	/**
	 * 
	 * @param userId
	 * @param context
	 * @param screen
	 * @param field
	 * @param value
	 * @param ip
	 */
	public static void setLog(Integer userId, String context, String screen, String field, String value, String ip) {
		RoleType role = null;

		if (role == null) {
			User user = Ebean.find(models.User.class).where().eq("id", userId).findUnique();
			if (user != null)
				role = user.getRole();
			else
				role = null;
		}

		AuditLog log = new AuditLog();
		log.setUserId(userId);
		log.setRole(role.toString());
		log.setContext(context);
		log.setScreen(screen);
		log.setField(field);
		log.setValue(value);
		log.setCreated(new Date());
		log.setIp(ip);
		Ebean.save(log);
		
	}
}
