<%@page import="java.util.Calendar" %>
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
<h2>合計金額</h2>

■税抜き価格
<fmt:formatNumber value="${totalPrice}" pattern="###,###" />円
<br>
■税込み価格
<fmt:formatNumber value="${taxTotalPrice}" pattern="###,###" />円
</body>
</html>