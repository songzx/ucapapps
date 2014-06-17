package com.ucap.components.listen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Title: UcapSystemListener.java
 * @Package com.ucap.components.listen
 * @Description: TODO
 * @author 0000
 * @date 2014年4月14日 下午12:28:56
 * @version V1.0
 */
public class UcapSystemListener implements ServletContextListener {
	private static Logger logger = null;
	
	@Override
	public void contextDestroyed(ServletContextEvent servletcontextevent) {
		logger.info("应用配置监听正在销毁.....");
	}

	@Override
	public void contextInitialized(ServletContextEvent servletcontextevent) {
		//从servletContext获取路径
		//String realpath = servletcontextevent.getServletContext().getRealPath("/");
		//String basicconfig = realpath + "WEB-INF/resources/basicconfig/sysconfigpath.properties";
		
		//从classpath:获取路径
		String realpath = UcapSystemListener.class.getResource("/").getPath();
		String basicconfig = realpath + "configs/sysconfigpath.properties";
		
		String contextpath = servletcontextevent.getServletContext().getRealPath("/");
		
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(basicconfig));

			String serverdir = properties.getProperty(UcapSystemConfigConst.SERVER_BASICDIR);
			String tmpdir = serverdir + "tmpdir/";
			String logdir = serverdir + "logs/";
			String encoding = properties.getProperty(UcapSystemConfigConst.WEBAPP_ENCODING);
			String indexs = serverdir+"indexs/";

			System.setProperty(UcapSystemConfigConst.SERVER_BASICDIR, serverdir);
			System.setProperty(UcapSystemConfigConst.WEBAPP_BASICDIR, contextpath);
			System.setProperty(UcapSystemConfigConst.WEBAPP_LOG_BASICDIR, logdir);
			System.setProperty(UcapSystemConfigConst.WEBAPP_JAVA_IO_TMPDIR, tmpdir);
			System.setProperty(UcapSystemConfigConst.WEBAPP_ENCODING, encoding);
			System.setProperty(UcapSystemConfigConst.WEBAPP_INDEXS, indexs);
			

			File serverfile = new File(serverdir);
			if (!serverfile.exists()) {
				serverfile.mkdirs();
			}
			File tmpfile = new File(tmpdir);
			if (!tmpfile.exists()) {
				tmpfile.mkdirs();
			}
			File logfile = new File(logdir);
			if (!logfile.exists()) {
				logfile.mkdirs();
			}

			logger = LoggerFactory.getLogger(UcapSystemListener.class);
			for(Iterator<Object> it = properties.keySet().iterator();it.hasNext();){
				String key = (String) it.next();
				System.setProperty(key, properties.getProperty(key).trim().replaceFirst("classpath:", realpath).replaceFirst("contextpath:", contextpath));
				
				logger.info(key+" : "+ properties.getProperty(key).trim().replaceFirst("classpath:", realpath).replaceFirst("contextpath:", contextpath));
			}
			logger.info("应用配置监听正在启动....");
			logger.info("－－－－－－－－－－－－－－－－应用基本配置－－－－－－－－－－－－－－－－－－－－－－－－");
			logger.info("｜－－－服务器根路径：" + serverdir);
			logger.info("｜－－－应用根路径：" + contextpath);
			logger.info("｜－－－应用存放自定义日志路径：" + logdir);
			logger.info("｜－－－应用临时存放文件路径：" + tmpdir);
			logger.info("－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－");
		} catch (FileNotFoundException e) {
			System.out.println("系统配置文件不存在；"+basicconfig);
			System.exit(0);
		} catch (IOException e) {
			System.out.println("配置文件被使用，不能正确读取。");
			System.exit(0);
		}
	}
}
