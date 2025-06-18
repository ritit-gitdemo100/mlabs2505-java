import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class demo8 extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String uname = req.getParameter("t1");
        String upass = req.getParameter("t2");
        
      
        if(uname.equals("admin"))
            out.println("<br> Welcome Admin");
        else
            out.println("Welcome User");    
                
    }
    
}