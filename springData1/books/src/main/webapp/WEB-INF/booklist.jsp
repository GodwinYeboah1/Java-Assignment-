<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- ... -->
<ul> 
	<li>
	<c:forEach items="${books}" var="book">
   	<c:out value="${book.title}"/>
 	<c:out value="${book.description}"/>
   	<c:out value="${book.language}"/>
  	  <c:out value="${book.numberOfPages}"/>
	<li>
</c:forEach>
</ul>
<ul> 
	<li>
	<c:forEach items="${books}" var="book">
   	<c:out value="${book.title}"/>
 	<c:out value="${book.description}"/>
   	<c:out value="${book.language}"/>
  	  <c:out value="${book.numberOfPages}"/>
	<li>
</c:forEach>
</ul>
<!-- ... -->
