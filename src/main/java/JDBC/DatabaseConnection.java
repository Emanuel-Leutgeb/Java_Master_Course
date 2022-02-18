package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    private final String dbms = "mariadb";
    private final String serverName = "192.168.64.3:3306";
    private final String portNumber = "3306";
    private final String userName = "IntelliJ";
    private final String password = "passme";
    private Connection connection = null;

    public Connection getDatabaseConnection() throws SQLException {

        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);


        this.connection = DriverManager.getConnection(
                "jdbc:" + this.dbms + "://" +
                        this.serverName +
                        ":" + this.portNumber + "/",
                connectionProps);

        System.out.println("Connected to database");
        return this.connection;
    }
}