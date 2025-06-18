import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class demo4 extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("application/vnd.ms-excel");
        res.addHeader("Content-Disposition","attachment; filename=mohan.xls" );
 
        PrintWriter out = res.getWriter();
        
        out.println("S.No \t Name \t Roll");
        out.println("101 \t Selva \t 98");
        out.println("102 \t Sasi \t 97");
        out.println("103 \t mani \t 76");
    }
    
}