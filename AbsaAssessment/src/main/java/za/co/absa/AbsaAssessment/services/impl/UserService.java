package za.co.absa.AbsaAssessment.services.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import za.co.absa.AbsaAssessment.model.User;
import za.co.absa.AbsaAssessment.service.IUserService;

public class UserService implements IUserService{
	
	

	@Override
	public List<User> updateUser(User request) {
		
		
		List<User> users = new ArrayList<User>();
		//users.add(TempEmpData.Users);
		
		User newUserData = new User();
		newUserData.setName(request.getName());
		newUserData.setSurname(request.getSurname());
		newUserData.setCountry(request.getCountry());
		
		users.add(newUserData);
		
		return users;
		
	}

}
