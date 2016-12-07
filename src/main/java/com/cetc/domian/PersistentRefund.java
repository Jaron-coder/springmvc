package com.cetc.domian;

/**
 * 退款对象
 * @author hp
 *
 */
public class PersistentRefund {
	private Integer refundId;
	private String payId;
	private String chargeId;//charge 对象的 id。
	private String channel;//支付渠道
	private String orderNo;//订单号
	private double amount;//退款金额，单位为对应币种的最小货币单位，例如：人民币为分（如退款金额为 1 元，此处请填 100）。
	private String currency;//三位 ISO 货币代码，目前仅支持人民币 cny。
	private String subject;//商品的标题
	private String remark;//商品的描述信息
	private String status;//支付状态(0: 支付进行中  1： 支付成功 -1：失败)
	private String credential;//支付验证
	private String description;//退款详情
	
	private String finishTime;//退款成功的时间
	private String errorCode;//退款的错误码
	private String errorMsg;//退款消息的描述。
	
	public Integer getRefundId() {
		return refundId;
	}
	public void setRefundId(Integer refundId) {
		this.refundId = refundId;
	}
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getChargeId() {
		return chargeId;
	}
	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCredential() {
		return credential;
	}
	public void setCredential(String credential) {
		this.credential = credential;
	}
	public String getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
