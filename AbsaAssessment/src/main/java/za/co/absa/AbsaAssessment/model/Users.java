package za.co.absa.AbsaAssessment.model;

public class Users {
	
	private String FirstName;
	private String LastName;
	private String Country;
	
	
	
	
	
	
	
	
	public Users() {
		
	}
	public Users(String firstName, String lastName, String country) {
		
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Country = country;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	

}
