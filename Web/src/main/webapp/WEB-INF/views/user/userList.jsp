<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>

table {
	width: 50%;
	border: 1px solid #444444;
}

th, td {
	border: 1px solid #444444;
}

</style>

<body>

	<table>
		<thead>
			<tr>
				<th style="width: 20%; text-align: center;">아이디</th>
				<th style="width: 15%; text-align: center;">비밀번호</th>
				<th style="width: 15%; text-align: center;">이름</th>
				<th style="width: 20%; text-align: center;">H.P</th>
				<th style="width: 15%; text-align: center;">생년월일</th>
				<th style="width: 15%; text-align: center;">E-Mail</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userList}" var="userVO" varStatus="rowCount">
				<tr>
					<td>${userVO.userId}</td>
					<td>${userVO.userPw}</td>
					<td>${userVO.userName}</td>
					<td>${userVO.userPhone}</td>
					<td>${userVO.userBirth}</td>
					<td>${userVO.userEmail}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>