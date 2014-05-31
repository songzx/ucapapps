package com.ucap.ucapmetamodel.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @Title: Manys2.java
 * @Package com.ucap.ucapmetamodel.example
 * @Description: TODO
 * @author 0000
 * @date 2014年4月22日 上午9:32:04
 * @version V1.0
 */
@Entity
@Table(name = "COMP_MANYS2")
public class Manys2 implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50)
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();
	@Column(length = 20, nullable = false)
	private String name;

	@ManyToMany
	@JoinTable(name="COMP_MANYS1_MANYS2",
    	joinColumns={@JoinColumn(name="MANYS1_ID", referencedColumnName="ID")},
    	inverseJoinColumns=@JoinColumn(name="MANYS2_ID", referencedColumnName="ID")
    )
	private Set<Manys1> manys1s = new HashSet<Manys1>();

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

	public Set<Manys1> getManys1s() {
		return manys1s;
	}

	public void setManys1s(Set<Manys1> manys1s) {
		this.manys1s = manys1s;
	}
	
}