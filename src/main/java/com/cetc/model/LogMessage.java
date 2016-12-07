package com.cetc.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class LogMessage {

	private Integer logId;
	private Long userId;// 管理员id
	private Date createDate;// 日期
	private String content;// 日志内容
	private String operation;// 操作(主要是"添加"、"修改"、"删除")
	
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
}
