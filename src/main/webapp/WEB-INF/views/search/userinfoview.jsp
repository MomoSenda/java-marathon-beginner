<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>詳細情報</h2>
名前：<c:out value="${user.name}" /><br>
年齢：<c:out value="${user.age}" /><br>
住所：<c:out value="${user.address}" /><br>
</body>
</html>