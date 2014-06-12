package com.ucap.ucapmetamodel.admincomp.dictionary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @Title: Dictionary.java
 * @Package com.ucap.ucapmetamodel.admincomp.dictionary
 * @Description: 数据字典,用树构建
 * @author songzx
 * @date 2014年6月12日 上午10:53:53
 * @version V1.0
 */
@Entity
@Table(name = "ADMIN_DICTIONARY")
public class Dictionary implements Serializable {
	public static final int DICTIONARY_TYPE_BASE = 1;
	public static final int DICTIONARY_TYPE_INFO = 2;// 用于信息项的发布

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50, name = "ID")
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();

	private String name;
	private int ordernum;
	private String describe;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(nullable = true)
	private String dictionaryinfo;// json的方式
	private int type = DICTIONARY_TYPE_BASE;

	@OneToOne
	@Column(name = "parentid")
	private Dictionary parentdictionary;

	@OneToMany
	@JoinTable(name="ADMIN_DICTIONARY_INFO")
	private List<InfoDictionary> infoDictionaries = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(int ordernum) {
		this.ordernum = ordernum;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getDictionaryinfo() {
		return dictionaryinfo;
	}

	public void setDictionaryinfo(String dictionaryinfo) {
		this.dictionaryinfo = dictionaryinfo;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Dictionary getParentdictionary() {
		return parentdictionary;
	}

	public void setParentdictionary(Dictionary parentdictionary) {
		this.parentdictionary = parentdictionary;
	}

	public List<InfoDictionary> getInfoDictionaries() {
		return infoDictionaries;
	}

	public void setInfoDictionaries(List<InfoDictionary> infoDictionaries) {
		this.infoDictionaries = infoDictionaries;
	}

}
