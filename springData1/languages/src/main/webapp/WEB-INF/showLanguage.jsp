<!-- library  -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- we have access to the language   -->
<p>Name: ${language.name}</p>  
<p>Name: ${language.creator}</p>
<p>Name: ${language.currentVersion}</p>
	
	<br>
	<a href="/languages/${language.id}/update">Edit</a>
	<a href="/languages/${language.id}/delete">delete</a>
	
	<a href="/languages/">Dashboard</a>	