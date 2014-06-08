package com.ucap.components.controllers.admin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping(value = "/getwebparam", produces = "application/json")
	public 	Map<String,Object> getwebparam(){
		Map<String,Object> webserver = new HashMap<String, Object>();
		webserver.put("java.home", System.getProperty("java.home"));
		webserver.put("java.version", System.getProperty("java.version"));
		webserver.put("sun.boot.library.path", System.getProperty("sun.boot.library.path"));
		webserver.put("os.name", System.getProperty("os.name"));
		webserver.put("file.encoding", System.getProperty("file.encoding"));
		webserver.put("file.separator", System.getProperty("file.separator"));
		
		webparam.put("webserver", webserver);
		return webparam;
	}
	
}
