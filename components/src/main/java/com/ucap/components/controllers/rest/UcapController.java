package com.ucap.components.controllers.rest;

import java.util.Map;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * 
 * @Title: UcapController.java
 * @Package com.ucap.components.controllers.rest
 * @Description: TODO
 * @author 0000
 * @date 2014年6月1日 下午10:41:34
 * @version V1.0
 */
@Controller
@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
public class UcapController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UcapController.class);

	
	@RequestMapping("/{path}")
	public String index(@PathVariable String path){
		return path;
	}
	
	@RequestMapping("/web/{path:[a-z0-9_]+}")
	public String web(@PathVariable String path){
		return "web/"+ path.replace("_", "/");
	}
	
	@RequestMapping("/admin/{path:[a-z0-9_]+}")
	public String admin(@PathVariable String path) {
		return "admin/" + path.replace("_", "/");
	}
	
	
}
