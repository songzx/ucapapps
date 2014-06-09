package com.ucap.components.controllers.admin;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ucap.ucaptools.SystemInfo;
import com.ucap.ucaptools.sigar.SigarUtil;

/**
 * @Title: EnvController.java
 * @Package com.ucap.components.controllers.admin
 * @Description: 应用运维
 * @author 0000
 * @date 2014年6月8日 下午4:21:50
 * @version V1.0
 */
@Controller
@RequestMapping(value="env",method = { RequestMethod.GET, RequestMethod.POST })
@Scope("singleton")
public class EnvController {
	private final static Map<String, Object> webparam = new HashMap<String, Object>();
	private SystemInfo systemInfo = null;
	
	@RequestMapping(value = "/getwebparam", produces = "application/json")
	public 	Map<String,Object> getwebparam(){
		Map<String,Object> webserver = new HashMap<String, Object>();
		try {
			systemInfo = SigarUtil.getInstance();
			webparam.put("jvmproperty", systemInfo.getJvmProperty());
			//webparam.put("os", systemInfo.getOs());
			webparam.put("memory",systemInfo.getMemory());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return webparam;
	}
	
}
