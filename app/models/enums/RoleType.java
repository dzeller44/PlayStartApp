/**
 * 
 */
package models.enums;

import com.avaje.ebean.annotation.EnumValue;

/**
 * @author zellerd
 *
 */
public enum RoleType {
	@EnumValue("0")
	UNDEFINED(0), @EnumValue("1")
	USER(1), @EnumValue("2")
	MANAGER(2), @EnumValue("3")
	ADMIN(3);

	// private static RoleType[] values = null;

	// private int value;
	// private String name;

	// USER, MANAGER, ADMIN
	// Role
	private int value;

	// private static HashMap<Integer, AnswerAttr> reverse = new
	// HashMap<Integer, AnswerAttr>() {{
	// put(0, UNDEFINED);
	// put(1, FEATURE_REGULAR);
	// put(2, FEATURE_ACTUAL);
	// put(3, FEATURE_POTENTIAL);
	// }};

	RoleType(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	// @NotNull
	// public static AnswerAttr getAttrByValue(Integer value) {
	// return Optional.fromNullable(reverse.get(value)).or(UNDEFINED);
	// }

	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
	public String getRoleTextName(RoleType role) {
		String roleName;
		
		switch (role.toString()) {
		case "1":
			roleName = "user";
			break;
		case "2":
			roleName = "manager";
			break;
		case "3":
			roleName = "admin";
			break;
		default:
			roleName = "undefined";
			break;
		}
		
		return roleName;
	}
	
	public static String getRoleTextNameString(String role) {
		String roleName;
		
		switch (role) {
		case "1":
			roleName = "user";
			break;
		case "2":
			roleName = "manager";
			break;
		case "3":
			roleName = "admin";
			break;
		default:
			roleName = "undefined";
			break;
		}
		
		return roleName;
	}
}
