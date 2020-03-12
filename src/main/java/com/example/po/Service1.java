package com.example.po;


public class Service1 {
      private int id;
      private String name;
      private String phonenum;
      private String picture;
	public Service1(int id, String name, String phonenum, String picture) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.phonenum = phonenum;
		this.picture = picture;
	}
	public Service1( String name, String phonenum, String picture) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.phonenum = phonenum;
		this.picture = picture;
	}
	public Service1() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "Service1 [id=" + id + ", name=" + name + ", phonenum=" + phonenum + ", picture=" + picture + "]";
	}
	
	
}
