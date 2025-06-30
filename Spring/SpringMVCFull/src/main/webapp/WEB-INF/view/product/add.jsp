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
	<h2>Add New Product</h2>
	<hr>
	<form:form action="save" modelAttribute="product" >
		Product Name : <form:input path="pname" /> <br>
		Quantity : <form:input path="qty" /> <br>
		Price : <form:input path="price" /> <br>
		<input type="submit">
	</form:form>
</body>
</html>