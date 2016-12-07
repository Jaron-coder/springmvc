package com.cetc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	private static final String CRON_DATE_FORMAT = "ss mm HH dd MM ? yyyy";

	/***
	 * 
	 * @param date
	 *            时间
	 * @return cron类型的日期
	 */
	public static String getCron(final Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(CRON_DATE_FORMAT);
		String formatTimeStr = "";
		if (date != null) {
			formatTimeStr = sdf.format(date);
		}
		return formatTimeStr;
	}

	/***
	 * 
	 * @param cron 	Quartz cron的类型的日期
	 * @return 		Date日期
	 */

	public static Date getDate(final String cron) {
		if (cron == null) {
			return null;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(CRON_DATE_FORMAT);
		Date date = null;
		try {
			date = sdf.parse(cron);
		} catch (ParseException e) {
			return null;// 此处缺少异常处理,自己根据需要添加
		}
		return date;
	}

	/**
	 * 给指定日期增加分钟数转成 cron
	 * 
	 * @param date
	 * @param min
	 * @return
	 */
	public static String dateAddMinToCron(Date date, int min) {
		Calendar specialDate =Calendar.getInstance();
		specialDate.setTime(date);
		specialDate.add(Calendar.MINUTE, min);
		return getCron(specialDate.getTime());
	}

	/**
	 * 给指定日期增加小时数转成 cron
	 * 
	 * @param date
	 * @param min
	 * @return
	 */
	public static String dateAddHourToCron(Date date, int hour) {
		Calendar specialDate =Calendar.getInstance();
		specialDate.setTime(date);
		specialDate.add(Calendar.HOUR_OF_DAY, hour);
		return getCron(specialDate.getTime());
	}
}
