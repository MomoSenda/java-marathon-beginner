<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>名前</th>
		<td><c:out value="${user.name}" /></td>
	</tr>
	
	<tr>
		<th>年齢</th>
		<td><c:out value="${user.age}" />歳</td>
	</tr>
	
	<tr>
		<th>住所</th>
		<td><c:out value="${user.address}" /></td>
	</tr>

</table>

</body>
</html>