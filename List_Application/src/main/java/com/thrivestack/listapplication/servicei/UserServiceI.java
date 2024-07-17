package com.thrivestack.listapplication.servicei;

import java.util.List;

import com.thrivestack.listapplication.model.User;

public interface UserServiceI {



	List<User> saveLogin(String username, String password);

	

	void saveUser(User u);

}
