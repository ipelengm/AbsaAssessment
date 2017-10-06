package za.co.absa.AbsaAssessment.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import za.co.absa.AbsaAssessment.users.bo.UserBo;
import za.co.absa.AbsaAssessment.model.User;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	
    	UserBo userBo = (UserBo)appContext.getBean("UserDto");
    	
    	
    	
    	/** select **/
    	User getuser = userBo.findByEmail("dunisanim@mpilotech.co.za");
    	System.out.println(getuser);
    	
    	
    	
    	
    	
    	System.out.println("Done");
    }
}
