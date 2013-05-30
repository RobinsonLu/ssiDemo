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
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "users")
public class User extends BasicBean implements Serializable {
	private static final long serialVersionUID = 3843108325637098125L;
	
	private Integer associate_id;
	private String name;
	private String password;
	private String status;
	private List<UserRole> roles = new ArrayList<UserRole>();
	
	
	@Column(name = "name", length = 25)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", length = 25)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "status", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public List<UserRole> getRoles() {
		return this.roles;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	@Column(name = "associate_id", length = 11)
	public Integer getAssociate_id() {
		return associate_id;
	}

	public void setAssociate_id(Integer associate_id) {
		this.associate_id = associate_id;
	}
}