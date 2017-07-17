<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1 align="center">新闻评论列表</h1>
		
		<form action="selectBytitle" method="post">
		<table border="0" cellpadding="20" cellspacing="0" align="center">
		<tr>
		<th>
			新闻标题<input type="text" name="keyword"/><input type="submit" value="查询" />
		</th>
		</tr>
		</table>
		</form>
		<table border="1" cellpadding="10" cellspacing="0" align="center">
		<caption align="top">
			评论列表       <a href="${pageContext.request.contextPath }/returnNewsDetail">返回新闻列表</a>
		</caption>
			<tr>
				<th>评论编号</th>
				<th>评论内容</th>
				<th>评论人</th>
				<th>评论时间</th>
			</tr>
			<c:forEach items="${list }" var="list">
			<tr>
				<td>${list.id }</td>
				<td>${list.content }</td>
				<td>${list.author }</td>
				<td><fmt:formatDate  value="${list.createdate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
			</tr>
			</c:forEach>
		</table>
</body>
</html>