package com.thrivestack.listapplication.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thrivestack.listapplication.daoi.UserDaoI;
import com.thrivestack.listapplication.model.User;
import com.thrivestack.listapplication.servicei.UserServiceI;
@Service
public class UserServiceImpl implements UserServiceI {
	
	@Autowired
	UserDaoI udi;



	@Override
	public List<User> saveLogin(String username, String password) {
	
		List<User> list = udi.saveLogin(username, password);
		return list;
	}



	@Override
	public void saveUser(User u) {
		
		udi.saveUser(u);
	}


}
