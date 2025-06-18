import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class p3_cookie extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String eng = req.getParameter("t1");

        Cookie c1 = new Cookie("english",eng);
        c1.setMaxAge(50);
        res.addCookie(c1);
        
        res.sendRedirect("p4_cookie.html");
                
    }
    
}