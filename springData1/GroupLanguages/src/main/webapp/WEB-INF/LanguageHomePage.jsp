<html>
<!-- table at the top  -->
<table>
	<thead>
	<tr>
		<th>
		Name
		</th>
		<th>
			creator
		</th>
		<th>
			currentVersion
		</th>
		<th>
			action
		</th>
	</tr>
	</thead>
	<c:forEach items="${Language}" var="lang">
	<tbody>
		<tr>
			<td>
				${Lang.title}
			</td>
			<td>
				${Lang.creator}
			</td>
			<td>
				${Lang.currentVersion}
			</td>
			<td>
				<a href="language/delete">delete</a>
				<a href="language/edit">edit</a>
			</td>
		</tr>
	</tbody>
	</c:forEach>
</table>

<table> 
	<c:forEach items="${Language}" var="lang">
	   	<c:out value="${Lang.title}"/>
	 	<c:out value="${Lang.creator}"/>
	   	<c:out value="${Lang.currentVersion}"/>
	</c:forEach>
</table>

<!-- form bellow -->

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- you need the / always it looks for it  -->

<form:form method="Post" action="/languages/new" modelAttribute="language" >
    <form:label path="title">Name
    <form:errors path="title"/>
    <form:input path="title"/></form:label>
    <br>
    <form:label path="creator">Creator
    <form:errors path="creator"/>
    <form:textarea path="creator"/></form:label>
    <br>
    <form:label path="currentVersion">Version
    <form:errors path="currentVersion"/>
    <form:input path="currentVersion"/></form:label>
    <br>
    <input type="submit" value="Submit"/>
</form:form>

<!-- modelAttribute=""
 -->

</html>