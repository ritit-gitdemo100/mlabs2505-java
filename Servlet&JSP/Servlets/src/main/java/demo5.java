import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class demo5 extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("application/msword");
        res.addHeader("Content-Disposition","attachment; filename=mohan.doc" );
        
        PrintWriter out = res.getWriter();
        
        out.println("Marlabs Innovations \nWelcome to the Presentation");
    }
    
}