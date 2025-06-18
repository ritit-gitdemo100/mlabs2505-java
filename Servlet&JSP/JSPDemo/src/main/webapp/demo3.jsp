<%-- 
This program describes the three components of JSP
(Declarations, Expression & Comment)
Apart from Scriptlets 
Now this is the syntax of JSP comment
<%!  Declaration %>
<%  Scriptlet  %>
<%= expression %>
--%>

<%! 
    //Declartion Syntax
    int a, b;
%>

<%
    a = 5;
    b = 3;
%>

<html>
    <body bgcolor="cyan">
  
        First Number : <%=a%> <br>
        Second Number : <%=b%> <br>
        Sum : <%=(a+b)%>
    </body>
</html>