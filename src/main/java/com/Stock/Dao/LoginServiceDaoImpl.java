package com.Stock.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Stock.Entities.User;

@Component
@Repository ("loginServiceDao")

public class LoginServiceDaoImpl implements LoginServiceDao {
	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public boolean signUp(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean signIn(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean signOut(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

}
