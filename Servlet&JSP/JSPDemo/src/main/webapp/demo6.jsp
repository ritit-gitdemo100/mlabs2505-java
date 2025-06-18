<%@page import="java.sql.*, java.text.*" contentType="application/vnd.ms-excel"  %>

<%
    response.addHeader("Content-Disposition","attachment; filename=mohan.xls" );
    int m1,m2,m3,tot;
    double avg;
    String result;
    DecimalFormat df = new DecimalFormat("#.00");
    
    String url = "jdbc:mysql://localhost/jspdemo_db";
    Class.forName ("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(url,"root","");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from stud_tbl");
    
    out.println("Roll \t Name \t Mark1 \t Mark2 \t Mark3 \t Total \t Average \t Result");
    while(rs.next())
    {
        m1 = rs.getInt(3);
        m2 = rs.getInt(4);
        m3 = rs.getInt(5);
        tot = m1+m2+m3;
        avg = tot/3.0;
        if(m1>=35 && m2>=35 && m3>=35)
            result = "pass";
        else
            result = "fail";
        
            out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+tot+"\t"+df.format(avg)+"\t"+result);
    }
%>