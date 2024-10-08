package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    private Connection connection;

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/pizzaria",
                "root", ""
            );
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean isConnected() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = getConnection();
            }
            return connection != null && !connection.isClosed();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int getPing() {
        long startTime = System.currentTimeMillis();
        try (Statement stmt = connection.createStatement()) {
            stmt.executeQuery("SELECT 1");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        long endTime = System.currentTimeMillis();
        return (int) (endTime - startTime);
    }
}
