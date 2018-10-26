package com.urskart.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.urskart.service.LoginService;
import com.urskart.service.UserService;
import com.urskart.model.*;

@Repository
public class LoginDaoImpl implements LoginDao {

	
	@Autowired
	UserService userService;
	@Override
	public boolean Validate(String userid, String userpass) {

		boolean res = false;
		List<User> list = userService.userList();
		Iterator<User> itr = list.iterator();
		while (itr.hasNext()) {
			User usr = itr.next();
			if (usr.getName().equals(userid) && usr.getPassword().equals(userpass)) {
              res = true;
			}
		}

		return res;
	}

}
