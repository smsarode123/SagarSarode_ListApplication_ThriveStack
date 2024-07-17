package com.thrivestack.listapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thrivestack.listapplication.model.User;
import com.thrivestack.listapplication.servicei.UserServiceI;

@Controller
public class HomeController {
	
	@Autowired
	UserServiceI usi;
	
	@RequestMapping("/")
	public String preLogin() 
	{
		return "login";
		
	}
	

	@RequestMapping("/openreg")
	public String preRegister() {
		return "register";

	}
	
	@RequestMapping("/save")
	public String saveUser(User u) {
		usi.saveUser(u);
		return "login";

	}


	@RequestMapping("/log")
	public String saveLogin(@RequestParam("username") String username, @RequestParam("password") String password, Model m) {
		List<User> list = usi.saveLogin(username, password);
		if (!list.isEmpty()) {
			m.addAttribute("data", list);
			return "success";
		} else {
			m.addAttribute("msg", "Invalid username or password");
			return "login";
		}

	}
	
	

}
