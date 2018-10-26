package com.urskart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.urskart.dao.UserDao;
import com.urskart.model.User;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    
	@Autowired
	UserDao userDao;
	
	@Override
	public long saveUser(User user) {
		userDao.saveUser(user);
    
		return 0;
	}

	@Override
	public User get(long id) {
		
		return  userDao.get(id);
	}

	@Override
	public List<User> userList() {
		// TODO Auto-generated method stub
		return  userDao.userList();
	}

	@Override
	public void update(long id, User user) {
		 userDao.update(id, user);

	}

	@Override
	public void update(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) {
		  userDao.delete(id);
	}

}
