package com.hc.yuwen.service;

import java.util.Date;
import java.util.List;

import com.hc.yuwen.entities.NewsComment;

public interface NewsCommentService {

	List<NewsComment> selectCommentById(int id);

	List<NewsComment> selectAllCommentById();

	void deletecommentById(int id);

	List<NewsComment> selectAllComment();

	void insretComment(int newsid);

	void insretComment(String context, String author, Date creantedate, int newsid);

	void insretComment(NewsComment newsComment);
	
}
