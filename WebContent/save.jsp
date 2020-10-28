<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>保存客户信息</title>
</head>
<body>
   <form action="save" method="post">
   账号：<input type="text" name="id">
   <br>
   密码：<input type="password" name="password">
   <br>
   性别:<input type="radio"name="sex" value="m">男
   		<input type="radio"name="sex" value="f">女
   		<br>
   <input type="submit"value="提交">
   </form>
</body>
</html>