package com.thrivestack.listapplication.daoi;

import java.util.List;

import com.thrivestack.listapplication.model.User;

public interface UserDaoI {

	
	List<User> saveLogin(String username, String password);

	void saveUser(User u);

}
