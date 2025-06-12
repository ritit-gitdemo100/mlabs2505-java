package p13jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class P6Prepared {
	public static void main(String a[]) throws Exception {

		String url = "jdbc:mysql://localhost/jdbc_db";

		Connection con = DriverManager.getConnection(url, "root", "root");

		String sql = "select * from stud_tbl where fname = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "durga");
		
		
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt("age"));
			System.out.println(rs.getInt(3));
		}

	}
}
