package com.urskart.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.urskart.dao.LoginDao;

@Service
@Transactional(readOnly = true)
public class LoginServiceImpl implements LoginService {

	
	@Autowired
    LoginDao logindao;
	
	@Override
	public boolean login(String uid, String upass) {
		logindao.Validate(uid, upass);
		return false;
	}

}
