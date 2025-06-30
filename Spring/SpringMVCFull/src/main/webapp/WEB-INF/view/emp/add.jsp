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
	<h2>Add New Employee</h2>
	<hr>
	<form:form action="save" modelAttribute="emp" >
		Name : <form:input path="ename" /> <br><br>
		
		Gender : 
			<form:radiobutton path="gender" value="male" /> Male
			<form:radiobutton path="gender" value="female" /> Female  <br><br>
		
		
		Qualification :
			<form:select path="qual">
				<form:option value="Bsc" label="Bsc" />
				<form:option value="BCA" label="BCA" />
				<form:option value="BE" label="BE" />
			</form:select>		<br><br>
			
		
				<input type="submit">
	</form:form>
</body>
</html>