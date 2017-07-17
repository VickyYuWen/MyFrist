package com.hc.yuwen.dao;

import com.hc.yuwen.entities.NewsDetail;
import com.hc.yuwen.entities.NewsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsDetailMapper {
    int countByExample(NewsDetailExample example);

    int deleteByExample(NewsDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsDetail record);

    int insertSelective(NewsDetail record);

    List<NewsDetail> selectByExample(String keyword);

    NewsDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsDetail record, @Param("example") NewsDetailExample example);

    int updateByExample(@Param("record") NewsDetail record, @Param("example") NewsDetailExample example);

    int updateByPrimaryKeySelective(NewsDetail record);

    int updateByPrimaryKey(NewsDetail record);

	List<NewsDetail> selectBykeyword(String keyword);
}