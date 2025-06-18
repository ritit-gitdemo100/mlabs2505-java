import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class demo6 extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("application/vnd.ms-powerpoint");
        res.addHeader("Content-Disposition","attachment; filename=mohan.ppt" );
        
        PrintWriter out = res.getWriter();
        
        out.println("Marlabs Innovation \nWelcome to the Presentation");
        out.println("Welcome to RIT - By Sasikala");
    }
    
}