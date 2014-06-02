package com.ucap.ucapmetamodel.components.WebAccount;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @Title: Person.java
 * @Package com.ucap.ucapmetamodel.components.WebAccount
 * @Description: TODO
 * @author 0000
 * @date 2014年6月1日 下午4:19:01
 * @version V1.0
 */
@Entity
@Table(name = "COMP_WEBACCOUNT_PERSON")
public class Person implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50)
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();
	
	private String idcard;

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

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	
	
}
