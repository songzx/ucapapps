package com.ucap.ucapmetamodel.example;

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
 * @Title: SingleTable.java
 * @Package com.ucap.ucapmetamodel.example
 * @Description: TODO
 * @author 0000
 * @date 2014年4月11日 下午7:39:02
 * @version V1.0
 */
@Entity
@Table(name = "SINGLETABLE")
public class SingleTable implements Serializable {
	@Id
	@GeneratedValue(generator = "uuid-hex")
	@Column(length = 50)
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();
	@Column(length = 20, nullable = false)
	private String name;
	
	@Lob
	private char[] chars;
	

	public char[] getChars() {
		return chars;
	}

	public void setChars(char[] chars) {
		this.chars = chars;
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

}
