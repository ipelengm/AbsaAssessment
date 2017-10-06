/**
 * 
 */
package za.co.absa.AbsaAssessment.services.v1.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import za.co.absa.AbsaAssessment.model.LoginResponse;

/**
 * @author 
 *
 */

@Controller
@RequestMapping("/services/api/")
public class LoginController {

	
	@RequestMapping(method=RequestMethod.GET,  path="v1/user/login/{username}")
    public @ResponseBody LoginResponse login(@PathVariable("username")  String username) {
		
		LoginResponse response = new LoginResponse();
		

		if(!username.equals("ipeleng") ){
			
			response.setStatus(302);
			response.setResult("Please make sure you pass in correct parameters");
			
			return response;
		}
		
		//build response
		response.setStatus(200);
		response.setResult("User successfully logged in");
			
        return response;
    }
	
		
	
}
