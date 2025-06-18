 <%!
 String uname,upass;
 %>
 
 <%
    uname = request.getParameter("txt_uname");
    upass = request.getParameter("pwd_upass");
 %>
 
 <html>
     <body bgcolor="blue">
         <h1> www.ritinfojobs.com </h1>
         <hr size="3">
     <% 
         if ((uname.equals("rit")) && (upass.equals("infotech")))
         {
     %>
     <br> Welcome to <font color="red"> RIT </font> Infotech
  
     <%
         }
        else
         {
     %>
     <br><font color="red"> Invalid Input </font>
 
     <%
         }
     %>
     </body>
 </html>