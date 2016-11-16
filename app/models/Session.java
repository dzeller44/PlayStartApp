package models;

import play.data.validation.Constraints;
import com.avaje.ebean.Model;
import utils.Crypto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Session  extends Model {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="hash")
    @Constraints.MinLength(10)
    private String hash;

    @Column(name="user_id")
    private String userId;
    
    @Column(name="email")
    private String email;

    @Column(name="expiration_date")
    private Date expirationDate = new Date();

    @Column(name="data")
    @Constraints.MinLength(10)
    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getData() {
        return  Crypto.decryptData(data);
    }

    public void setData(String data) {
        this.data = Crypto.encryptData(data);
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
