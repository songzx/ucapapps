package com.ucap.ucapmetamodel.admincomp.dept;

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

import com.ucap.ucapmetamodel.admincomp.account.Account;

/**
 * @Title: Dept.java
 * @Package com.ucap.ucapmetamodel.admincomp.dept
 * @Description: 部门,用于分类用户
 * @author songzx
 * @date 2014年6月12日 上午10:27:22
 * @version V1.0
 */
@Entity
@Table(name = "ADMIN_DEPT")
public class Dept implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50, name = "ID")
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();

	private String name;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(nullable = true)
	private String deptinfo;// json的方式,记录邮件,电话号码,图片(使用base64存储)

	@OneToOne
	@Column(name = "parentid")
	private Dept parentdept;

	@OneToMany
	@JoinTable(name = "ADMIN_DEPT_ACCOUNT")
	private List<Account> accounts = new ArrayList<>();

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

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

	public String getDeptinfo() {
		return deptinfo;
	}

	public void setDeptinfo(String deptinfo) {
		this.deptinfo = deptinfo;
	}

	public Dept getParentdept() {
		return parentdept;
	}

	public void setParentdept(Dept parentdept) {
		this.parentdept = parentdept;
	}

}
