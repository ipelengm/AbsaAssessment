package za.co.absa.AbsaAssessment.dao;

import za.co.absa.AbsaAssessment.model.User;

public interface UserDAO {
	
	void update(User user);
	
	User findByEmail(String email);

}
