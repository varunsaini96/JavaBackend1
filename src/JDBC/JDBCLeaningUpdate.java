package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCLeaningUpdate {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "Alex@3215";
        Connection connect = DriverManager.getConnection(url, user, password);

        Statement statement = connect.createStatement();

        String sql = "UPDATE studentinfo set sage=30 where id=1";
        int rowUpdate = statement.executeUpdate(sql);

        if(rowUpdate==0) System.out.println("Unable to update the record.");
        else System.out.println("The record has been updated.");

        statement.close();
        connect.close();
    }
}
