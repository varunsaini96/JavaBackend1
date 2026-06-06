package JDBC;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class JDBCLearningFetchData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "12345";
        Connection connect = DriverManager.getConnection(url, user, password);

        Statement statement = connect.createStatement();

        String sql = "select * from studentinfo";
        ResultSet rs = statement.executeQuery(sql);
//        or use boolean status = statement.execute(sql); no need to specify query or update.

        while (rs.next()){
            System.out.println(rs.getInt("id")+" "+
            rs.getString("sname")+" "+
            rs.getInt("sage")+" "+
            rs.getString("scity"));
        }

        rs.close();
        statement.close();
        connect.close();
    }
}
