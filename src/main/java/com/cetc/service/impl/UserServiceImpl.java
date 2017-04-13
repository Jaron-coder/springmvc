package com.cetc.service.impl;

import java.util.Calendar;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetc.annotation.SystemServiceLog;
import com.cetc.model.RespDataVo;
import com.cetc.model.resp.UserVo;
import com.cetc.repository.UserRepository;
import com.cetc.service.UserService;
import com.cetc.utils.Base64;
import com.cetc.utils.DateUtil;
import com.cetc.utils.ValueTool;

@Service("userService")
public class UserServiceImpl implements UserService {

	private static Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;
	
	
	@SystemServiceLog(description ="查询用户")
	@Override
	public RespDataVo getCheckUser(String usr, String pwd) {
//		RespDataVo root=new RespDataVo();
//		String code = "1000";
//		try {
//			UserVo user=userRepository.getUserByNameAndPwd(usr,pwd);
//			if(user!=null){//存在用户
//				String token=Base64.encode((user.getUserId()+"_"+DateUtil.getDateFormat(Calendar.getInstance())+"_A123456a").getBytes());
//				root.setToken(token);
//				root.setData(user);
//				root.setCode(code);
//				root.setMsg(ValueTool.getValue().get(code));
//			}else{
//				code="1004";
//				root.setCode(code);
//				root.setMsg(ValueTool.getValue().get(code));
//			}
//		} catch (Exception e) {
//			root.setCode("9999");
//			root.setMsg(ValueTool.getValue().get("9999"));
//			logger.error("校验用户错误", e);
//		}
//		return root;
		RespDataVo root=new RespDataVo();
		int a=1/0;
		String code = "1000";
			UserVo user=userRepository.getUserByNameAndPwd(usr,pwd);
			if(user!=null){//存在用户
				String token=Base64.encode((user.getUserId()+"_"+DateUtil.getDateFormat(Calendar.getInstance())+"_A123456a").getBytes());
				root.setToken(token);
				root.setData(user);
				root.setCode(code);
				root.setMsg(ValueTool.getValue().get(code));
			}else{
				code="1004";
				root.setCode(code);
				root.setMsg(ValueTool.getValue().get(code));
			}
		return root;
	}

}
