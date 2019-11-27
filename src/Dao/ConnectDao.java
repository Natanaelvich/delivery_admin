package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDao {

    private static Connection conn;

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/aifurbe";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
     public static void closeConnectionStatement( Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
      public static void closeConnectionPrepare( PreparedStatement preparedStatement) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
      
       public static void closeConnectionPrepare( ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
