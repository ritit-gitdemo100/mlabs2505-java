package p13jdbc;

import java.sql.*;

public class P3Update {
	public static void main(String a[]) throws Exception {

		String url = "jdbc:mysql://localhost/jdbc_db";

		Connection con = DriverManager.getConnection(url, "root", "root");

		Statement st = con.createStatement();

		st.executeUpdate("update stud_tbl set mark = 100 where fname='mahesh'");

		System.out.println("Record Updated Successfully...");
	}
}
