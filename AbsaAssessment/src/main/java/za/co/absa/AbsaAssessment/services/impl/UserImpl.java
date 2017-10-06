package za.co.absa.AbsaAssessment.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import za.co.absa.AbsaAssessment.model.User;
import za.co.absa.AbsaAssessment.dao.UserDAO;
import za.co.absa.AbsaAssessment.utils.CustomHibernateDaoSupport;


@Repository("userDAO")
public class UserImpl extends CustomHibernateDaoSupport implements UserDAO {

	@Autowired
	UserDAO userDao;
	
	
	public void update(User user){
		getHibernateTemplate().update(user);
	}

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	
	}
	
}
