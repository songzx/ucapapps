package com.ucap.ucapmetamodel.example;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @Title: One.java
 * @Package com.ucap.ucapmetamodel.example
 * @Description: TODO
 * @author 0000
 * @date 2014年4月21日 下午5:48:21
 * @version V1.0
 */
@Entity
@Table(name = "COMP_ONE")
public class One implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50)
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();
	@Column(length = 20, nullable = false)
	private String name;
	
	@OneToMany(mappedBy ="one")
	private List<Many> manies = new ArrayList<Many>();

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

	public List<Many> getManies() {
		return manies;
	}

	public void setManies(List<Many> manies) {
		this.manies = manies;
	}
	
}
