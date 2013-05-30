package cn.haohaowo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "roles")
public class Role extends BasicBean implements Serializable {
	private static final long serialVersionUID = -195000782575119737L;
	
	private String name;
	private List<FunctionRole> functions = new ArrayList<FunctionRole>();
	private List<UserRole> users = new ArrayList<UserRole>(0);

	@Column(name = "name", length = 25)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
	public List<FunctionRole> getFunctions() {
		return this.functions;
	}

	public void setFunctions(List<FunctionRole> functions) {
		this.functions = functions;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
	public List<UserRole> getUsers() {
		return this.users;
	}

	public void setUsers(List<UserRole> users) {
		this.users = users;
	}

}