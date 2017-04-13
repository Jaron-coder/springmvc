package com.cetc.persistence;

public enum LogType {
	DESC_MSG(1), 	     //描述日志
	OPERATE_MSG(2);		//操作日志
	
	private int code;
	public int getCode() {
		return code;
	}
	private LogType(int code) {
		this.code = code;
	}
}
