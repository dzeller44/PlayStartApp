package models;

import models.utils.AppException;
import models.utils.Hash;
import play.data.format.Formats;
import play.data.validation.Constraints;
import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

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
	
	public String userkey;


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

}
