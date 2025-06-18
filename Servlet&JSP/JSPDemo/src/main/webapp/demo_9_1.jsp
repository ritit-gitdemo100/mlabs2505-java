<%
    String n1 = request.getParameter("uname");
    String n2 = request.getParameter("pass");
    
    if(n1.equals("rit") && n2.equals("infotech"))
      {

%>
<jsp:forward page="demo_9_welcome.jsp"/>
<%        
    }
    else
    {
%>
<jsp:forward page="demo_9_invalid.html"/>
<%         
    }
%>