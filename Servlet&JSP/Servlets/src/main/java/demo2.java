import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class demo2 extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<html><body>");
        out.println("<h1>Different URL</h1>");
        out.println("<hr>");
        out.println("Actual Class Name is :demo2 <br> But the URL will be different");
    }
    
}