package p13jdbc;

import java.sql.*;

public class P2Insert {
	public static void main(String a[]) throws Exception {
		
		String url = "jdbc:mysql://localhost/mlabsjava2025";

		Connection con = DriverManager.getConnection(url, "root", "root");

		Statement st = con.createStatement();

		String qry = "insert into stud_tbl values ('durga',22,89),('mahesh',23,77),('rajan',29,66)";

		st.executeUpdate(qry);

		System.out.println("Record Inserted Successfully...");
	}
}