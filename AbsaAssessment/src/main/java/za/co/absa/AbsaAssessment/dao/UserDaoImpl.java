package za.co.absa.AbsaAssessment.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import za.co.absa.AbsaAssessment.model.User;
import za.co.absa.AbsaAssessment.utils.CustomHibernateDaoSupport;





@Repository("userDAO")
public class UserDaoImpl extends CustomHibernateDaoSupport implements UserDAO {
	
	public User findByEmail(String email){
		List list = getHibernateTemplate().find("from User where email=?",email);
		return (User)list.get(0);
	}

	@Override
	public void update(User user) {
		getHibernateTemplate().update(user);
		
	}

}
