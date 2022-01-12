<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント作成【授業担当講師】</title>
</head>
<body>
<form action="/StudentAbsenceSystem/RegisterLecturer" method="post">
        <dl>
        	<dt>id(英数字20字以内)</dt>
        	<dd><input type="text" name="loginId" autocapitalize="loginId" size="20"></dd>
            <dt>姓</dt>
            <dd><input type="text" name="familyName" autocomplete="familyName" size="10"></dd>

            <dt>名</dt>
            <dd><input type="text" name="givenName" autocomplete="givenName" size="10"></dd>

            <dt>パスワード：</dt>
            <dd><input type="password" name="password"></dd>

            </dl>
            <button type="submit">登録</button>
            <button type="reset">リセット</button>
        </form>

<a href="index.jsp">TOP</a>
</body>
</html>