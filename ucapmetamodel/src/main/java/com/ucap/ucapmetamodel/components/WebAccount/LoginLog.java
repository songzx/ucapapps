package com.ucap.ucapmetamodel.components.WebAccount;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @Title: LoginLog.java
 * @Package com.ucap.ucapmetamodel.components.WebAccount
 * @Description: 登陆日志
 * @author 0000
 * @date 2014年6月1日 下午4:14:53
 * @version V1.0
 */
@Entity
@Table(name = "COMP_WEBACCOUNT_LOGINLOG")
public class LoginLog implements Serializable {
	private static final int ACCOUNT_LOG_LOGIN=1;
	private static final int ACCOUNT_LOG_LOCK=2;
	private static final int ACCOUNT_LOG_MODIFY=3;
	private static final int ACCOUNT_LOG_MODIFYPASSWD=4;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50)
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date operdate = new Date();
	
	/**
	 * 以json方式储存K,V
	 */
	@Lob
	private char[] content;

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

	public Date getOperdate() {
		return operdate;
	}

	public void setOperdate(Date operdate) {
		this.operdate = operdate;
	}

	public char[] getContent() {
		return content;
	}

	public void setContent(char[] content) {
		this.content = content;
	}
	
}
