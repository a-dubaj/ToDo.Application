package sample.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by andrzejdubaj on 12.04.2018.
 */
public class DatabaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:msql://" + dbHost + ":"
                +dbPort + "/"
                +dbName;

        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }

    public void signUpUser(String firstName, String lastName, String userName, String password, String location, String gender) {
        String insert = "INSERT INTO " +Const.USER_TABLE +"("+Const.USERS_FIRSTNAME
            +","+Const.USERS_LASTNAME+ ","+Const.USERS_USERNAME+","
            +Const.USERS_PASSWORD+","+Const.USERS_LOCATION+","
            +Const.USERS_GENDER+")" + "VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
