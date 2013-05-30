package cn.haohaowo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Url entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "urls")
public class Url extends BasicBean implements java.io.Serializable {
	private static final long serialVersionUID = -3979107978355216413L;
	
	private Function function;
	private String url;


	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "function_id")
	public Function getFunction_id() {
		return function;
	}

	public void setFunction_id(Function function) {
		this.function = function;
	}
}