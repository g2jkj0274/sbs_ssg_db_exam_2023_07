package com.sbs.java.ssg.dto;

import java.util.Map;
import lombok.Data;
import lombok.Getter;

@Data
public class Article extends Dto {
	public String title;
	public String body;
	public int hit;
	public int memberId;
	public int boardId;
	
	public Article(int id, String regDate, int memberId, int boardId, String title, String body) {
		this(id, regDate, memberId, boardId, title, body, 0);
	}
	public Article(int id, String regDate, int memberId, int boardId, String title, String body, int hit) {
		this.id = id;
		this.regDate = regDate;
		this.memberId = memberId;
		this.boardId = boardId;
		this.title = title;
		this.body = body;
		this.hit = hit;
	}
	public Article(Map<String, Object> row) {
		super(row);
		this.title = (String) row.get("title");
		this.body = (String) row.get("body");
		this.memberId = (int) row.get("memberId");
		this.boardId = (int) row.get("boardId");
	}
	public void increseHit() {
		hit++;
	}
}