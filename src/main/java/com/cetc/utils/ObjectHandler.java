package com.cetc.utils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

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
	
	/**
	 * 复制一个对象的相同的属性到另一个相同属性的对象
	 * @param obj      被复制对象
	 * @param copyObj  输出对象
	 * @return
	 */
	public static Object objectCopyObj(Object obj,@SuppressWarnings("rawtypes") Class copyClass) {
		HashMap<String, Object> copyMap = new HashMap<String, Object>();
		try {
			Object copyObj=copyClass.newInstance();
			Field[] fileds1 = copyClass.getDeclaredFields();
			for (Field field : fileds1) {
				PropertyDescriptor pd = new PropertyDescriptor(field.getName(), copyClass);
				Method wM = pd.getWriteMethod();
				copyMap.put(field.getName(), wM);
			}
			
			Class<?> clazz = obj.getClass();
			Field[] fileds = clazz.getDeclaredFields();
			for (Field field : fileds) {
				String name=field.getName();
				PropertyDescriptor pd = new PropertyDescriptor(name, clazz);
				Method rM = pd.getReadMethod();// 获得读方法
				Object getResult = rM.invoke(obj);
				if (getResult != null && copyMap.containsKey(name)) {
					((Method)copyMap.get(name)).invoke(copyObj, getResult);
				}
			}
			return copyObj;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("拷贝对象出错");
		}
		return null;
	}
}
