package com.suntossh.data.entities;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.AccessType;

@Entity
@Table(name = "FINANCES_USER")
@Access(value = javax.persistence.AccessType.PROPERTY)
public class User {

	/*
	 * select * from account_typeCREATE TABLE `finances_user` ( `USER_ID`
	 * bigint(20) NOT NULL AUTO_INCREMENT, `FIRST_NAME` varchar(45) NOT NULL,
	 * `LAST_NAME` varchar(45) NOT NULL, `BIRTH_DATE` date NOT NULL,
	 * `EMAIL_ADDRESS` varchar(100) NOT NULL, `LAST_UPDATED_BY` varchar(45) NOT
	 * NULL, `LAST_UPDATED_DATE` datetime NOT NULL, `CREATED_BY` varchar(45) NOT
	 * NULL, `CREATED_DATE` datetime NOT NULL, `USER_ADDRESS_LINE_1`
	 * varchar(100) DEFAULT NULL, `USER_ADDRESS_LINE_2` varchar(100) DEFAULT
	 * NULL, `CITY` varchar(100) DEFAULT NULL, `STATE` varchar(2) DEFAULT NULL,
	 * `ZIP_CODE` varchar(5) DEFAULT NULL, PRIMARY KEY (`USER_ID`) )
	 * ENGINE=InnoDB DEFAULT CHARSET=utf8;
	 */

	private Long userId;

	private String firstName;

	private String lastName;

	private Date birthDate;

	private String emailAddress;

	private Date lastUpdatedDate;

	private String lastUpdatedBy;

	private Date createdDate;

	private String createdBy;

	private String userAddressLine1;

	private String userAddressLine2;

	private String city;

	private String state;

	private String zipCode;

	@Column(name = "USER_ADDRESS_LINE_1")
	public String getUserAddressLine1() {
		return userAddressLine1;
	}

	public void setUserAddressLine1(String userAddressLine1) {
		this.userAddressLine1 = userAddressLine1;
	}

	@Column(name = "USER_ADDRESS_LINE_2")
	public String getUserAddressLine2() {
		return userAddressLine2;
	}

	public void setUserAddressLine2(String userAddressLine2) {
		this.userAddressLine2 = userAddressLine2;
	}

	@Column(name = "CITY")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "STATE")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "ZIP_CODE")
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "BIRTH_DATE")
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name = "EMAIL_ADDRESS")
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Column(name = "LAST_UPDATED_DATE")
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Column(name = "LAST_UPDATED_BY")
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Column(name = "CREATED_DATE")
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "CREATED_BY")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
