<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Lecturer" %>
<% Lecturer loginLecturer = (Lecturer) session.getAttribute("lecturer"); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>授業担当講師専用ページ</title>
</head>
<body>
<header>
	<div class="header-left">
	<p>${ loginLecturer.getFamilyName() }
	   ${ loginLecturer.getGivenName() } さん、ログイン中</p>
	</div>
	<div class="header-right">
		<nav>
			<a href="/StudentAbsenceSystem/Logout">ログアウト</a>
		</nav>
	</div>
</header>
</body>
</html>