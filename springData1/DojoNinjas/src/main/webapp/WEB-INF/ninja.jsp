<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="/Dojo/showPage">Dashboard</a>
<a href="/Dojo/new">Dojo</a>
<a href="/ninjas/new">ninja</a>

<h1>New Ninja</h1>
<!-- form bellow  -->
	<form:form action="" modelAttribute="ninja">
		<form:label path="dojo"> Dojo:
			<form:select path="dojo">
				<c:forEach items="${dojos}" var="dojo">
					<form:option value="${dojo.id}">${dojo.name}</form:option>
				</c:forEach>
			</form:select>
		</form:label><br>
		
		<!-- path name has to be identical to model property -->
		<form:label path="firstName">FirstName:
			<form:errors  path="firstName"/>
			<form:input path="firstName"/>
		</form:label>
		<br>
		<!-- path name has to be identical to model property -->
		<form:label path="lastName">LastName:
			<form:errors  path="lastName"/>
			<form:input path="lastName"/>
		</form:label>
		<br>
		<!-- path name has to be identical to model property -->
		<form:label path="age">Age:
			<form:errors  path="age"/>
			<form:input path="age"/>
		</form:label>
		<br>
		<input type="submit" value="create">
	</form:form>