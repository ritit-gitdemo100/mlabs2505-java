<%@page session="true" %>

<%
String name = request.getParameter("txt_key");
session.setAttribute("name", name);
%>
<jsp:forward page="first.jsp" />
