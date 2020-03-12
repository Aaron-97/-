package com.example.po;


public class Index {
      private int id;
      private String name;
      private String address;
      private String picture;
	public Index(int id, String name, String address, String picture) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.picture = picture;
		
		
	}
	public Index( String name, String address, String picture) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.address = address;
		this.picture = picture;
	}
	public Index() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Index [id=" + id + ", name=" + name + ", address=" + address + ", picture=" + picture + "]";
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	
	
}
