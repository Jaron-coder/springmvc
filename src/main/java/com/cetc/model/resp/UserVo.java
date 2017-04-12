package com.cetc.model.resp;

/**
 * 用户视图类
 * @author hp
 *
 */
public class UserVo {
	/*
	 * 用户Id
	 */
	private String userId;
	/*
	 * 用户名
	 */
	private String userName;
	/*
	 * 用户密码
	 */
	private String userPwd;
	/*
	 * 是否删除：0未删除；1删除
	 */
	private Integer isDelete;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
	
}
