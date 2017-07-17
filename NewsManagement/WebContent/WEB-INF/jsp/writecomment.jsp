<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="${pageContext.request.contextPath }/submitcomment" method="post">
			<table border="0" cellpadding="10" cellspacing="0" align="center">
				<caption style="font-size: 20px">增加评论</caption>
				<tr align="center">
				<td>
					评论内容*
				</td>
				<td>
					<textarea name="context" cols="50" rows="10" ></textarea>
				</td>
				</tr>
				<tr>
				<td>
					评论人
				</td>
				<td>
					<input type="text" name="author"/>
				</td>
				</tr>
				<tr align="center">
				<td colspan="2">
					<input type="submit" value="提交"/><a href="${pageContext.request.contextPath }/returncomment">返回</a>
				</td>
				</tr>
			</table>
		</form>
</body>
</html>