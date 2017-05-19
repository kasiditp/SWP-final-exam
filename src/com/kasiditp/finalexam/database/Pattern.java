package com.kasiditp.finalexam.database;

public class Pattern {
	private String name;
	private Integer id;
	private String group;
	private String implementation;
	
	public String getGroup() {
		return group;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getImplementation() {
		return implementation;
	}
	public void setImplementation(String implementation) {
		this.implementation = implementation;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", group=" + group + ", implementation=" + implementation + "]";
	}

}
