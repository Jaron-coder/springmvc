package com.cetc.model.resp;

public class LogVo {

	private Integer logId;
	private Integer logType;
	private String 	description;
	private String 	requestIp;
	private String  createBy;
	private String  createDate;
	
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	
	public Integer getLogType() {
		return logType;
	}
	public void setLogType(Integer logType) {
		this.logType = logType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRequestIp() {
		return requestIp;
	}
	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
}
