import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class s3_session extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        int eng = Integer.parseInt(req.getParameter("t1"));

        HttpSession sess = req.getSession();
        sess.setAttribute("english", eng);
        
        res.sendRedirect("s4_session.html");
                
    }
    
}