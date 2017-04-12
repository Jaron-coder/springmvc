package com.cetc.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cetc.model.resp.UserVo;

@Repository("userRepository")
public interface UserRepository {

	/**
	 * 根据用户名和密码获取用户
	 * @param name 用户名
	 * @param pwd  密码
	 * @return com.cetc.model.resp.UserVo
	 */
	public UserVo getUserByNameAndPwd(@Param("userName")String name,@Param("userPwd")String pwd);
}
