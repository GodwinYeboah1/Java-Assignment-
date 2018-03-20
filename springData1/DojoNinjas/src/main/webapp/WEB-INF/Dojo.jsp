<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="/Dojo/showPage">Dashboard</a>
<a href="/Dojo/new">Dojo</a>
<a href="/ninjas/new">ninja</a>
<h1>New Dojo </h1>

<!-- form bellow  -->
	<form:form action="/Dojo/new/create" method="POST" modelAttribute="Dojo">
		<form:label path="name"> Name:
			<form:errors path="name"/>
			<form:input path="name"/><br>
			<input type="submit" value="create">		
		</form:label>
	</form:form>

