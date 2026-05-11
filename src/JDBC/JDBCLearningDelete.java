package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCLearningDelete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "Alex@3215";

        Connection connection = DriverManager.getConnection(url,user,password);

        Statement statement = connection.createStatement();

        String sql = "delete from studentinfo where id = 2";

        int rowAffected = statement.executeUpdate(sql);

        if(rowAffected==0) System.out.println("Unable to execute the command.");
        else System.out.println("Record has been deleted.");

        connection.close();
        statement.close();

    }
}
