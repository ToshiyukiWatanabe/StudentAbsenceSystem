<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
<h1>ログインしてください</h1>
<form action="/StudentAbsenceSystem/Login" method="post">
ユーザーID：<input type="text" name="name"><br>
パスワード：<input type="password" name="password"><br>
<input type="submit" value="ログイン">
</form>
<h2>新規登録の方は<a href="index.jsp">こちら</a>から</h2>
<p><a href="index.jsp">戻る</a></p>
</body>
</html>