package com.urskart.model;
import javax.persistence.*;

import org.hibernate.annotations.ForeignKey;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="LOGIN")
public class LoginClass 
{
  @Id
  @GeneratedValue
  long id;
  String userName;
  String password;
public LoginClass(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}
public long getId() {
	return id;
}
public void setId(long id) 
{
	this.id = id;
}
public String getUserName() 
{
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "LoginClass [id=" + id + ", userName=" + userName + ", password=" + password + "]";
}
  
  
  
  
  
 
}
