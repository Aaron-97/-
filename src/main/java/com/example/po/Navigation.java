package com.example.po;


public class Navigation {
      private int id;
      private String name;
      private String address;
     
      private String sort;
     
	public Navigation(int id, String name, String address,int status,String sort,String fid,String target) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		
		this.sort = sort;
	

	}
	public Navigation( String name, String address) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.address = address;
	}
	public Navigation() {
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	@Override
	public String toString() {
		return "Navigation [id=" + id + ", name=" + name + ", address=" + address + ", sort=" + sort + "]";
	}
	
	
}
