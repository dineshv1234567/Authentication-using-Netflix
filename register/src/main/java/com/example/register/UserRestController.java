package com.example.register;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@Autowired
	private UserRepository repo;
	
	@PostMapping("/register")
	public void inputUserDetails(@RequestBody UserData userData) {
		repo.save(userData);
	}
	
	@GetMapping("/view")
	public List<UserData> retrieveUserData() {
		return repo.findAll();
	}
	
	@GetMapping("/view/{id}")
	public Optional<UserData> retrieveSingleUserData(@PathVariable long id) {
		return repo.findById(id);
	}
	
	@GetMapping("/del/{id}")
	public UserData inputUserDetails(@PathVariable long id) {
		int flag=0;
		List<UserData> a=repo.findAll();
		Iterator<UserData> it=a.iterator();
		while(it.hasNext()) {
			UserData l=it.next();
			if(l.getUserId()==id) {
				it.remove();
				flag=1;
			}
		}
		if(flag==1) {
			repo.deleteAll();
			repo.saveAll(a);
		}
		return null;
	}
	
	@PostMapping("/register-authenticate")
	public Boolean authenticateUser(@RequestBody UserData userdata) {
	Optional<UserData> findId=repo.findById(userdata.getUserId());
		if(findId.isPresent()) {
			UserData data=findId.get();
			if(data.getPassword().equals(userdata.getPassword()))
				return true;
		}
		return false;
		
	}

}
