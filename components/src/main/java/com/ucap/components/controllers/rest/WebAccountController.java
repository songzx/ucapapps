package com.ucap.components.controllers.rest;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.method.annotation.SessionStatusMethodArgumentResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * 
 * @Title: WebAccountController.java
 * @Package com.ucap.components.controllers.rest
 * @Description: TODO
 * @author 0000
 * @date 2014年6月1日 下午10:01:26
 * @version V1.0
 */
@Controller
@SessionAttributes(value={"accountid"})
@RequestMapping(value = "/webaccount", method = { RequestMethod.GET, RequestMethod.POST })
public class WebAccountController {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebAccountController.class);

	@RequestMapping("/login")
	public String login(@RequestParam(required=false) String account, @RequestParam(required=false) String passwd, @ModelAttribute String accountid,Model model) {
		
		if(("account".equals(account)&&"passwd".equals(passwd)) || !"".equals(accountid)){
			//accountid = account;
			model.addAttribute("accountid", account);
			return UrlBasedViewResolver.FORWARD_URL_PREFIX+ "/restful/admin/index";
		}
		return UrlBasedViewResolver.FORWARD_URL_PREFIX+ "/restful/web/login";
	}
	
	@RequestMapping("/loginout")
	public String loginout(@ModelAttribute String accountid,SessionStatus sessionStatus, Model model) {
		sessionStatus.setComplete();
		//自动重载session的值
		//model.addAttribute("accountid", "test中文");
		return UrlBasedViewResolver.FORWARD_URL_PREFIX+ "/restful/web/login";
	}
	
	@RequestMapping("/regedit")
	public String regedit(@RequestParam MultiValueMap<String,String[]> param) {
		
		return UrlBasedViewResolver.FORWARD_URL_PREFIX+ "/restful/web/login";
	}
	
	
}
