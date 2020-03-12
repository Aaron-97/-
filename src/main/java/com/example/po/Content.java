package com.example.po;


public class Content {
      private int id;
      private String name;
      private String introduce;
      private String picture;
      private String sort;
	public Content(int id, String name, String introduce, String picture,String sort) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.introduce = introduce;
		this.picture = picture;
		this.sort = sort;
	}
	public Content( String name, String introduce, String picture, String sort) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.introduce = introduce;
		this.picture = picture;
		this.sort = sort;
	}
	public Content() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Content [id=" + id + ", name=" + name + ", introduce=" + introduce + ", picture=" + picture + ", sort="
				+ sort + "]";
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
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
}
