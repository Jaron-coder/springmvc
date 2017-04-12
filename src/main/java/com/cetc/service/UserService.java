package com.cetc.service;

import com.cetc.model.RespDataVo;

public interface UserService {

	/**
	 * 根据用户名和密码查找用户
	 * @param usr
	 * @param pwd
	 * @return
	 */
	RespDataVo getCheckUser(String usr, String pwd);

}
