package com.ucap.components.controllers.admin;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**   
 * @Title: UcapAdminController.java 
 * @Package com.ucap.components.controllers 
 * @Description: TODO 
 * @author songzx
 * @date 2014年6月5日 下午1:08:46 
 * @version V1.0   
 */
@Controller
@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
public class UcapAdminController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UcapAdminController.class);
	
	
	@RequestMapping("/{path:[a-z0-9_]+}")
	public String admin(@PathVariable String path) {
		return "admin/" + path.replace("_", "/");
	}
	
	
}
