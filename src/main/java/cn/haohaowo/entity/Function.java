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
 * Function entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "functions")
public class Function extends BasicBean implements Serializable {
	private static final long serialVersionUID = -4230624175074569312L;
	
	private String name;
	private List<FunctionRole> roles = new ArrayList<FunctionRole>();
	private List<Url> urls = new ArrayList<Url>();

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
	public List<FunctionRole> getRoles() {
		return this.roles;
	}

	public void setRoles(List<FunctionRole> roles) {
		this.roles = roles;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "function")
	public List<Url> getUrls() {
		return this.urls;
	}

	public void setUrls(List<Url> urls) {
		this.urls = urls;
	}

}