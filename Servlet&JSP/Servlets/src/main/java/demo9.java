import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class demo9 extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String uname = req.getParameter("t1");
        String upass = req.getParameter("t2");
        
        out.println("Hi "+uname+"<br><br>");
        //out.println("Your password is <font color=red>"+upass+"</font>");
        
    }
    
}