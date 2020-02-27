<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
	<script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>

아이디 : <input type="text" id="userId" value=""> <br />
비밀번호 : <input type="password" id="userPw" value=""> <br />
<input type="submit" value="로그인">
<button type="button" id="btn-join">회원가입</button>

</body>

<script type="text/javascript">
	$(function() {
		$("#btn-join").on("click", function(e) {
			window.location.href="${path}/join.do";
		})
	})
</script>
</html>
