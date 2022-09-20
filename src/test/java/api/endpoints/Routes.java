package api.endpoints;

public class Routes {
	
	public static String base_url="https://petstore.swagger.io/v2";
	
	//public static String base_url="https://gorest.co.in/public/v2";
	//user module
	
	// get url https://petstore.swagger.io/v2/user/{{username}}
	//put url https://petstore.swagger.io/v2/user/{{username}}
	//delete url https://petstore.swagger.io/v2/user/{{username}}
	
	public static String post_url=base_url+"/user";
	public static String get_url=base_url+"/user/{usrname}";
	public static String update_url=base_url+"/user/{username}";
	public static String delete_url=base_url+"/user/{username}";
	
	
	//gorestapi module
//	public static String pots_url=base_url+"/users";
//
//	public static String get_url=base_url+"/users/{userid_env}}";
//	public static String update_url=base_url+"/users/{userid_env}}";
//	public static String delete_url=base_url+"/users/{userid_env}}";
	
	//all urls will maintain in single file that is routes class

}
//pet store


//userDetails


