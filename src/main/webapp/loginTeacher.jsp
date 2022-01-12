<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>クラス担任講師用ログインページ</title>
</head>
<body>
<h1>クラス担任講師用ログインページ</h1>
<form action="/StudentAbsenceSystem/LoginTeacher" method="post">
<dl>
	<dt>ユーザーID</dt>
	<dd><input type="text" name="loginId" size="20"></dd>

	<dt>パスワード</dt>
	<dd><input type="password" name="password"></dd>
</dl>
<button type="submit">ログイン</button>
</form>
<font color="red">${error}</font>

<p><a href="index.jsp">TOP</a></p>
<p>クラス担任講師用登録ページは<a href="registerTeacher.jsp">こちら</a>から</p>
</body>
</html>