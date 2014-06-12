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
 * @Title: AccountInfo.java 
 * @Package com.ucap.ucapmetamodel.admincomp.account 
 * @Description: 帐号详细信息
 * @author songzx
 * @date 2014年6月11日 上午10:45:43 
 * @version V1.0   
 */
@Entity
@Table(name = "ADMIN_ACCOUNTINFO")
public class AccountInfo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50, name = "ID")
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();
	@Column(length = 100, nullable = false)
	private String email;
	private String tel;
	private String mobile;
	
	@Lob
	@Basic(fetch = FetchType.LAZY) 
	@Column(nullable=true) 
	private byte[] photo;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
}
