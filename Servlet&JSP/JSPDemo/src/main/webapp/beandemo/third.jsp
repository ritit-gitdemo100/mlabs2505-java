<jsp:useBean id="detail" class="mypack.user" scope="session" />
<html>
    <body>
        <h1> Third Page </h1>
Welcome <jsp:getProperty name="detail" property="uname" />
<a href="first.jsp"> First </a>
    </body>
</html>