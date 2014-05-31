package com.ucap.ucapmetamodel.example;

import java.io.File;
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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.aspectj.util.FileUtil;



/**
 * 
 * @ClassName: Teacher
 * @Description: TODO
 * @author 0000
 * @date 2014年3月31日 上午11:40:14
 *
 */
@Entity
@Table(name = "COMP_TEACHER")
public class Teacher implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7519843529684018789L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50)
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();
	@Column(length = 20, nullable = false)
	private String name;
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "teachers")
	private List<Student> students = new ArrayList<Student>();
	
	@Column(length = 100)
	private String imagepath;
	
	@Lob
	@Basic(fetch = FetchType.LAZY) 
	@Column(nullable=true) 
	private String _clod;
	
	@Lob
	@Basic(fetch = FetchType.LAZY) 
	@Column(nullable=true) 
	private String _blod;

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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public String get_clod() {
		return _clod;
	}

	public void set_clod(String _clod) {
		this._clod = _clod;
	}

	public String get_blod() {
		return _blod;
	}

	public void set_blod(String _blod) {
		this._blod = _blod;
	}
	
}
