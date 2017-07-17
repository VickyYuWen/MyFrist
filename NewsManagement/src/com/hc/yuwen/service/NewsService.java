package com.hc.yuwen.service;

import java.util.List;

import com.hc.yuwen.entities.NewsDetail;

public interface NewsService {

	List<NewsDetail> selectNews();

	List<NewsDetail> selectBykeyword(String keyword);

}
