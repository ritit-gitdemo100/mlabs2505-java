package p13jdbc;

import java.sql.*;

public class P5Delete {
	public static void main(String a[]) throws Exception {

		String url = "jdbc:mysql://localhost/mlabsjava2025";

		Connection con = DriverManager.getConnection(url, "root", "root");

		Statement st = con.createStatement();

		st.executeUpdate("delete from stud_tbl where fname='mahesh'");

		System.out.println("Record Deleted Successfully...");
	}
}
