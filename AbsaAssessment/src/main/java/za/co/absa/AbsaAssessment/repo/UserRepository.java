package za.co.absa.AbsaAssessment.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import za.co.absa.AbsaAssessment.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByUsername(String username);
	
}
