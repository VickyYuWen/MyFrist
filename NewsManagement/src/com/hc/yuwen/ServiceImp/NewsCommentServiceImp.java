package com.hc.yuwen.ServiceImp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc.yuwen.dao.NewsCommentMapper;
import com.hc.yuwen.dao.NewsDetailMapper;
import com.hc.yuwen.entities.NewsComment;
import com.hc.yuwen.service.NewsCommentService;
@Service("newsComment")
public class NewsCommentServiceImp implements NewsCommentService{
	@Autowired
	NewsDetailMapper newsDetailMapper;
	@Autowired
	NewsCommentMapper newsCommentMapper;
	@Override
	public List<NewsComment> selectCommentById(int id) {
		
		List<NewsComment> ncList =  newsCommentMapper.selectCommentByPrimaryKey(id);
		
		return ncList;
	}
	@Override
	public List<NewsComment> selectAllCommentById() {
		List<NewsComment> nlist = newsCommentMapper.selectByExample(null);
		return nlist;
	}
	@Override
	public void deletecommentById(int id) {
		newsCommentMapper.deleteComment(id);
		int aaa = newsDetailMapper.deleteByPrimaryKey(id);
		System.out.println(aaa);
		
	}
	//查看全部评论
	@Override
	public List<NewsComment> selectAllComment() {
		List<NewsComment> list = newsCommentMapper.selectByExample(null);
		return list;
	}
	@Override
	public void insretComment(int newsid) {
		
	}
	@Override
	public void insretComment(String context, String author, Date creantedate, int newsid) {
		
		
	}
	@Override
	public void insretComment(NewsComment newsComment) {
		newsCommentMapper.insert(newsComment);
		
	}
	
}
