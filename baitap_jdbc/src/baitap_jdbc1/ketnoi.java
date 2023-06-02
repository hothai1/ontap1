package baitap_jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ketnoi {
 public static Connection getConnection() throws ClassNotFoundException, SQLException {
	 Class.forName("org.sqlite.JDBC");
	 Connection con = DriverManager.getConnection("jdbc:sqlite:masinhvien.db");
	 return con;
 }
}