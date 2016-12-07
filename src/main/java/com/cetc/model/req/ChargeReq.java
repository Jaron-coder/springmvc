package com.cetc.model.req;

/**
 * 费用对象
 * @author hp
 *
 */
public class ChargeReq {
	private String appKey;//客户APP key
	private String appId;//客户APP Id
	private String orderNo;//商户订单号，适配每个渠道对此参数的要求，必须在商户系统内唯一。
	private String channel;//支付使用的第三方支付渠道，取值范围
	private double amount;//订单总金额, 单位为对应币种的最小货币单位，例如：人民币为分（如订单总金额为 1 元，此处请填 100）
	private String clientIP;//发起支付请求客户端的 IP 地址，格式为 IPV4，如: 127.0.0.1。
	private String currency;//三位 ISO 货币代码，目前仅支持人民币 cny。
    private String subject;//商品的标题
	private String remark;//商品的描述信息
	private String consumeType;//消费类型（1：挂号  2：药品  2：检查）
	private String consumeCode;//消费代码
	private String consumerName;//消费人名字
	private String consumerCode;//消费人代码
	
	public String getConsumeType() {
		return consumeType;
	}
	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}
	public String getConsumeCode() {
		return consumeCode;
	}
	public void setConsumeCode(String consumeCode) {
		this.consumeCode = consumeCode;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public String getConsumerCode() {
		return consumerCode;
	}
	public void setConsumerCode(String consumerCode) {
		this.consumerCode = consumerCode;
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
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getClientIP() {
		return clientIP;
	}
	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
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
	public ChargeReq() {
		super();
	}
	
}
