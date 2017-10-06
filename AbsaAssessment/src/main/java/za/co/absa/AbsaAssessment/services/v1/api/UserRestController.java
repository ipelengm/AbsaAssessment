package za.co.absa.AbsaAssessment.services.v1.api;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import za.co.absa.AbsaAssessment.users.bo.UserBo;
import za.co.absa.AbsaAssessment.dto.UserResponseDTO;
import za.co.absa.AbsaAssessment.model.User;
import za.co.absa.AbsaAssessment.service.IUserService;
import za.co.absa.AbsaAssessment.services.impl.UserService;

@RestController
public class UserRestController {
	
	
	
	//@Autowired
		private UserBo userDAO;

		
		@RequestMapping(value= "/users")
		public User getCustomers() {
			//userDAO = loadBean();
			return loadBean().findByEmail("dunisanim@mpilotech.co.za");
		}
		
		
		@RequestMapping(method=RequestMethod.PUT, path="v1/user/update")
		public @ResponseBody UserResponseDTO v1UpdateUser(
				@RequestParam("name")  String name,
				@RequestParam("surname")  String surname,
				@RequestParam("country")  String country
				
				
				
				
			 ) {
			
			UserResponseDTO response = new UserResponseDTO();
			IUserService service = new UserService() ;
		
			if(name == null ||surname ==  null ||  country ==  null ){
				response.setStatus(500);
				response.setMessage("Please make sure you pass in correct parameters");
				return response;
			}
			User UserRequest = new User();
			UserRequest.setName(surname);
			UserRequest.setSurname(surname);
			UserRequest.setCountry(country);
					
			
			//build response
			response.setStatus(200);
			response.setMessage("Successfully returned");
			 response.setResult(service.updateUser(UserRequest));
				
	        return response;
		}
		
		public UserBo loadBean(){
			ApplicationContext appContext = 
		    		new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
			
		    	UserBo userBo = (UserBo)appContext.getBean("UserDto");
			
		    	
		    	return userBo;
		}

}
