package com.ucap.ucapmetamodel.admincomp.account;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ucap.ucapmetamodel.admincomp.role.Role;

/**
 * @Title: Account.java
 * @Package com.ucap.ucapmetamodel.admincomp.account
 * @Description: 用户登陆
 * @author songzx
 * @date 2014年6月11日 上午10:31:30
 * @version V1.0
 */
@Entity
@Table(name = "ADMIN_ACCOUNT")
public class Account implements Serializable {
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date svaliddate = new Date();
	private Date evaliddate = new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 365 * 20);

	@OneToMany
	@JoinTable(name = "ADMIN_ACCOUNT_ROLES")
	private List<Role> roles = new ArrayList<>();

	@OneToOne
	private AccountInfo accountInfo;

	@OneToMany
	@JoinTable(name = "ADMIN_ACCOUNT_LOGINLOG")
	private List<LoginLog> loginLogs = new ArrayList<>();

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

	public Date getSvaliddate() {
		return svaliddate;
	}

	public void setSvaliddate(Date svaliddate) {
		this.svaliddate = svaliddate;
	}

	public Date getEvaliddate() {
		return evaliddate;
	}

	public void setEvaliddate(Date evaliddate) {
		this.evaliddate = evaliddate;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public AccountInfo getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

	public List<LoginLog> getLoginLogs() {
		return loginLogs;
	}

	public void setLoginLogs(List<LoginLog> loginLogs) {
		this.loginLogs = loginLogs;
	}

}
