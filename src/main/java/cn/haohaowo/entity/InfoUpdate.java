package cn.haohaowo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * InfoUpdate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "info_updates")
public class InfoUpdate implements java.io.Serializable {
	private static final long serialVersionUID = -8723940918878409220L;
	
	private Associate associateByAssociateId;
	private Associate associateByHrId;
	private String address;
	private String phone;
	private String email;
	private String status;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "associate_id")
	public Associate getAssociateByAssociateId() {
		return this.associateByAssociateId;
	}

	public void setAssociateByAssociateId(Associate associateByAssociateId) {
		this.associateByAssociateId = associateByAssociateId;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "hr_id")
	public Associate getAssociateByHrId() {
		return this.associateByHrId;
	}

	public void setAssociateByHrId(Associate associateByHrId) {
		this.associateByHrId = associateByHrId;
	}

	@Column(name = "address", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "phone", length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "status", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}