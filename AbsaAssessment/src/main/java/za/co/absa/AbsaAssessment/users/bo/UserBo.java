package za.co.absa.AbsaAssessment.users.bo;

import za.co.absa.AbsaAssessment.model.User;

public interface UserBo {
	

	User findByEmail(String email);

}
