package api.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndpoints;
import api.payload.User;
import io.restassured.response.Response;

public class UserTests {
	

	Faker faker;
	User userPayload;
	
	public Logger logger;
	
	@BeforeClass
	public void setupData()
	
	{
		faker=new Faker();
		userPayload=new User();
		
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUserName(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5,10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
		
		//logs
		
				logger= LogManager.getLogger(this.getClass());
				
				logger.debug("debugging.....");
		
	}
	@Test(priority=1)
	public void testPostUser()
	{
		logger.info("********** Creating user  ***************");
		Response response=UserEndpoints.createuser(userPayload);
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(),200);
		//Assert.assertEquals(response.getContentType(),"application/json");
		
		
		logger.info("**********User is creatged  ***************");
			
	}
	
	@Test(priority=2)
	
	public void testGetUserByname()
	{
		Response response =UserEndpoints.readUser(this.userPayload.getFirstName());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
		
	}

}
