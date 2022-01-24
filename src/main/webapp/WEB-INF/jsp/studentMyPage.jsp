<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Student" %>
<% Student loginStudent = (Student) session.getAttribute("student"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生専用ページ</title>
</head>
<body>
	<header>
		<div class="header-left">
		<p>$ { loginStudent.getFamilyName() }
		   $ { loginStudent.getGivenName() } さん、ログイン中</p>
		</div>
		<div class="header-right">
			<nav>
			<a href="/StudentAbsenceSystem/Logout">ログアウト</a>
			</nav>
		</div>
	</header>
<dl>
	<dd><a href="/WEB-INF/jsp/timetable.jsp">時間割を確認する</a>
	<dd><a href="/WEB-INF/jsp/apply.jsp">欠課申請をする</a>
	<dd><a href="WEB-INF/jsp/applyResult.jsp">申請した結果の確認をする</a>
</dl>
</body>
</html>