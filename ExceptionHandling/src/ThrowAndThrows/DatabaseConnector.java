package ThrowAndThrows;

import java.sql.SQLException;

public class DatabaseConnector {
    static void connectDatabase() throws SQLException {
        System.out.println("Connecting to database...");
        throw new SQLException("Database connecting failed!");
    }

    static void main(String[] args) {
        try {
            connectDatabase();
        }catch (SQLException e) {
            System.out.println("Exception handle: "+ e.getMessage());
        }
        System.out.println("Program continues");
    }
}
