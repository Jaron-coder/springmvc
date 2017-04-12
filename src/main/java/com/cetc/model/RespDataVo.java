package com.cetc.model;


public class RespDataVo {
	
	private String token;
	/*
	 * 数据
	 */
	private Object data;
	/*
	 * 描述
	 */
	private String msg;
	/*
	 * 错误code
	 */
	private String code;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg =msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
