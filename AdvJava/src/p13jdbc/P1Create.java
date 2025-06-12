package p13jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P1Create {
	public static void main(String a[]) throws SQLException {
		
		String url = "jdbc:mysql://localhost/mlabsjava2025";

		Connection con = DriverManager.getConnection(url, "root", "root");

		Statement st = con.createStatement();

		String qry = "create table stud_tbl(fname varchar(30), age int, mark int)";
		st.executeUpdate(qry);

		System.out.println("Table Created Successfully...");
		
	}
}