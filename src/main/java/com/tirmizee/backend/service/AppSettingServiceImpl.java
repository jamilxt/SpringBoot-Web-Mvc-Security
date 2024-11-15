package com.tirmizee.backend.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tirmizee.backend.dao.AppSettingDao;
import com.tirmizee.core.component.ApplicationSetting;
import com.tirmizee.core.constant.Constant;

@Service
public class AppSettingServiceImpl implements AppSettingService {

	@Autowired
	private AppSettingDao appSettingDao;
	
	@Override
	public String getValue(String key) {
		return appSettingDao.findOne(key).getValue();
	}
	
	@Override
	public Map<String, String> getMapSetting(){
		Map<String, String> map = new HashMap<>();
		appSettingDao.findAll().forEach(o -> map.put(o.getKey(), o.getValue()));
		return map;
	}

	@Override
	public ApplicationSetting getApplicationSetting() {
		Map<String, String> mapSetting = getMapSetting();
		ApplicationSetting applicationSetting = new ApplicationSetting();
		applicationSetting.setSessionTimeOut(1000);
		applicationSetting.setMaxLoginFail(4);
		applicationSetting.setPasswordChangeDay(2);
		return applicationSetting;
	}
	

}
