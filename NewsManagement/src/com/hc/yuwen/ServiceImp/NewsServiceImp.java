package com.hc.yuwen.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc.yuwen.dao.NewsDetailMapper;
import com.hc.yuwen.entities.NewsDetail;
import com.hc.yuwen.service.NewsService;
@Service("newsService")
public class NewsServiceImp implements NewsService{
	
	@Autowired
	NewsDetailMapper newsDetailMapper;
	@Override
	public List<NewsDetail> selectNews() {
		
		List<NewsDetail> nList = newsDetailMapper.selectByExample(null);
		return nList;
	}
	@Override
	public List<NewsDetail> selectBykeyword(String keyword) {
		
		List<NewsDetail> nList = newsDetailMapper.selectBykeyword(keyword);
		System.out.println(nList);
		return nList;
	}

}
