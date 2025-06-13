package p13jdbc;

import java.sql.*;

public class P4Select {
	public static void main(String a[]) throws Exception {

		
		String url = "jdbc:mysql://localhost/mlabsjava2025";

		Connection con = DriverManager.getConnection(url, "root", "root");

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * from stud_tbl");

		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt("age"));
			System.out.println(rs.getInt(3));
			System.out.println("-------------------");
		}

	}
}
