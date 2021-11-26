<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント作成【クラス担任講師】</title>
</head>
<body>
<h1>アカウント作成【クラス担任講師】</h1>
        <form action="/StudentAbsenceSystem/RegisterTeacher" method="post">

        <dl>
        	<dt>id(英数字20字以内)</dt>
        	<dd><input type="text" name="id" autocapitalize="id" size="20"></dd>
            <dt>姓</dt>
            <dd><input type="text" name="familyName" autocomplete="familyName" size="10"></dd>

            <dt>名</dt>
            <dd><input type="text" name="givenName" autocomplete="givenName" size="10"></dd>

            <dt>担当学科</dt>
            <dd><select name="course">
                <option value="">選択してください</option>
                <option value="Child">こども保育幼稚園科（３年制）</option>
                <option value="Medical">医療秘書・事務科（２年制）</option>
                <option value="Office">事務・ビジネス総合科（２年制）</option>
                <option value="Business">ビジネスライセンス科（１年制）</option>
                <option value="Public2">公務員・法律行政科（２年制）</option>
                <option value="Public1">公務員専攻科（１年制）</option>
                <option value="InfoSystem">情報システム科（２年制）</option>
                <option value="GameCG">ゲーム・CGクリエイター科（３年制）</option>
            </select></dd>

            <dt>担当学年</dt>
            <dd><label><input type="checkbox" name="first" value="○">１年</label>
                <label><input type="checkbox" name="second" value="○">２年</label>
                <label><input type="checkbox" name="third" value="○">３年</label></dd>


            <dt>パスワード</dt>
            <dd><input type="password" name="password"></dd>

            </dl>
            <button type="submit">登録</button>
            <button type="reset">リセット</button>
        </form>
        <a href="index.jsp">TOP</a>

</body>
</html>