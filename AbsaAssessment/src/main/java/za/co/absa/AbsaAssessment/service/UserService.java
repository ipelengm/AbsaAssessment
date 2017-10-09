package za.co.absa.AbsaAssessment.service;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import za.co.absa.AbsaAssessment.model.User;

@Repository
@Transactional
public class UserService {

	@PersistenceContext
	private EntityManager entityManager;

	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}

	public long update(User user) {
		
		System.out.println("Username: " + user.getUsername());

		User updatedUser = findUserByUsername(user.getUsername());

		updatedUser.setFirstName(user.getFirstName());
		updatedUser.setLastName(user.getLastName());
		updatedUser.setCountry(user.getCountry());
		
		
		updatedUser = entityManager.merge(updatedUser);
		entityManager.flush();

		return updatedUser.getId();
	}
    
	public User findUserByUsername(String pUsername) {
	     TypedQuery<User> query = entityManager.createNamedQuery("query_by_username", User.class);
	  query.setParameter(1, pUsername);
	  List<User> users = query.getResultList();
	  
	  return users.get(0);

	}
	public User findUserById(Long id) {
		return entityManager.find(User.class, id);
	}

	public User find(long id) {
		return entityManager.find(User.class, id);
	}

	public List<User> findAll() {
		Query query = (Query) entityManager.createNamedQuery("query_find_all_users", User.class);
		return ((TypedQuery<User>) query).getResultList();
	}
}
