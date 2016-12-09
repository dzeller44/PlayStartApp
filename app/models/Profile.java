package models;

import java.util.Date;
import java.util.List;
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
	public String country;
	
	@Constraints.Required
	public String county;

	@Constraints.Required
	public String billname;
	
	@Constraints.Required
	public String billaddress;

	public String billaddress1;

	@Constraints.Required
	public String billcity;

	@Constraints.Required
	public String billstate;

	@Constraints.Required
	public String billzip;
	
	@Constraints.Required
	public String billcountry;
	
	@Constraints.Required
	public String billcounty;

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
	
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date dateRemind;

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
		String profileKey = null;

		// Make sure it is unique...
		profileKey = UUID.randomUUID().toString().replaceAll("-", "");
		Boolean isUnique = false;
		while (!isUnique) {
			Profile profile = Profile.findByProfileKey(profileKey);
			if (profile != null) {
				// Found profile, not unique...
				Logger.debug("Profile.createprofileKey: profile Key " + profileKey + " is not unique, creating a new one...");
				profilekey = UUID.randomUUID().toString().replaceAll("-", "");
			} else {
				// profile Key is unique...
				Logger.debug("Profile.createprofileKey: profile Key " + profileKey + " is unique.");
				isUnique = true;
			}
		}

		return profileKey;
	}

	/**
	 * Retrieves a profile by unique profile key
	 *
	 * @param unique profile key
	 * @return a profile if the unique profile key is found, null otherwise.
	 */
	public static Profile findByProfileKey(String profileKey) {
		return find.where().eq("profilekey", profileKey).findUnique();
	}
	
	/**
	 * Retrieves a profile by unique user key
	 *
	 * @param unique user key
	 * @return a profile if the unique user key is found, null otherwise.
	 */
	public static List<Profile> findAllByUserKey(String userkey) {
		return find.where().eq("userkey", userkey).findList();
	}
	
	/**
	 * Retrieves profiles that contain a service.
	 *
	 * @param service
	 * @return profiles if the service is found, null otherwise.
	 */
	public static List<Profile> findAllByService(String service) {
		return find.where().contains("services", service).findList();
	}
	
	/**
	 * @param county
	 * @return profiles if the county is found, null otherwise.
	 */
	public static List<Profile> findAllByCounty(String county) {
		return find.where().eq("county", county).findList();
	}
	
}
