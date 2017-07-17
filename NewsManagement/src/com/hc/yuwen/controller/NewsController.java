package com.hc.yuwen.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hc.yuwen.entities.NewsComment;
import com.hc.yuwen.entities.NewsDetail;
import com.hc.yuwen.service.NewsCommentService;
import com.hc.yuwen.service.NewsService;

@Controller
public class NewsController {
	@Autowired
	NewsService newsService;
	@Autowired
	NewsCommentService newsCommentService;
	@RequestMapping("/selectBytitle")
	public String selectBytitle(@RequestParam("keyword")String keyword,Map<String, Object> map){
		
		
		List<NewsDetail> nList = newsService.selectBykeyword(keyword);
		map.put("nList", nList);
		
		return "selecttitle";
	}
	@RequestMapping("/selectcomment")
	public String selectcomment(@RequestParam("id")int id,Map<String, Object> map){
		
		List<NewsComment> list  = newsCommentService.selectCommentById(id);
		map.put("list", list);
		return "newscomment";
	}
	//查看评论
	@RequestMapping("/gocomment")
	public String gocomment(Map<String, Object> map){
		
		List<NewsComment> list = newsCommentService.selectAllCommentById();
		map.put("list", list);
		return "newscomment";
	}
	//写评论
	@RequestMapping("/writecomment")
	public String writecomment(@RequestParam("id")int id,HttpSession session){
		
		session.setAttribute("id", id);
		return "writecomment";
	}
	//返回新闻列表
	@RequestMapping("/returnNewsDetail")
	public String returncomment(Map<String, Object> map){
		List<NewsDetail> nList = newsService.selectNews();
		map.put("nList", nList);
		return "index";
	}
	//删除评论
	@RequestMapping("/deletecomment")
	public String deletecomment(@RequestParam("id")int id){
		newsCommentService.deletecommentById(id);
		
		return "redirect:/index";
		
	}
	//提交评论
	@RequestMapping("/submitcomment")
	public String submitcomment(HttpSession session,@RequestParam("context")String context
			,@RequestParam("author")String author){
		int newsid = (int) session.getAttribute("id");
		Date createdate = new Date();
		System.out.println(createdate);
		NewsComment newsComment = new NewsComment();
		newsComment.setNewsid(newsid);
		newsComment.setAuthor(author);
		newsComment.setContent(context);
		newsComment.setCreatedate(createdate);
		newsCommentService.insretComment(newsComment);

		return "redirect:/gocomment";
	}
}
