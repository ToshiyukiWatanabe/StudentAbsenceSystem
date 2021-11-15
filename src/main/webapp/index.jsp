<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>公欠申請管理システム</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/WEB-INF/css/top.css">
</head>
<body>
<h1>公欠申請管理システム</h1>
<div class="entry">
	<div class="register">
		<h2>アカウント作成</h2>
		<h3 class="teacher">クラス担任講師の方は<a href="registerTeacher.jsp">こちら</a></h3>
		<h3 class="lecturer">授業担当講師の方は<a href="registerLecturer.jsp">こちら</a></h3>
	</div>
	<div class="login">
		<h2><a href="login.jsp">ログイン</a></h2>
	</div>
</div>
</body>
</html>