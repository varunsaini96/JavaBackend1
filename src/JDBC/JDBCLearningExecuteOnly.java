package JDBC;

import java.sql.*;

public class JDBCLearningExecuteOnly {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "12345";

        Connection connection = DriverManager.getConnection(url,user,password);

        Statement statement = connection.createStatement();

        String sql1 = "select * from studentinfo";
        String sql2 = "update studentinfo set sage=30 where id=1";

        //.execute provides boolean value and return true when we use select query else return false.
        boolean status1 = statement.execute(sql1);
//        boolean status2  = statement.execute(sql2);

        if(status1){
            ResultSet rs = statement.getResultSet();
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+
                        rs.getInt(3)+" "+rs.getString(4));
            }
        } else{
            int rowAffected = statement.getUpdateCount();
            if(rowAffected==0) System.out.println("Not run");
            else System.out.println("Query executed successfully.");
        }
    }
}
