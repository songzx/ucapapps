package com.ucap.components.controllers.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title: AccountController.java
 * @Package com.ucap.components.controllers.admin
 * @Description: TODO
 * @author songzx
 * @date 2014年6月12日 下午4:10:20
 * @version V1.0
 */
@Controller
@RequestMapping(value = "account", method = { RequestMethod.GET, RequestMethod.POST },produces = "application/json")
public class AccountController {

	@RequestMapping(value = "/list")
	public Map<String, Object> list(@RequestParam Map<String,String> param) {
		Map<String, Object> result = new HashMap<>();
		List<Map<String, Object>> data = new ArrayList<>();
		
		Map<String,Object> temp = new HashMap<>();
		temp.put("id", UUID.randomUUID().toString().replace("-", ""));
		temp.put("account", "admin");
		temp.put("aliasname", "张三");
		data.add(temp);
		
		temp = new HashMap<>();
		temp.put("id", UUID.randomUUID().toString().replace("-", ""));
		temp.put("account", "admin1");
		temp.put("aliasname", "李四");
		data.add(temp);
		
		
		result.put("data", data);
		result.put("param", param);
		return result;
	}

	@RequestMapping(value = "/add")
	public Map<String, Object> add(@RequestParam Map<String,String> param) {
		Map<String, Object> result = new HashMap<>();
		result.put("result", true);
		return result;
	}

	@RequestMapping(value = "/remove")
	public Map<String, Object> remove() {
		Map<String, Object> result = new HashMap<>();
		result.put("result", true);
		return result;
	}
	
	@RequestMapping(value = "/read")
	public Map<String, Object> read() {
		Map<String, Object> result = new HashMap<>();
		result.put("result", true);
		return result;
	}

	@RequestMapping(value = "/modify")
	public Map<String, Object> modify() {
		Map<String, Object> result = new HashMap<>();
		result.put("result", true);
		return result;
	}
}
