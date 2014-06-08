package com.ucap.ucaptools;

import java.util.List;
import java.util.Map;

/**
 * @Title: SystemInfo.java
 * @Package com.ucap.ucaptools
 * @Description: TODO
 * @author 0000
 * @date 2014年6月8日 下午11:42:46
 * @version V1.0
 */
public interface SystemInfo {

	/**
	 * 返回CPU的相关信息,多核
	 * 
	 * @return
	 */
	public Map<String, Object> getCPU();

	/**
	 * 获取内存相关信息
	 * 
	 * @return
	 */
	public Map<String, Object> getMemory();

	/**
	 * 获取操作系统相关信息
	 * 
	 * @return
	 */
	public Map<String, Object> getOs();

	/**
	 * 文件系统
	 * @return
	 */
	public Map<String,Object> getFileSystem();
	
	public Map<String,Object> getNet();
	
	public Map<String,Object> getEthernet();
	
	public Map<String,Object> getJvmProperty();
	
}
