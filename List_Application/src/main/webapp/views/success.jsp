<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="2px">

		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Description</th>
			<th>Completed</th>
			<th>createdAt</th>
		</tr>

		<c:forEach items="${data}" var="u">
			<tr>
				<td>${u.id}</td>
				<td>${u.title}</td>
				<td>${u.id}</td>
				<td>${u.completed}</td>
				<td>${u.createdAt}</td>
			</tr>
		</c:forEach>


	</table>
</body>
</html>