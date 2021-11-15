<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<% User loginUser = (User) session.getAttribute("loginUser"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン結果</title>
</head>
<body>
<h1>ログイン</h1>
<% if(loginUser != null) { %>
	<p>ログインに成功しました。</p>
	<p>ようこそ<%= loginUser.getFamilyName() %> + <%= loginUser.getGivenName() %>さん</p>

<% } else { %>
	<p>ログインに失敗しました</p>
	<a href="/">TOPへ</a>

<% } %>
</body>
</html>