package com.rit;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HikariCPDemo {

	public static void main(String[] args) throws SQLException {
		// Configuration
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/demo");
		config.setUsername("root");
		config.setPassword("root");
		config.setMaximumPoolSize(10);

		HikariDataSource dataSource = new HikariDataSource(config);

		Connection conn = dataSource.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM customers");

		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print(rs.getString(2));
			System.out.println(rs.getString(3));
		}

		dataSource.close();
	}
}
