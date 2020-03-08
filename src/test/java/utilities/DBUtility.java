package utilities;

import java.sql.*;

public class DBUtility {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void createConnection() throws SQLException {
        switch (Config.getProperty("dbType")){
            case "oracle":
                connection = DriverManager.getConnection(Config.getProperty("oracleURL"),
                Config.getProperty("oracleUsername"),
                Config.getProperty("oraclePassword"));
                break;
            case "mysql":
                break;
            default:
                connection = null;





        }


    }
}
