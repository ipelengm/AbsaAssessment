package za.co.absa.AbsaAssessment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ 
	@NamedQuery(name = "query_find_all_users",  query = "select u from User u" ),
	@NamedQuery(name = "query_username_and_pass", query = "select u from User u where u.username=?1 and u.password=?2"),
	@NamedQuery(name = "query_by_username",	 query = "select u from User u where u.username=?1")
})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String country;
	@Column(unique=true)
	private String username;
	private String password;

	public User() {
	}

	public User(String firstName, String lastName, String country, String username,String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("User[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

	// end::sample[]

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCountry() {
		return country;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}