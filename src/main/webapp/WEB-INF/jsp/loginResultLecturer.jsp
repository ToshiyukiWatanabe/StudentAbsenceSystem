<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Lecturer" %>
<%  Lecturer loginLecturer = (Lecturer) session.getAttribute("lecturer"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン成功</title>
</head>
<body>
<h1>ログイン成功</h1>
<p>ログインに成功しました。</p>
	<p>ようこそ
		${ loginLecturer.getFamilyName() }
		${ loginLecturer.getGivenName() } 
		さん</p>
	<a href="/StudentAbsenceSystem/LecturerMyPage">授業担当講師マイページへ</a>
</body>
</html>