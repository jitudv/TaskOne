package com.urskart.controller;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.urskart.model.*;
import com.urskart.service.UserService;

@RestController
public class UserController 
{
   @Autowired
   UserService userService;
   
   @PostMapping("/user")
   public ResponseEntity<?> save(@RequestBody User user)
   {
	long id = userService.saveUser(user);
	return ResponseEntity.ok().body("user save  "+user.getId());
  }
  
   
   @GetMapping("/user/{id}")
   public ResponseEntity<User> getUser(@PathVariable("id") long id)
   {
	 User user = userService.get(id) ;
	 return ResponseEntity.ok().body(user);
   }
   
   @PutMapping("/user/{id}")
   public ResponseEntity<?>  updateUser(@PathVariable("id") long id , @RequestBody User user )
   {
	   userService.update(id, user);
	   return ResponseEntity.ok().body("update sucess");
   }
   
   @DeleteMapping("/user/{id}")
   public ResponseEntity<?> deleteUser(@PathVariable("id") long  id )
   {
	  userService.delete(id);
	 return ResponseEntity.ok().body("user deleted  ");  
   }
   
   @GetMapping("/users")
   public ResponseEntity<?> getAllUser()
   {
	 List<User>  list = userService.userList();
	 return ResponseEntity.ok().body(list);
   }
   
}
