package com.example.po;


public class Copyright {
      private int id;
      private String name;
      private String coding;
	public Copyright(int id, String name, String coding) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.coding=coding;
	}
	public Copyright( String name, String coding) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.coding=coding;
	}
	public Copyright() {
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
	public String getCoding() {
		return coding;
	}
	public void setCoding(String coding) {
		this.coding = coding;
	}
	@Override
	public String toString() {
		return "Copyright [id=" + id + ", name=" + name + ", coding=" + coding + "]";
	}
	
}
