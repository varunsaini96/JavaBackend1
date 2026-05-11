package JDBC;

import java.sql.*;
import java.util.Scanner;

public class jdbcPreparedStatement {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;

        connection = jdbcUtil.getConnection();
        preparedStatement = connection.prepareStatement(
                "INSERT INTO studentinfo (id,sname,sage,scity) VALUES(?,?,?,?)"
        );
        System.out.println("Enter the following details: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id: ");
        Integer id = sc.nextInt();
        System.out.println("Enter the student name: ");
        String sname = sc.next();
        System.out.println("Enter the age of student: ");
        Integer sage = sc.nextInt();
        System.out.println("Enter the city: ");
        String scity = sc.next();
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,sname);
        preparedStatement.setInt(3,sage);
        preparedStatement.setString(4,scity);
        preparedStatement.executeUpdate();

        statement = connection.createStatement();
        statement.executeQuery("SELECT * FROM studentinfo");

        ResultSet rs = statement.getResultSet();

        while (rs.next()){
            System.out.println(rs.getInt(1)+" " +rs.getString(2)+" "
            +rs.getInt(3)+" "+rs.getString(4));
        }

        connection.close();
        statement.close();
        rs.close();
        preparedStatement.close();


    }
}
