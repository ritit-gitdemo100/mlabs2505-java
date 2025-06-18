import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class s5_session extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        HttpSession sess = req.getSession();
        
        String name;
        
        name = (String)sess.getAttribute("fname");
       Integer tam = (Integer)sess.getAttribute("tamil");    
       Integer eng = (Integer)sess.getAttribute("english");    
       Integer mat = (Integer)sess.getAttribute("maths");    
     

        int tot = tam + eng + mat;
        double avg = tot / 3.0;
        
        
        out.println("<br>Name : "+name);
        out.println("<br>Tamil : "+tam);
        out.println("<br>English : "+eng);
        out.println("<br>Maths : "+mat);
        out.println("<br>Total : "+tot);
        
        DecimalFormat df = new DecimalFormat("#.00");
        out.println("<br>Average : "+df.format(avg));
        
        
                
    }
    
}