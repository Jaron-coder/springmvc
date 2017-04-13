package com.cetc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetc.persistence.SystemLog;
import com.cetc.repository.LogRepository;
import com.cetc.service.LogService;

@Service("logService")
public class LogServiceImpl implements LogService {

	@Autowired
	private LogRepository logRepository;
	
	@Override
	public void addLog(SystemLog log) {
		logRepository.addLog(log);
	}

}
