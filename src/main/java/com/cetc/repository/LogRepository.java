package com.cetc.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cetc.model.LogMessage;

@Repository("logRepository")
public interface LogRepository {

	public List<HashMap<String,Object>> getLogs();
	
	public int insertLog(LogMessage log);
}
