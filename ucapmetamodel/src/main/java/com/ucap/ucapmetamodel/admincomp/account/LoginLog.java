package com.ucap.ucapmetamodel.admincomp.account;

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
 * @Title: LoginLog.java
 * @Package com.ucap.ucapmetamodel.admincomp.account
 * @Description: 登陆日志
 * @author songzx
 * @date 2014年6月12日 上午10:19:55
 * @version V1.0
 */
@Entity
@Table(name = "ADMIN_ACCOUNTLOG")
public class LoginLog implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50, name = "ID")
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(nullable = true)
	private String loginfo;//json的方式,记录IP,Mac,logintime,loginsuccess

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

	public String getLoginfo() {
		return loginfo;
	}

	public void setLoginfo(String loginfo) {
		this.loginfo = loginfo;
	}

}
