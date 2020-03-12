package com.example.po;

import java.io.Serializable;
import java.util.Date;


/**
 * 相册
 * @author 吴宗波
 *
 */

public class Album  implements Serializable{
	
	private Integer id;
	
	private String imagePath;
	
	private Integer width;
	
	private Integer height;
	
	private String name;
	
	private String tags;//花，菊花
	
	private Date createTime;
	

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	

}
