package com.cetc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cetc.annotation.SystemControllerLog;
import com.cetc.controller.base.BaseController;
import com.cetc.model.RespDataVo;
import com.cetc.service.UserService;
import com.cetc.utils.JsonUtils;


@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService; 
	
	
	@SystemControllerLog(description="登录系统")
	@RequestMapping(value = "/login", method ={RequestMethod.GET})
	public RespDataVo login(@RequestParam("userName")String usr,@RequestParam("userPwd")String pwd){
		RespDataVo root=userService.getCheckUser(usr,pwd);
		logger.debug(String.format("返回结果：%s",JsonUtils.objectToJson(root)));
		return root;
	}
}
