import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class demo7 extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String name = req.getParameter("t1");
        
        out.println("Hi "+name+"<br> Welcome to Marlabs Innovations<br><br>");
        out.println("<font color=red>RIT Wishing you for a very very successful career</font>");
        
    }
    
}