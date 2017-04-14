package com.cetc.controller.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cetc.model.RespDataVo;

@ControllerAdvice
public class BaseController {

	@ExceptionHandler({Exception.class})
	@ResponseBody()
	public RespDataVo exp(HttpServletRequest request,HttpServletResponse response, Exception ex) {
		// 根据不同错误转向不同页面
		RespDataVo jsonResp = new RespDataVo();
		if (ex instanceof HttpRequestMethodNotSupportedException) {
			HttpRequestMethodNotSupportedException reqEx = (HttpRequestMethodNotSupportedException) ex;
			StringBuffer buffer = new StringBuffer();
			String[] strArray=reqEx.getSupportedMethods();
			String method="";
			for (String str : strArray) {
				method+=str+",";
			}
			buffer.append("不支持[ ").append(reqEx.getMethod()).append(" ],只支持[ ").append(method.substring(0, method.length()-1)).append(" ]");
			jsonResp.setCode("0011");
			jsonResp.setMsg(buffer.toString());
			return jsonResp;
		} else if(ex instanceof MissingServletRequestParameterException){
			MissingServletRequestParameterException reqEx = (MissingServletRequestParameterException) ex;
			StringBuffer buffer = new StringBuffer();
			buffer.append("缺少参数：[").append(reqEx.getParameterName()).append("]");
			jsonResp.setCode("0012");
			jsonResp.setMsg(buffer.toString());
			return jsonResp;
		}else{
			jsonResp.setCode("0013");
			jsonResp.setMsg("服务器异常");
			return jsonResp;
		}

	}
}
