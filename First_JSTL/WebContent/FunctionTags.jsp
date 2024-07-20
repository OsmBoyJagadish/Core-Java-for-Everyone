<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Functions Tags</title>
</head>
<body>

<c:set var="s" value="I am a boy"></c:set>
<c:set var="s1" value="I am <abc> second boy </abc>"></c:set>
<h1> <c:out value="${s}"></c:out> </h1>

<c:out value="${fn:length(s)}"></c:out>
<c:out value="${fn:toUpperCase(s)}"></c:out>
<c:out value="${fn:toLowerCase(s)}"></c:out>
<c:out value="${fn:contains(s,'am')}" ></c:out>
<c:out value="${fn:containsIgnoreCase(s,'BOY')}"></c:out>
<c:out value="${fn:endsWith(s,'oy') }"></c:out>



</body>
</html>