<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Index</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css">	
		<script src="/js/main.js"></script>
	</head>

	<body>	
		<table>
			<thead>
				<tr>
					<th>name</th>
					<th>creator</th>
					<th>version</th>
					<th>action</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<!-- <td><a href="">delete edit</a></td> -->
				</tr>
			</tbody>
		</table>
		<p>this is the homepage</p>

		 <form:form method="Post" action="/new" modelAttribute="lang">
		 <br>
		 <form:label path="name"> Name
			<form:errors path="name"/>
			<form:input path="name"/>
		</form:label>
		<br>
		<form:label path="creator"> creator
			<form:errors path="creator"/>
			<form:input path="creator"/>
		</form:label>
		<br>
		<form:label path="version"> version
			<form:errors path="version"/>
			<form:input path="name"/>
		</form:label>
		<br>
		<input type="submit" value="submit">
		</form:form>
	</body>
</html>