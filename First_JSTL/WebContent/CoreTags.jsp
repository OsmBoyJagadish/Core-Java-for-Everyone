<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Core Tags</title>
</head>
<body>

<c:out value="${'Welcome to javaTpoint'}"/><br>

<c:import var ="data" url="NewFile.jsp"></c:import>
<c:out value="${data}"></c:out><br>

<c:set var="i" value="${15*5}" scope="session"></c:set>
<c:out value="${i}"></c:out><br>

<c:remove var="i"/>
After remove tag, the value is :  <c:out value="${i}"></c:out><br>

<c:set var ="j" value="${10}" scope="session"></c:set>

<c:if test="${j==10}">
<h2>j is 10</h2>
</c:if>

<!-- choose,when,otherwise  is same as java switch -->

<c:choose>
	<c:when test="${j>5}">
		<h3>yes, 1st case is correct</h3>
	</c:when>
	<c:when test="${j<8}">
		<h3>yes, 2nd case is correct</h3>
	</c:when>
	
	<c:otherwise>
		<h3>Default case... both are wrong</h3>
	</c:otherwise>
</c:choose>

<c:forEach var="x" begin="1" end="10">
	<h4> Value of x is : <c:out value="${x}"></c:out> </h4>
</c:forEach>

<c:url var="myurl" value="https://www.google.com/search">
	<c:param name="q" value="javatpoint"></c:param>
</c:url>
<c:out value="${myurl}"></c:out>

<%-- <c:redirect url="${myurl}"></c:redirect> --%>

<%-- <c:redirect url="https://www.google.com"></c:redirect>   --%>

<c:forTokens var="name" items="Rahul-Nakul-Rajesh" delims="-">  
  <h3> <c:out value="${name}"/> </h3>
</c:forTokens>  

</body>
</html>