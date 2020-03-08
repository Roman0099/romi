package dataBase;

import org.openqa.selenium.WebDriver;

import java.sql.*;

public class DataBaseConnection {
    public static void main(String[] args) {


        //Connection
        String url = "jdbc:oracle:thin:@cybertekschooldb.ckgvmy6l4fr7.us-east-2.rds.amazonaws.com:1521:ORCL";
        String username = "cybertekschooldb";
        String password = "cybertekschooldb1234%";



       //Statement
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
          // Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
          // ResultSet resultSet = statement.executeQuery("");

          System.out.println("Connection successful!");
            //connection.close();
       } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
           System.out.println("Connection failed!");

       }
        }



    }

