<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
	table {
    width: 20%;
}

th {
    height: 30px;
}
</style>
<a href="/Dojo/showPage">Dashboard</a>
<a href="/Dojo/new">Dojo</a>
<a href="/ninjas/new">ninja</a>


<h1>Burbank Location Ninjas</h1>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name </th>
			<th> Age</th>
		</tr>
		<c:forEach items="${dojo.ninjas}" var="dj" >
				<tr>
					<td>${dj.firstName} </td>
					<td> ${dj.lastName} </td>
					<td> ${dj.age}</td>
				</tr>		
		</c:forEach>
	</table>