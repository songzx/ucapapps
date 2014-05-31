package com.ucap.ucapmetamodel.example;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @Title: Manys1.java
 * @Package com.ucap.ucapmetamodel.example
 * @Description: TODO
 * @author 0000
 * @date 2014年4月22日 上午9:31:50
 * @version V1.0
 */
@Entity
@Table(name = "COMP_MANYS1")
public class Manys1 implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50)
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();
	@Column(length = 20, nullable = false)
	private String name;
	@ManyToMany(mappedBy="manys1s")
	private Set<Manys2> manys2s = new HashSet<Manys2>();

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

	public Set<Manys2> getManys2s() {
		return manys2s;
	}

	public void setManys2s(Set<Manys2> manys2s) {
		this.manys2s = manys2s;
	}

}
