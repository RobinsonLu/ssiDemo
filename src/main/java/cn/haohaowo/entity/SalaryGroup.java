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
 * SalaryGroup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "salary_groups")
public class SalaryGroup extends BasicBean implements Serializable {
	private static final long serialVersionUID = 6591010291335533650L;
	
	private String level;
	private Double base;
	private Double bonus;
	private Double other;
	private List<Associate> associates = new ArrayList<Associate>();

	@Column(name = "level", length = 2)
	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Column(name = "base", precision = 10)
	public Double getBase() {
		return this.base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	@Column(name = "bonus", precision = 10)
	public Double getBonus() {
		return this.bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	@Column(name = "other", precision = 10)
	public Double getOther() {
		return this.other;
	}

	public void setOther(Double other) {
		this.other = other;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "salaryGroup")
	public List<Associate> getAssociates() {
		return this.associates;
	}

	public void setAssociates(List<Associate> associates) {
		this.associates = associates;
	}
}