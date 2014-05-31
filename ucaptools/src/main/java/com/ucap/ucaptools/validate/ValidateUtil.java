package com.ucap.ucaptools.validate;

import org.apache.commons.validator.routines.IntegerValidator;

public class ValidateUtil {
	
	private static ValidateUtil validateUtil;
	
	private ValidateUtil(){
		
	}
	
	public static ValidateUtil getInstance(){
		if(validateUtil == null){
			validateUtil = new ValidateUtil();
		}
		return validateUtil;
	}
	
	/**
	 * 检查字符串是数字,否则输出替换值.
	 * @param val
	 * @param replaceVal
	 * @return
	 */
	public int checkInt(String val,int replaceVal){
		IntegerValidator integerValidator = IntegerValidator.getInstance();
		if(null == integerValidator.validate(val)){
			return replaceVal;
		}
		return integerValidator.validate(val).intValue();
	}
	
	/**
	 * 检查字符串,不能超过最大值
	 * @param val
	 * @param replaceVal
	 * @param maxVal
	 * @return
	 */
	public int checkInt(String val,int replaceVal,int maxVal){
		int tempVale = checkInt(val,replaceVal);
		return tempVale >= maxVal ? maxVal : tempVale;
	}

}
