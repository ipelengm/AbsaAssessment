package za.co.absa.AbsaAssessment.dto;

import java.util.ArrayList;
import java.util.List;

import za.co.absa.AbsaAssessment.model.User;

public class UserResponseDTO {

	
	private int status;
	private String message;
	private List<User> result = new ArrayList<User>();
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<User> getResult() {
		return result;
	}
	public void setResult(List<User> result) {
		this.result = result;
	}
}
