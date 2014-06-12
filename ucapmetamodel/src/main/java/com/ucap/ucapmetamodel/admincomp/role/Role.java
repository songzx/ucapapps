package com.ucap.ucapmetamodel.admincomp.role;

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

import com.ucap.ucapmetamodel.admincomp.authz.Function;
import com.ucap.ucapmetamodel.admincomp.authz.Menu;

/**   
 * @Title: Role.java 
 * @Package com.ucap.ucapmetamodel.admincomp.role 
 * @Description: 角色控制权限,粒度控制到角色
 * @author songzx
 * @date 2014年6月12日 上午10:33:15 
 * @version V1.0   
 */
@Entity
@Table(name = "ADMIN_ROLE")
public class Role implements Serializable {
	public static final int ROLE_TYPE_BASE = 1;//普通角色
	public static final int ROLE_TYPE_DATA = 2;//数据角色,如每建一个部门,同时添加一个部门角色
	public static final int ROLE_TYPE_FUNCTION = 3;//功能点角色
	public static final int ROLE_TYPE_WORKFLOW = 4;//工作流角色
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-hex")
	@Column(length = 50, name = "ID")
	private String id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createdate = new Date();
	
	private String name;
	private String describe;
	private int type = Role.ROLE_TYPE_BASE;
	
	@OneToOne
	@Column(name="parentid")
	private Role parentrole;
	
	@OneToMany
	@JoinTable(name="ADMIN_ROLE_MENU")
	private List<Menu> menus = new ArrayList<>();
	
	/**
	 * 功能点,只有在角色为功能点角色才能选择其菜单下面的功能点
	 */
	@OneToMany
	@JoinTable(name="ADMIN_ROLE_FUNCTION")
	private List<Function> functions = new ArrayList<>();
	
	
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
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Role getParentrole() {
		return parentrole;
	}
	public void setParentrole(Role parentrole) {
		this.parentrole = parentrole;
	}
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	public List<Function> getFunctions() {
		return functions;
	}
	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}
}
