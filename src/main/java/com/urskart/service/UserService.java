package com.urskart.service;

import java.util.List;

import com.urskart.model.User;

public interface UserService 
{
	 long saveUser(User user);

	   User get(long id); // it will return the  single user 
	   
     List<User> userList(); // it will return  the all user list 
     
     void update(long id, User user); // update  the User 
     
	   void update(long id); // update user according to id 
	   
	   void delete(long id);  // delete  user according to id 

}
