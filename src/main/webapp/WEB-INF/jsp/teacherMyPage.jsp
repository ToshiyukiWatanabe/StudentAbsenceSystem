<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="model.Teacher" %>
 <% Teacher loginTeacher = (Teacher) session.getAttribute("teacher"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>クラス担任講師専用ページ</title>
</head>
<body>
<header>
<div class="container">
	<div class="header-left">
		<p>${ loginTeacher.getFamilyName() }
		   ${ loginTeacher.getGivenName() } さん、ログイン中</p>
	</div>
	<div class="header-right">
		<nav>
			<a href="/StudentAbsenceSystem/Logout">ログアウト</a>
		</nav>
	</div>
</div>
</header>
<dl>
<dd><a href="/WEB-INF/jsp/registerSubject.jsp">科目を登録する</a></dd>
<dd><a href="/WEB-INF/jsp/timetable.jsp">時間割を登録する</a></dd>
<dd><a href="/WEB-INF/jsp/studentlist.jsp">学生一覧を確認する</a></dd>
<dd><a href="WEB-INF/jsp/verifyApply.jsp">学生からの欠課申請を確認する</a></dd>
</dl>

</body>
</html>