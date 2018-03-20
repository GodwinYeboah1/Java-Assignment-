<!-- dont forget to add this to use  werid java syntax -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <!--    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 -->
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<a href="/show" title=""> Home Page</a>
	
	<h1>Submitted info</h1>
			${name}

			${email}



	
</body>
</html>