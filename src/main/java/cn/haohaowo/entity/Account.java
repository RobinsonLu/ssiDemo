package cn.haohaowo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */
/**
 */
@Entity(name = "cn.haohaowo.entity.Account")
@Table(name = "accounts")
public class Account extends BasicBean implements Serializable{
	private static final long serialVersionUID = -6202308271947462660L;
	private Associate associate;
	private String no;
	private String status;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "account")
	@JoinColumn(name="associate_id")
	public Associate getAssociate() {
		return this.associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	@Column(name = "no", length = 25)
	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Column(name = "status", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}