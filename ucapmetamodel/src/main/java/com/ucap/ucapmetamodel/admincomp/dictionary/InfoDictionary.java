package com.ucap.ucapmetamodel.admincomp.dictionary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @Title: InfoDictionary.java
 * @Package com.ucap.ucapmetamodel.admincomp.dictionary
 * @Description: 数据字典的细项
 * @author songzx
 * @date 2014年6月12日 下午1:22:51
 * @version V1.0
 */
@Entity
@Table(name = "ADMIN_INFODICTIONARY")
public class InfoDictionary implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50, name = "ID")
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();

	private String name;
	private String describe;
	private int ordernum;
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(nullable = true)
	private String infodictionaryinfo;//json的方式
	
	
}
