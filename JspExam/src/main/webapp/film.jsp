<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>film页面</title>
</head>
<body>
<form action="FilmServlet" method="post">
<input type="submit" value="获取film信息">

</form>
<a href="<%=request.getContentLength() %>/index.jsp">index.jsp</a>
</body>
</html>