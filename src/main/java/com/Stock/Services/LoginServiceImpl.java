package com.Stock.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Stock.Dao.LoginServiceDao;
import com.Stock.Entities.User;

@Component
@Service ("loginService")

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginServiceDao loginServiceDao;
	@Transactional

	public boolean signUp(User user) {
		return false;
		// TODO Auto-generated method stub

	}
	@Transactional
	public boolean signIn(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean signOut(int userId) {
		return false;
		// TODO Auto-generated method stub
		
	}

}
