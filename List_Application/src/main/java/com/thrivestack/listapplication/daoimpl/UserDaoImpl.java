package com.thrivestack.listapplication.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thrivestack.listapplication.daoi.UserDaoI;
import com.thrivestack.listapplication.model.User;

@Repository
public class UserDaoImpl implements UserDaoI {

	@Autowired
	SessionFactory sf;

	@Override
	public List<User> saveLogin(String username, String password) {
		
		return null;
	}

	@Override
	public void saveUser(User u) {
		
		Session session = sf.openSession();

		session.merge(u);

		session.beginTransaction().commit();
	}

}
