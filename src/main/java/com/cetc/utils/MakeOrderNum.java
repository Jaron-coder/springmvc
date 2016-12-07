package com.cetc.utils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;  
import java.util.Date;

import sun.misc.BASE64Encoder; 

//订单号生成工具，生成非重复订单号，理论上限1毫秒1000个，可扩展 
@SuppressWarnings("restriction")
public class MakeOrderNum {
	    /** 
	     * 锁对象，可以为任意对象 
	     */  
	    private static Object lockObj = "lockerOrder";  
	    /** 
	     * 订单号生成计数器 
	     */  
	    private static long orderNumCount = 0L;  
	    /** 
	     * 每毫秒生成订单号数量最大值 
	     */  
	    private static int maxPerMSECSize=1000;  
	    /** 
	     * 生成非重复订单号，理论上限1毫秒1000个，可扩展 
	     * @param tname 测试用 
	     */  
	    public static String makeOrderNum() {  
	        try {  
	            // 最终生成的订单号  
	            String finOrderNum = "";  
	            synchronized (lockObj) {  
	                // 取系统当前时间作为订单号变量前半部分，精确到毫秒  
	                long nowLong = Long.parseLong(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()));  
	                // 计数器到最大值归零，可扩展更大，目前1毫秒处理峰值1000个，1秒100万  
	                if (orderNumCount > maxPerMSECSize) {  
	                    orderNumCount = 0L;  
	                }  
	                //组装订单号  
	                String countStr=maxPerMSECSize +orderNumCount+"";  
	                finOrderNum=nowLong+countStr.substring(1);  
	                orderNumCount++;  
	                return finOrderNum;
	            }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return null;
	    }  
	  
	    /**利用MD5进行加密
	     * @param str  待加密的字符串
	     * @return  加密后的字符串
	     * @throws NoSuchAlgorithmException  没有这种产生消息摘要的算法
	     * @throws UnsupportedEncodingException  
	     */
	    public String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
	        //确定计算方法
	        MessageDigest md5=MessageDigest.getInstance("MD5");
	        BASE64Encoder base64en = new BASE64Encoder();
	        //加密后的字符串
	        String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
	        return newstr;
	    }
	    
	    public static void main(String[] args) {  
	        // 测试多线程调用订单号生成工具  
	        try {  
	            for (int i = 0; i < 200; i++) {  
	                Thread t1 = new Thread(new Runnable() {  
	                    public void run() {  
	                       System.out.println(MakeOrderNum.makeOrderNum()); 
	                    }  
	                }, "at" + i);  
	                t1.start();  
	            }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	  
	    }  
	  
	}  