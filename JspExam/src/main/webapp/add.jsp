<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加页面</title>

</head>
<body>
<form action="FilmServlet1?type=add" method="post">
Title : <input type="text" name="Title">
Description : <input type="text" name="Description">
Language_id ： <select name="Language_id">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
</select>
<br>
<input type="submit" value="确定">
</form>
</body>
</html>