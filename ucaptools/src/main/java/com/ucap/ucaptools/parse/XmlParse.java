package com.ucap.ucaptools.parse;

import java.util.Iterator;

import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.configuration.tree.xpath.XPathExpressionEngine;

/**   
 * @Title: XmlParse.java 
 * @Package com.ucap.ucaptools.parse 
 * @Description: TODO 
 * @author songzx
 * @date 2014年8月7日 下午5:12:06 
 * @version V1.0   
 */
public class XmlParse {

	public static void main(String[] args) throws Exception{
		
		XMLConfiguration xmlConfiguration = new XMLConfiguration();
		xmlConfiguration.setEncoding("UTF-8");
		//xmlConfiguration.setDefaultExpressionEngine(new XPathExpressionEngine());
		xmlConfiguration.load("D:/coding/ucapexample/ucapexample/tjreport/src/main/webapp/cmsreport/ldfl.xml");
		
		for(Iterator it = xmlConfiguration.getKeys(); it.hasNext();){
			String key =(String) it.next();
			System.out.println(key+"|"+xmlConfiguration.getString(key)+"<br/>");
		}
		
		System.out.println(xmlConfiguration.getStringArray("item[@id=\"领导分类\"].item.content.name")[0]);
	}
}
