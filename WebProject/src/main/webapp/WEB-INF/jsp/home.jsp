<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
	<script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>

<button type="button" id="btn-login">로그인하기</button>

</body>

<script type="text/javascript">
	$(function() {
		$("#btn-login").on("click", function(e) {
			window.location.href="${path}/login.do";
		})
	});
</script>
</html>
