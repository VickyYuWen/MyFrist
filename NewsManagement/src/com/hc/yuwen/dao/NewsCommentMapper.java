package com.hc.yuwen.dao;

import com.hc.yuwen.entities.NewsComment;
import com.hc.yuwen.entities.NewsCommentExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsCommentMapper {
    int countByExample(NewsCommentExample example);

    int deleteByExample(NewsCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsComment record);

    int insertSelective(NewsComment record);

    List<NewsComment> selectByExample(NewsCommentExample example);

    int  selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsComment record, @Param("example") NewsCommentExample example);

    int updateByExample(@Param("record") NewsComment record, @Param("example") NewsCommentExample example);

    int updateByPrimaryKeySelective(NewsComment record);

    int updateByPrimaryKey(NewsComment record);

	List<NewsComment> selectCommentByPrimaryKey(@Param("id")int id);

	void deleteComment(int id);

	void updateBynewsid(@Param("context")String context, @Param("author")String author, @Param("creantedate")Date creantedate, @Param("newsid")int newsid);
}