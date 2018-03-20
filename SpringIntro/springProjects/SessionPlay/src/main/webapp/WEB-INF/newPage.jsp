<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- message on top  -->
<h3>You have visited <a href= "/">http://localhost:8080</a> <c:out  value= "${count}"/> Times </h3>

<!-- back to the home page  -->
<a href="/">Test Another visit</a> <br>

<!-- add 2  -->
<a href="/counter2">Click me, to add 2 additional counts</a> <br>

<!-- reset set button  -->
<a href="/reset">reset </a>