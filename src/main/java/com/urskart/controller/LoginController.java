package com.urskart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.urskart.model.LoginClass;
import com.urskart.service.LoginService;

@RestController
public class LoginController
{
	@Autowired
	LoginService  loginservice;
	

@PostMapping("/user/login/")	
public  ResponseEntity<?> loginUser(@RequestBody LoginClass login)
{
  boolean res = loginservice.login(login.getUserName(), login.getPassword());
  if(res)
  {
        
  }
	 
	
	return ResponseEntity.ok().body("yes you logined");
	
}
	
	
	
}
