package com.urskart.model;
import javax.persistence.*;
@Entity
@Table(name="USER")
public class User
{  
   @Id
   @GeneratedValue
   public long id;
   public String name;
   public String lastName;
   public String dateOfBirth;
   public String mobileNo;
   public String password;
public User(String name, String lastName, String dateOfBirth, String mobileNo, String password) {
	super();
	this.name = name;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.mobileNo = mobileNo;
	this.password = password;
}
public User() {
	super();
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
			+ ", mobileNo=" + mobileNo + ", password=" + password + "]";
}
   
   
   
   
}
