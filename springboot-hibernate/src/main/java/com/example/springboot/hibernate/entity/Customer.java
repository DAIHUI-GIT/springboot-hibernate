package com.example.springboot.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2353814806282224862L;
	/** 主键 */
	@Id
	private Integer id;
	/** 企业编码 */
	@Column(name = "code")
	private String code;
	/** 企业名称 */
	@Column(name = "name")
	private String name;
	/** 联系人 */
	@Column(name = "contacts")
	private String contacts;
	/** 电话 */
	@Column(name = "telephone")
	private String telephone;
	/** 移动电话 */
	@Column(name = "mobile")
	private String mobile;
	/** 传真 */
	@Column(name = "fax")
	private String fax;
	/** 邮箱 */
	@Column(name = "email")
	private String email;
	/** 地址 */
	@Column(name = "address")
	private String address;
	/** 是否禁用 */
	@Column(name = "disabled")
	private Integer disabled;
	
	public Customer() {
		super();
	}
	
	public Customer(Integer id, String code, String name, String contacts, String telephone, String mobile, String fax,
			String email, String address, Integer disabled) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.contacts = contacts;
		this.telephone = telephone;
		this.mobile = mobile;
		this.fax = fax;
		this.email = email;
		this.address = address;
		this.disabled = disabled;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getDisabled() {
		return disabled;
	}
	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", code=" + code + ", name=" + name + ", contacts=" + contacts + ", telephone="
				+ telephone + ", mobile=" + mobile + ", fax=" + fax + ", email=" + email + ", address=" + address
				+ ", disabled=" + disabled + "]";
	}
}
