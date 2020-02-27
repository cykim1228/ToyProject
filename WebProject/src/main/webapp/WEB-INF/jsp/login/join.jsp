<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
	<script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>
	<form action="${path}/join.do" method="post">
		아이디 : <input type="text" name="userId" value=""> <br />
		비밀번호 : <input type="text" name="userPw" value=""> <br />
		이름 : <input type="text" name="userName" value=""> <br />
		핸드폰 : <input type="text" name="userPhone" value=""> <br />
		생일 : <input type="text" name="userBirth" value=""> <br />
		이메일 : <input type="text" name="userEmail" value=""> <br />
		<input type="submit" value="입력">
	</form>
	
</body>
</html>