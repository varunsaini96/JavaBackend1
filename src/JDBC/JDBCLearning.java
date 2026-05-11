package JDBC;
import java.sql.*;

public class JDBCLearning {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver"); //load the class only means static code will be executed

//        what above code does run static block{DriverManager.registerDriver(new Driver());}
//        It register itseft with DriverManager.
//        Hey JVM, load MySQL driver, so I can connect to database.

        //Establish the connection

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "Alex@3215";
        Connection connect = DriverManager.getConnection(url, user, password);

        //Creating Statement
        Statement statement = connect.createStatement();

        //execute the query
        String sql = "INSERT INTO studentinfo(id, sname, sage, scity) VALUES (2, 'Kary', 23, 'Gr. Noida')";
        int rowsAffected = statement.executeUpdate(sql);
        //process the result
        if (rowsAffected==0) System.out.println("Unable to insert the data");
        else System.out.println("Data Inserted Successfully");

        //close the resources
        statement.close();
        connect.close();
    }

}
