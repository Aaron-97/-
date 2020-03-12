package com.example.po;

import java.util.ArrayList;
import java.util.List;

public class BackstageDTO {
	private Integer id;

    private String name;


    private String url;

    private Integer ids;
    
    private List<BackstageDTO> children = new ArrayList<BackstageDTO>();
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getIds() {
		return ids;
	}

	public void setIds(Integer ids) {
		this.ids = ids;
	}

	public List<BackstageDTO> getChildren() {
		return children;
	}

	public void setChildren(List<BackstageDTO> children) {
		this.children = children;
	}

		
}
