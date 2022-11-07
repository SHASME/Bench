package jdbc;
import java.sql.*;

import org.postgresql.Driver;

public class TestDB {
public static void main(String[] args) throws SQLException {
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	String url="jdbc:postgresql://localhost:5432/cgapr22";
	DriverManager.getConnection(url,"postgres","6148");
	System.out.println("connection success");
}
}
