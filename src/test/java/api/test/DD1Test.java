package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.StudentsUserEndpoints;


import api.payload.Users;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DD1Test {

	@Test(priority=1, dataProvider="Data", dataProviderClass=DataProviders.class)
	
	public void testPostUser(String name,String location,String ph )
	{
		
	
	Users userPayload=new Users();
	
	
	userPayload.setName(name);
	userPayload.setLocation(location);
	userPayload.setPh(ph);
	
	Response response=StudentsUserEndpoints.createuser(userPayload);
	Assert.assertEquals(response.getStatusCode(),200);
		
}
	@Test(priority=2, dataProvider="UserName", dataProviderClass=DataProviders.class)
	public void testDeleteUserByName(String userName)
	{
			Response response=StudentsUserEndpoints.deleteUser(userName);
			Assert.assertEquals(response.getStatusCode(),200);	
	
	}
	
}
	
	
	
	
	