import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class p5_cookie extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
          String name="";
        int tam=0, eng=0, mat=0;
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        Cookie c = null;
        Cookie[] cs = req.getCookies();
        
        for(int i=0;i<cs.length;i++)
        {
            c = cs[i];
            
            if(c.getName().equals("fname"))
                name = c.getValue();
            else if(c.getName().equals("tamil"))
                tam = Integer.parseInt(c.getValue());
            else if(c.getName().equals("english"))
                eng = Integer.parseInt(c.getValue());
            else if(c.getName().equals("maths"))
                mat = Integer.parseInt(c.getValue());
                
        }
        int tot = tam + eng + mat;
        double avg = tot / 3.0;
        
        
        out.println("<br>Name : "+name);
        out.println("<br>Tamil : "+tam);
        out.println("<br>English : "+eng);
        out.println("<br>Maths : "+mat);
        out.println("<br>Total : "+tot);
        out.println("<br>Average : "+avg);
        
        
                
    }
    
}