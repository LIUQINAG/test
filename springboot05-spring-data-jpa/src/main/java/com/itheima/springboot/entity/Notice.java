package com.itheima.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notice {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id; // bigint(20) NOT NULL AUTO_INCREMENT,
	@Column(name="CONTENT")
	private String content; // longtext,
	@Column(name="TITLE")
	private String title; // varchar(200) DEFAULT NULL,
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Notice [id=" + id + ", content=" + content + ", title=" + title + "]";
	}

	

}
