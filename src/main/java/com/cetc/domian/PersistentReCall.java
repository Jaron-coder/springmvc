package com.cetc.domian;

public class PersistentReCall {

	private int recallType;
	private long payId;
	private long refundId;
	private String reCallJson;
	private String reCallTime;
	private String callUrl;
	private int status;
	
	public int getRecallType() {
		return recallType;
	}
	public void setRecallType(int recallType) {
		this.recallType = recallType;
	}
	public long getPayId() {
		return payId;
	}
	public void setPayId(long payId) {
		this.payId = payId;
	}
	public long getRefundId() {
		return refundId;
	}
	public void setRefundId(long refundId) {
		this.refundId = refundId;
	}
	public String getReCallJson() {
		return reCallJson;
	}
	public void setReCallJson(String reCallJson) {
		this.reCallJson = reCallJson;
	}
	public String getReCallTime() {
		return reCallTime;
	}
	public void setReCallTime(String reCallTime) {
		this.reCallTime = reCallTime;
	}
	public String getCallUrl() {
		return callUrl;
	}
	public void setCallUrl(String callUrl) {
		this.callUrl = callUrl;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
