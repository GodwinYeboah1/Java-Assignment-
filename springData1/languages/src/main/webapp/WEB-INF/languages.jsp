<!-- library  -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<table>
<!--row 1   -->
	<tr>
	<!-- table header  -->
		<th>Name: </th>
		<th>creator: </th>
		<th>Version: </th>
	</tr>
	<!-- for loop to loop your data  -->
	<c:forEach items="${languages}" var="lang">
		<tr>
		
			<td>${lang.name} </td>
			<td>${lang.creator} </td> 
			<td>${lang.currentVersion} </td>
		</tr>
		
	</c:forEach>
	
	
	
</table>

<!-- looks for the key Language which has a new Language()  -->
<!--  this is litterly setting your path with the setField in the backend-->

<form:form method="POST" action="/languages" modelAttribute="language" >
	<form:label path="name">Name:
    <form:errors path="name"/>
    <form:input type="text" path="name"/></form:label>
    <br>
  
    <form:label path="creator">Creator:
    <form:errors path="creator"/>
    <form:input type="text" path="creator"/></form:label>
     <br>
    <form:label path="currentVersion">currentVersion:
    <form:errors path="currentVersion"/>
    <form:input path="currentVersion"/></form:label>
    <br>

   <input type="submit" value="create Language!"/>
</form:form>
