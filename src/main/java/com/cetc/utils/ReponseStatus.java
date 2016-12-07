package com.cetc.utils;

public class ReponseStatus {
	// 统一返回公用编码
	private int respCode;// 系统成功或错误的状态code( 200 ok; 400 bad request; 500 server error )
	private String message;// 具体的描述
	private String code;// (可选)错误码，由第三方支付渠道返回的错误代码。
	private String param;// (可选)当发生参数错误时返回具体的参数名，如 id。
	private Object data;//数据域
	
	/**
	 * 请求参数错误
	 * @param message
	 * @param param  参数字段值
	 * @return
	 */
	public static ReponseStatus reqParamInvalidResponse(String message,String param){
		return new ReponseStatus(ResponseCode.REQUEST_PARAM_ERROR,message,null,param,null);
	}
	
	/**
	 *  
	 * @param respCode  响应状态码
	 * @param message   具体的描述
	 * @param code      (可选)错误码，由第三方支付渠道返回的错误代码。
	 * @param param		(可选)当发生参数错误时返回具体的参数名，如 id。
	 * @param data      数据域
	 */
	public ReponseStatus(ResponseCode respCode, String message, String code, String param,Object data) {
		super();
		this.respCode = respCode.getCode();
		this.message = message;
		this.code = code;
		this.param = param;
		this.data=data;
	}
	
	/**
	 *  
	 * @param respCode  响应状态码
	 * @param message   具体的描述
	 * @param data      数据域
	 */
	public ReponseStatus(ResponseCode respCode,String message,Object data) {
		super();
		this.respCode = respCode.getCode();
		this.message = message;
		this.data=data;
	}

	public ReponseStatus() {
		super();
	}

	public int getRespCode() {
		return respCode;
	}

	public void setRespCode(int respCode) {
		this.respCode = respCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	// 状态码
	public static enum ResponseCode {
		SUCCESS(200), REQUEST_PARAM_ERROR(400),SERVER_ERROR(500);

		private int code;

		private ResponseCode(int code) {
			this.code = code;
		}

		public int getCode() {
			return code;
		}
	}

	// 错误信息头
	public static enum ErrorType {
		INVALID_REQUEST_ERROR("invalid_request_error"), CHANNEL_ERROR("channel_error"), CUSTOMER_INFO_ERROR("customer_info_error");

		private String error;

		private ErrorType(String error) {
			this.error = error;
		}

		public String getError() {
			return error;
		}
	}

	@Override
	public String toString() {
		return "ReponseStatus [respCode=" + respCode +", message=" + message + ", code="
				+ code + ", param=" + param + "]";
	}
	
	
}
