package JDBC;

import java.sql.*;

public class jdbcUtil {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "12345";
        return DriverManager.getConnection(url, user, password);
    }

    public static void closeConnection(Connection connection, Statement statement) throws SQLException {
        connection.close();
        statement.close();
    }

    public static void showTable() throws SQLException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        statement.executeQuery("SELECT * FROM studentinfo");

        ResultSet rs = statement.getResultSet();

        while (rs.next()){
            System.out.println(rs.getInt(1)+" " +rs.getString(2)+" "
                    +rs.getInt(3)+" "+rs.getString(4));
        }
    }
}
