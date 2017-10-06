package za.co.absa.AbsaAssessment.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user", catalog = "AbsaAssessment", uniqueConstraints = {
		@UniqueConstraint(columnNames = "EMAIL")})
public class User implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer userId;
	private String name;
	private String surname;
	private String country;
	private String email;

	public User() {
	}

	public User(String name, String surname, String country, String email) {
		this.setName(name);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "EMAIL", unique = true, nullable = false)
	public String getEmail() {
		return this.email;
	}


	@Override
	public String toString() {
		return "User [Name=" + name + ", surname=" + surname
				+ ", email=" + email + "]";
	}

	public Integer getUserId() {
		return userId;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
