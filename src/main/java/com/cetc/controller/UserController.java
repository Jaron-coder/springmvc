package com.cetc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cetc.model.RespDataVo;
import com.cetc.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping(value = "/login", method ={RequestMethod.GET})
	public RespDataVo login(@RequestParam("userName")String usr,@RequestParam("userPwd")String pwd){
		logger.info("用户登陆校验接口");
		RespDataVo root=userService.getCheckUser(usr,pwd);
		return root;
	}
}
