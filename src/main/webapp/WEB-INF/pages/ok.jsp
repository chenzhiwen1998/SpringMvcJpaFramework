<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ok!!!!!!!</h1>
<table>
	<tr>
		<th>名称</th><th>单位</th><th>价格</th>
	</tr>
	<c:forEach items="${aa}" var="item" varStatus="status">
	<tr>
		<td>${item.name }</td><td>${item.unit }</td><td>${item.price }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>