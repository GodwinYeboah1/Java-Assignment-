<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- you need the / always it looks for it  -->
<h2>New Person</h2><br>
<form:form method="Post" action="/save/new" modelAttribute="Person" >
   <form:label path="firstname">Name
    <form:errors path="firstname"/>
    <form:input path="firstname"/></form:label>
    <br>
    <form:label path="lastname">Creator
    <form:errors path="lastname"/>
    <form:textarea path="lastname"/></form:label>
    <br>
    <input type="submit" value="create"/>
</form:form>