<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Teacher" %>
<% Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン結果</title>
</head>
<body>
<h1>ログイン</h1>
	<p>ログインに成功しました。</p>
	<p>ようこそ○○さん</p>

	<a href="/WEB-INF/mypage.jsp">マイページへ</a>
</body>
</html>