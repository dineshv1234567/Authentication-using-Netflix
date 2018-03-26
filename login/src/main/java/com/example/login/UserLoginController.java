package com.example.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

	@Autowired
	UserVerifyProxy proxy;
	
	@PostMapping("/user-authenticate")
	public Boolean checkUserCredentials(@RequestBody UserData userdata) {
		Boolean res=proxy.authenticateUser(userdata);
		return res;
		
	}
}
