package com.cetc.utils;

import java.util.HashMap;
import java.util.Map;

public class ValueTool {
	
	public static Map<String,String> getValue() {
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("1000", "操作成功");
		
		map.put("1004", "用户名或密码错误");
		
		map.put("1010", "缺少token值");
		map.put("1011", "token值已经过期,请先登录");
		map.put("1012", "非法的token值");
		
		map.put("9999", "系统异常");
		
		return map;
	}
}
