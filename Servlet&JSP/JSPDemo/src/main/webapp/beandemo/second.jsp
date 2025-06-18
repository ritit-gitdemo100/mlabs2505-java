<jsp:useBean id="detail" class="mypack.user" scope="session" />
<html>
    <body>
        <h1> Second Page </h1>
Welcome <jsp:getProperty name="detail" property="uname" />
<a href="third.jsp"> Next </a>
    </body>
    
</html>