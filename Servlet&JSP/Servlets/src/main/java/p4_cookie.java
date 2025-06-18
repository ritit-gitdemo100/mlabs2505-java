import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class p4_cookie extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String mat = req.getParameter("t1");

        Cookie c1 = new Cookie("maths",mat);
        c1.setMaxAge(50);
        res.addCookie(c1);
        
        res.sendRedirect("p5_cookie");
                
    }
    
}