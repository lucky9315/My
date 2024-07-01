package com.Lucky.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class ContactUs 
{
	@GeneratedValue
	@Id
	private int queryNo;
	
	@NotNull(message = "please enter name")
	private String name;
	
	@jakarta.validation.constraints.Email(message = "please enter a valid email")
	private String email;
	
	@NotNull(message = "please enter a subject")
	private String subject;
	
	@NotNull(message = "please enter name")
	private String message;
	
	
	public int getQueryNo() {
		return queryNo;
	}
	public void setQueryNo(int queryNo) {
		this.queryNo = queryNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactUs [queryNo=" + queryNo + ", name=" + name + ", email=" + email + ", subject=" + subject
				+ ", message=" + message + "]";
	}
	
	
	
	
}
