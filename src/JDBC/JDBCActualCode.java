package JDBC;

import java.sql.*;

public class JDBCActualCode {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {
            connection = jdbcUtil.getConnection();

            statement = connection.createStatement();

            String sql = "insert into studentinfo(id,sname,sage,scity) values(3,'Mohan',25,'Delhi')";

            //.execute provides boolean value and return true when we use select query else return false.
            boolean status = statement.execute(sql);

            if (status) {
                ResultSet rs = statement.getResultSet();
            } else {
                int rowAffected = statement.getUpdateCount();
                if (rowAffected == 0) System.out.println("Not run");
                else System.out.println("Query executed successfully.");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                jdbcUtil.closeConnection(connection,statement);
            } catch (SQLException e) {
                throw new RuntimeException(e);

            }

        }
    }
}
