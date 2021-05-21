package com.sbs.selenium.exam.dto;

public class DCInsideArticle {
	private int id;
	private String title;
	private String writer;
	private String regDate;
	private int hit;
	private int recommend;

	public DCInsideArticle(int id, String title, String writer, String regDate, int hit, int recommend) {
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.regDate = regDate;
		this.hit = hit;
		this.recommend = recommend;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	
}
