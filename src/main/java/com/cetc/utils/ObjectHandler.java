package com.cetc.utils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

import com.cetc.model.LogMessage;


/**
 * 利用反射处理对象
 * 
 * @author hp
 *
 */
public class ObjectHandler {

	/**
	 * 去除对象中为空的字段值
	 * 
	 * @param obj
	 * @return
	 */
	public static HashMap<String, Object> objectToMap(Object obj) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		try {
			Class<?> clazz = obj.getClass();
			Field[] fileds = clazz.getDeclaredFields();
			for (Field field : fileds) {
				PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
				Method rM = pd.getReadMethod();// 获得读方法
				Object getResult = rM.invoke(obj);
				if (getResult != null) {
					map.put(field.getName(), getResult);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	public static void main(String[] args) {
		LogMessage m=new LogMessage();
		m.setContent("121212");
		m.setUserId((long) 123123);
		HashMap<String, Object>mm=ObjectHandler.objectToMap(m);
		System.out.println(mm);
	}
}
