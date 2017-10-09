package za.co.absa.AbsaAssessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import za.co.absa.AbsaAssessment.model.User;
import za.co.absa.AbsaAssessment.service.UserService;

@Controller    
@RequestMapping(path="/api") 
public class UserController {
	//@Autowired 
	//private UserRepository userRepository;
	@Autowired 
	private UserService  userService;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewUser (
			  @RequestParam String firstname,
			  @RequestParam String lastname,
			  @RequestParam String country,
			  @RequestParam String username,
			  @RequestParam String password) {
		
		
		User newuser= new User();
		newuser.setFirstName(firstname);
		newuser.setLastName(lastname);
		newuser.setCountry(country);
		newuser.setUsername(username);
		newuser.setPassword(password);		
		userService.insert(newuser);
		return "user added";
	}
	
	@PutMapping(path="/update")
	public @ResponseBody String updateUser (
			  @RequestParam String firstname,
			  @RequestParam String lastname,
			  @RequestParam String country,
			  @RequestParam String username)
			  {
		
		
		User newuser= new User();
		newuser.setFirstName(firstname);
		newuser.setLastName(lastname);
		newuser.setCountry(country);
		newuser.setUsername(username);

	
		userService.update(newuser);
		return "details updated";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userService.findAll();
	}
}

