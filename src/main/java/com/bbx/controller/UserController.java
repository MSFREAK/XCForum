package com.bbx.controller;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bbx.domain.User;
import com.bbx.service.UserService;

@Controller
public class UserController {

	private static Logger log = Logger.getLogger(UserController.class);

	@Autowired(required = false)
	private UserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String save(User u) {
		log.info("save()--->start");
		User user = new User();
		String uuid = UUID.randomUUID().toString();
		user.setId(uuid);
		log.info(uuid);
		user.setUsername(u.getUsername());

		userService.save(user);

		log.info(user.getId());

		System.out.println(user.getId() + "----------->System.out");
		log.info("save()--->end");
		return "success";
	}
}