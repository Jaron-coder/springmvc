package com.cetc.service;

import com.cetc.persistence.SystemLog;

public interface LogService {

	/**
	 * 保存日志
	 * @param log
	 */
	void addLog(SystemLog log);

}
