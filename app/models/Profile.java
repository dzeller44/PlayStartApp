package models;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

import play.Logger;
import play.data.format.Formats;
import play.data.validation.Constraints;

/**
 * @author zellerd
 *
 */
@Entity
public class Profile extends Model {

	@Id
	public Long id;

	@Constraints.Required
	public String name;

	@Constraints.Required
	public String address;

	public String address1;

	@Constraints.Required
	public String city;

	@Constraints.Required
	public String state;

	@Constraints.Required
	public String zip;

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

	public String servicesOther;

	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date dateCreation;
	
	@Constraints.Required
	public String profilekey;
	
	public String userkey;

	public String updatedBy;
	
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date dateUpdated;

    // -- Queries (long id, profile.class)
    public static Model.Finder<Long, Profile> find = new Model.Finder<Long, Profile>(Long.class, Profile.class);
    
    /**
     * Retrieve a profile by business name.
     *
     * @param name to search
     * @return a profile
     */
    public static Profile findByName(String name) {
        return find.where().eq("name", name).findUnique();
    }
    
	public String createProfileKey() {
		String profileKey = UUID.randomUUID().toString().replaceAll("-", "");

		// Make sure it is unique...
		Boolean isUnique = false;
		while (!isUnique) {
			Profile profile = Profile.findByProfileKey(profileKey);
			if (profile != null) {
				// Found profile, not unique...
				Logger.debug("Profile.createprofileKey: profile Key " + profileKey + " is not unique, creating a new one...");
			} else {
				// profile Key is unique...
				Logger.debug("Profile.createprofileKey: profile Key " + profileKey + " is unique.");
				isUnique = true;
			}
		}

		return profileKey;
	}

	/**
	 * Retrieves a user by unique user key.
	 *
	 * @param unique
	 *            user key.
	 * @return a user if the unique user key is found, null otherwise.
	 */
	public static Profile findByProfileKey(String profileKey) {
		return find.where().eq("profilekey", profileKey).findUnique();
	}
	
}
