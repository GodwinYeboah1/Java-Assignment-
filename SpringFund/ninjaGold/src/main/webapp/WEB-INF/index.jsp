<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Index</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css">	
	
		<!-- style the middle section with css -->
		<style>
			#content{
				/* border: 2px solid black; */
				height: 50vh;
				width: 800px;
				padding: 12px;
				display: flex;
			}
			#middleSection{
				border: 2px solid black;
				height: 20vh;
				width: 100px;
				text-align: center;
				display: flex;
				margin: 30px;
			}	
			#commet{
				border: 2px solid black;
				height: 20vh;
				width: 100px
			}
			#bottomSection{
				display: inline-block;
				/* border: 2px solid black; */
				height: 20vh;
				width: 825px;
				padding: 10px;
			}
			#activites{
				border: 2px solid black;
				height: 10vh;
				width: 599px;
				margin-left: 20px;
				margin-bottom: 20px;
				overflow: scroll;
			}
		</style>
	</head>	

	<body>
		<h3>Your Gold:  ${totalGold}</h3>

		<div id="content">
			
					<div id="middleSection">
							<form action="/process" method="Post">
								<label for="farm"> farm</label> <br>
								<p>(Earn 10- 20 gold)</p><br>
								<input type="submit"  name ="farm" value="find gold">
							</form> <br>
					</div>
					<div id="middleSection" method="Post">
							<form action="/process" method="Post">
								<label for="Cave"> Cave</label> <br>
								<p>(Earn 5-10 gold)</p><br>
								<input type="submit"  name ="cave" value="find gold">
							</form>
					</div>
					<div id="middleSection">
							<form action="/process" method="Post">
								<label for="House"> House</label> <br>
								<p>(Earn 2 - 5 gold)</p><br>
								<input type="submit"  name ="house" value="find gold">
							</form>
					</div>
					<div id="middleSection">
							<form action="/process" method="Post">
								<label for="Casino"> Casino!!</label> <br>
								<p>(Earn/take 0 - 50 gold)</p><br>
								<input type="submit"  name ="casino" value="find gold">
							</form>
						</div>
				</div>
				<div id="bottomSection">
						<h4>Activites:</h4><br>
						<div id="activites" >
							${farm} <br>
							${cave} <br>
							${house} <br>
							${casino} <br>
							
						</div>
					</div>
				
	</body>
</html>