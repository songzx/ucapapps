package com.ucap.components.controllers.rest;

import java.util.Map;

import javax.jms.JMSException;

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
@RequestMapping(value = "/crud", method = { RequestMethod.GET, RequestMethod.POST },produces={"application/json"})
public class CrudController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CrudController.class);

	@RequestMapping("/add")
	public String add(@RequestParam Map<String,String> params) throws JMSException {
		boolean flag = new JmsPublisher("crudevent") {
			@Override
			public void service(Map<String, String> params) {
				//业务逻辑
				LOGGER.info(params.toString());
			}
			
			@Override
			public boolean isallow(Map<String, String> params) {
				return true;
			}
		}.send(params);
		
		return flag ? "true":"false";
	}
	
}
