<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page Directive</title>
</head>
<body>

	<%@ page import="java.util.Date"%>
	<%@ page import="java.util.ArrayList"%>

	<%
		String s1 = request.getParameter("t1");
		String s2 = request.getParameter("t2");
		ArrayList l = new ArrayList();
		l.add(s1);
		l.add(s2);
		out.print(l);
	%>

	<%
		Date d = new Date();
		out.print(d);
	%>


</body>
</html>