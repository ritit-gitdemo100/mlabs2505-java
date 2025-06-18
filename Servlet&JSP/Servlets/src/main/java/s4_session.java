import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class s4_session extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        int mat = Integer.parseInt(req.getParameter("t1"));

        HttpSession sess = req.getSession();
        sess.setAttribute("maths", mat);
        
        res.sendRedirect("s5_session");
                
    }
    
}