<jsp:useBean id="detail" class="mypack.user"  scope="session" />
<html>
    <body>
        <h1> First Page </h1>
   Welcome <jsp:getProperty name="detail" property="uname" />
<a href="second.jsp"> Next </a>     
        
        
    </body>
    
</html>


