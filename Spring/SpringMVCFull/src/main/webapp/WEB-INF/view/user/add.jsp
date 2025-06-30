<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>UserLogi</h2>
	<hr>
	<form:form action="login" method="post" modelAttribute="user">
	
		Username : <form:input path="uname" /> <br><br>
		Password : <form:password path="password" /> <br><br>

		<input type="submit" value="login">
	</form:form>
</body>
</html>