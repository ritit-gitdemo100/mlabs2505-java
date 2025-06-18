<%@page session="true" %>

<%
if(session.getAttribute("name") == null)
       {
%>
<jsp:forward page="invalid.jsp" />
<%
}
else
{
    String name = (String)session.getAttribute("name");
%>
<html>
    <body>
        <h1>Welcome to Second Page</h1>
        <hr>
        <font color="red"> <%=name%> </font>
        <br>
        <a href="third.jsp" > Next </a> | <a href="logout.jsp">Logout</a>
        
    </body>
</html>

<%
}
%>