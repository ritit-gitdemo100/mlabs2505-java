<%
   String n1 = request.getParameter("uname");
    String n2 = request.getParameter("pass");
    if(n2.equals("admin"))
    {
%>

<jsp:useBean id="detail" class="mypack.user" scope="session" />
<jsp:setProperty name="detail" property="uname" value="<%=n1%>" />
<jsp:forward page="first.jsp" />                
<%
    }
else
{
        out.println("Password must be admin");
        out.println("<a href='login.jsp'>Login </a>");
        
}         
%>
