package com.ucap.ucapmetamodel.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * @Title: Score.java
 * @Package com.ucap.ucapmetamodel.example
 * @Description: TODO
 * @author 0000
 * @date 2014年3月31日 上午11:53:34
 * @version V1.0
 */
@Entity
@Table(name = "COMP_SCORE")
public class Score implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4249875499144766003L;
	public static final int SCORE_TYPE_CHINA=1;
	public static final int SCORE_TYPE_MATCH=2;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50)
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();
	
	@OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	private List<Student> students = new ArrayList<Student>();
	
	private float mark;
	private int type;
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
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
