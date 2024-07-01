package com.Lucky.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Solution 
{
	@Id
	@GeneratedValue(generator = "solution_generator")
	@SequenceGenerator(name  = "solution_generator" , allocationSize = 1,initialValue = 7)
	private int id;
	
	
	private String name;
	private String img;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Solution [name=" + name + ", img=" + img + "]";
	}
	
	
	
}
