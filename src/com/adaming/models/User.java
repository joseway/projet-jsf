package com.adaming.models;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User {
	private String name;
	private String email;
	private String gender;
	private String[] courses;
	public User() {}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	public String[] getGenderOptions() {
		return new String[] {"Male", "Female"};
	}
	public String[] getAllCourses() {
		return new String[] {"Java", "SQL", "Angular"};
	}
}
