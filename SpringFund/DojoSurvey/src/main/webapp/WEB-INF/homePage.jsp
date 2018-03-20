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
		<a href="/result"> Result page</a>
			<!-- create dojo homePage  -->
			<h1>Dojo Survey</h1>
			<form action="/process" method="Post" accept-charset="utf-8">
				Your Name: <input type="text" name="userName"><br>
				Dojo Location: <select name="location" id="">
								<option value="dalsa">Dalsa</option>
								<option value="NewYork">NewYork</option>
								<option value="DC"> DC</option>
							</select><br>
				Favorite Langauge: <select name="lang" id="">
									<option value="c++">c++</option>
									<option value="C#"> C#</option>
									<option value="python">python</option>
									<option value="java">java</option>
									<option value="javascript"> javascript</option>
								</select><br>
				Comment : (optional) <br>
						<textarea name="comment" id="" cols="30" placeholder="....."  rows="10"></textarea>
						<br>
						<input type="submit" value="Button">
					</form>
	</body>
</html>