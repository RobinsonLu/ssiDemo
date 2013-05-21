package cn.haohaowo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Leave entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "leaves")
public class Leave extends BasicBean implements Serializable {
	private static final long serialVersionUID = 1963367479484147688L;
	
	private Associate associateByAssociateId;
	private Associate associateByManageId;
	private String reason;
	private Date begin;
	private Date end;
	private String status;
	private String result;
	private Date passDate;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "associate_id")
	public Associate getAssociateByAssociateId() {
		return this.associateByAssociateId;
	}

	public void setAssociateByAssociateId(Associate associateByAssociateId) {
		this.associateByAssociateId = associateByAssociateId;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_id")
	public Associate getAssociateByManageId() {
		return this.associateByManageId;
	}

	public void setManager_id(Associate associateByManageId) {
		this.associateByManageId = associateByManageId;
	}

	@Column(name = "reason", length = 65535)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "begin")
	public Date getBegin() {
		return this.begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "end")
	public Date getEnd() {
		return this.end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	@Column(name = "status", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "result", length = 65535)
	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "pass_date")
	public Date getPassDate() {
		return this.passDate;
	}

	public void setPassDate(Date passDate) {
		this.passDate = passDate;
	}

}