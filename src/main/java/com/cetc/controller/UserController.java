package com.cetc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cetc.model.BaseJson;
import com.cetc.model.JsonResp;
import com.cetc.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping(value = "/login", method ={RequestMethod.GET})
	public JsonResp login(@RequestParam("userName")String usr,@RequestParam("userPwd")String pwd){
		logger.info("用户登陆校验接口");
		JsonResp jsonResp = new JsonResp();
		BaseJson root=userService.getCheckUser(usr,pwd);
		jsonResp.setRoot(root);
		return jsonResp;
	}
}
