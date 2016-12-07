package com.cetc.model.req;

/**
 * 退款对象
 * @author hp
 *
 */
public class RefundReq {
	private String appKey;//客户APP key
	private String appId;//客户APP Id
	private String orderNo;
	private String channel;
	private String chargeId;//退款对象 id
	private String amount;//退款金额，单位为对应币种的最小货币单位，例如：人民币为分（如退款金额为 1 元，此处请填 100）。
	private String subject;//退款详情
	
	private String payId;
	
	
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getChargeId() {
		return chargeId;
	}
	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
