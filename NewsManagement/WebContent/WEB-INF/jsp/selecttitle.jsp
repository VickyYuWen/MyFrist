<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1 align="center">新闻管理系统</h1>
		
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
			<tr>
				<th>新闻编号</th>
				<th>新闻标题</th>
				<th>新闻摘要</th>
				<th>作者</th>
				<th>创建时间</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${nList }" var="list">
			<tr>
				<td> ${list.id }</td>
				<td> ${list.title }</td>
				<td> ${list.summary }</td>
				<td> ${list.author }</td>
				<td> ${list.creantedate }</td>
				<td>
					<a href="${pageContext.request.contextPath }/selectcomment?id=${list.id }">查看评论</a>
					<a href="${pageContext.request.contextPath }/selectcomment?id=${list.id }">评论</a>
					<a href="${pageContext.request.contextPath }/selectcomment?id=${list.id }">删除</a>
				</td>
			</tr>
			</c:forEach>
		</table>
</body>
</html>