package cn.haohaowo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Associate entity. @author MyEclipse Persistence Tools
 */
@Entity(name = "cn.haohaowo.entity.Associate")
@Table(name = "associates")
public class Associate extends BasicBean implements Serializable {
	private static final long serialVersionUID = -776066768917188029L;
	
	private Associate manager;
	private SalaryGroup salaryGroup;
	private Department department;
	private String name;
	private Date birthday;
	private String sex;
	private String address;
	private String phone;
	private String email;
	private String status;
	private String idNumber;
	private String type;
	private String asNumber;
	private List<Leave> leavesForManageId = new ArrayList<Leave>();
	private List<Leave> leavesForAssociateId = new ArrayList<Leave>();
	private List<InfoUpdate> infoUpdatesForAssociateId = new ArrayList<InfoUpdate>();
	private List<InfoUpdate> infoUpdatesForHrId = new ArrayList<InfoUpdate>();
	private List<Associate> associates = new ArrayList<Associate>();
	private List<Salary> salaries = new ArrayList<Salary>();
	private Account account;
	private User user;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_id")
	public Associate getManager() {
		return this.manager;
	}

	public void setManager(Associate manager) {
		this.manager = manager;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "salary_group_id")
	public SalaryGroup getSalaryGroup() {
		return this.salaryGroup;
	}

	public void setSalaryGroup(SalaryGroup salaryGroup) {
		this.salaryGroup = salaryGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id")
	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Column(name = "name", length = 25)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "birthday", length = 0)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "sex", length = 1)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

	@Column(name = "id_number", length = 25)
	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@Column(name = "type", length = 10)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "as_number", length = 25)
	public String getAsNumber() {
		return this.asNumber;
	}

	public void setAsNumber(String asNumber) {
		this.asNumber = asNumber;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associateByManageId")
	public List<Leave> getLeavesForManageId() {
		return this.leavesForManageId;
	}

	public void setLeavesForManageId(List<Leave> leavesForManageId) {
		this.leavesForManageId = leavesForManageId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associateByAssociateId")
	public List<Leave> getLeavesForAssociateId() {
		return this.leavesForAssociateId;
	}

	public void setLeavesForAssociateId(List<Leave> leavesForAssociateId) {
		this.leavesForAssociateId = leavesForAssociateId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associateByAssociateId")
	public List<InfoUpdate> getInfoUpdatesForAssociateId() {
		return this.infoUpdatesForAssociateId;
	}

	public void setInfoUpdatesForAssociateId(
			List<InfoUpdate> infoUpdatesForAssociateId) {
		this.infoUpdatesForAssociateId = infoUpdatesForAssociateId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associateByHrId")
	public List<InfoUpdate> getInfoUpdatesForHrId() {
		return this.infoUpdatesForHrId;
	}

	public void setInfoUpdatesForHrId(List<InfoUpdate> infoUpdatesForHrId) {
		this.infoUpdatesForHrId = infoUpdatesForHrId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "manager")
	public List<Associate> getAssociates() {
		return this.associates;
	}

	public void setAssociates(List<Associate> associates) {
		this.associates = associates;
	}

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associate")
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associate")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associate")
	public List<Salary> getSalaries() {
		return this.salaries;
	}

	public void setSalaries(List<Salary> salaries) {
		this.salaries = salaries;
	}
}