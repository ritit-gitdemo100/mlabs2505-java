package p13jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P7Batch {
    public static void main(String[] args) throws SQLException {

            String url = "jdbc:mysql://localhost:3306/jdbc_db"; 
            String username = "root";
            String password = "root"; 

            Connection con = DriverManager.getConnection(url, username, password);

            con.setAutoCommit(false); 

            Statement st = con.createStatement();

            st.addBatch("INSERT INTO stud_tbl VALUES ('Adithya', 24,96)");
            st.addBatch("INSERT INTO stud_tbl VALUES ('Yash', 23,97)");
            st.addBatch("INSERT INTO stud_tbl VALUES ('Fathima', 23,98)");
            st.addBatch("UPDATE stud_tbl SET age = 25 WHERE fname = 'Aditya'");

            int[] results = st.executeBatch(); 

            con.commit();
            con.setAutoCommit(true);

            for (int result : results) {
                System.out.println("Result: " + result);
            }
    }
}
