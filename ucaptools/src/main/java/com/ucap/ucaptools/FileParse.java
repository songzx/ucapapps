package com.ucap.ucaptools;

import java.io.InputStream;
import java.util.Map;

/**
 * @Title: FileParse.java
 * @Package com.ucap.ucaptools
 * @Description: 文件解析: excel,word,xml,properties,csv ;
 * 参考:http://commons.apache.org/proper/commons-configuration/userguide/user_guide.html
 * @author 0000
 * @date 2014年6月1日 上午2:42:12
 * @version V1.0
 */
public interface FileParse {

	/**
	 * 解析excel文件成K-V,其中K使用:sheet-row-column,
	 * 例如要读取第一页第二行第三列的值,则为: Map.get("1-2-3")
	 * @param excel
	 * @return
	 */
	Map<String,Object> parseexcel(InputStream excel);
	
	String parseword(InputStream word);
	
	Map<String,String> parsecsv(InputStream csv);
	
}
