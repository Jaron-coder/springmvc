package com.cetc.repository;

import org.springframework.stereotype.Repository;

import com.cetc.persistence.SystemLog;

@Repository("logRepository")
public interface LogRepository {

	void addLog(SystemLog log);

}
