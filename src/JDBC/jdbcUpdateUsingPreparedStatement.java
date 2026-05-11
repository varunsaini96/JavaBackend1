package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcUpdateUsingPreparedStatement {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = jdbcUtil.getConnection();
            jdbcUtil.showTable();
        preparedStatement = connection.prepareStatement("UPDATE studentinfo SET sage = ? where id=?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details below to update the table:");
        System.out.println("Enter the student age: ");
        Integer age = sc.nextInt();
        System.out.println("Enter the id of student where you want to change the record: ");
        Integer id = sc.nextInt();

        preparedStatement.setInt(1,age);
        preparedStatement.setInt(2,id);

        int rowAffected = preparedStatement.executeUpdate();
        if(rowAffected==0) System.out.println("No record is updated.");
        else System.out.println("Record has been updated, below you can see the table info.");

        jdbcUtil.showTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

