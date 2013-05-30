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
 * Department entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "departments")
public class Department extends BasicBean implements Serializable {
	private static final long serialVersionUID = 7690079697239114071L;
	
	private String name;
	private List<Associate> associates = new ArrayList<Associate>();

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "department")
	public List<Associate> getAssociates() {
		return this.associates;
	}

	public void setAssociates(List<Associate> associates) {
		this.associates = associates;
	}
}