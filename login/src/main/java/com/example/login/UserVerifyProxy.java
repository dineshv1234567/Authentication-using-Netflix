package com.example.login;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="netflix-zuul-api-gateway-server",url="localhost:8765")
public interface UserVerifyProxy {

	@PostMapping("/register/register-authenticate")
	public Boolean authenticateUser(@RequestBody UserData userdata);

}
