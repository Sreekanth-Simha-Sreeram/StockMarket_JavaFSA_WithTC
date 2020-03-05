package com.Stock.Services;

import com.Stock.Entities.User;

public interface LoginService {
	
	public boolean signUp(User user);
	public boolean signIn(String userName, String userPassword);
	public boolean signOut(int userId);

}
