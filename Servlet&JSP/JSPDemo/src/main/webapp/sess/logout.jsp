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
   // session.removeAttribute("name");
    session.invalidate();
%>
<html>
    <body>
        <h1>You are Logged Out Successfully</h1>
        <hr>
        <a href="index.jsp">Login</a>
        
    </body>
</html>

<%
}
%>