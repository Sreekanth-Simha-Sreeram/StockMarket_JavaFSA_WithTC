package com.Stock.Dao;

import com.Stock.Entities.User;

public interface LoginServiceDao {
	
	public boolean signUp(User user);
	public boolean signIn(String userName, String userPassword);
	public boolean signOut(int userId);

}
