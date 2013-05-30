package cn.haohaowo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Salary entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "salaries")
public class Salary extends BasicBean implements Serializable {
	private static final long serialVersionUID = -7564514541580081035L;
	
	private Associate associate;
	private String month;
	private Double base;
	private Double bonus;
	private Double other;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "associate_id")
	public Associate getAssociate() {
		return this.associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	@Column(name = "month", length = 10)
	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
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

}