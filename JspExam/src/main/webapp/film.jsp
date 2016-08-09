<%@page import="java.util.ArrayList"%>
<%@page import="zcj.enity.Film"%>
<%@page import="java.util.List"%>
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
 <a href = "/JspExam/add.jsp">增加</a>

<table border="1">
  		<tr><td>Film_id</td><td>Title</td><td>Description</td><td>Language</td></tr>
<%
           ArrayList<Film> ls = (ArrayList)request.getAttribute("list");
           for(int i=0;i<ls.size();i++)
           {
        	   Film film = (Film)ls.get(i);
           
%>
		<tr>
			<td><%=film.getFilm_id() %></td>
			<td><%=film.getTitle() %></td>
			<td><%=film.getDescription() %></td>
			<td><%=film.getLanguage() %></td>
			<td><a href="/JspExam/FilmServlet1?type=delete&Film_id=<%=film.getFilm_id() %>">删除</a>
		</tr>
 <%} %>
	</table>

</body>
</html>