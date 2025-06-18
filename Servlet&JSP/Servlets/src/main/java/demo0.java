import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class demo0 extends HttpServlet
{
    private String name;
    
    public void init() throws ServletException
    {
        name="Raj";
    }
    
    public void destroy()
    {
        name=null;
    }
    
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("Welcome "+name);
    }
}