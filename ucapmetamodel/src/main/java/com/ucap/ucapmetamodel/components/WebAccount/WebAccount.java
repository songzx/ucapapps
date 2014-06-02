package com.ucap.ucapmetamodel.components.WebAccount;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @Title: Account.java
 * @Package com.ucap.components.models
 * @Description: 帐号
 * @author 0000
 * @date 2014年6月1日 下午4:04:39
 * @version V1.0
 */

@Entity
@Table(name = "COMP_WEBACCOUNT")
public class WebAccount implements Serializable {
	public static final int ACCOUNT_TYPE_PERSON = 1;
	public static final int ACCOUNT_TYPE_ENTERPRISE = 2;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50)
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();
	@Column(length = 20, nullable = false)
	private String account;
	@Column(length = 20, nullable = false)
	private String passwd;

	private int loginnum;
	private int islock;
	private String aliasname;
	private int accounttype;
	
	@OneToOne
	private Person person ;
	@OneToOne
	private Enterprise enterprise ;
	@OneToMany
	private List<LoginLog> loginlogs = new ArrayList<>();
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
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getLoginnum() {
		return loginnum;
	}
	public void setLoginnum(int loginnum) {
		this.loginnum = loginnum;
	}
	public int getIslock() {
		return islock;
	}
	public void setIslock(int islock) {
		this.islock = islock;
	}
	public String getAliasname() {
		return aliasname;
	}
	public void setAliasname(String aliasname) {
		this.aliasname = aliasname;
	}
	public int getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(int accounttype) {
		this.accounttype = accounttype;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Enterprise getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}
	public List<LoginLog> getLoginlogs() {
		return loginlogs;
	}
	public void setLoginlogs(List<LoginLog> loginlogs) {
		this.loginlogs = loginlogs;
	}
	
}
