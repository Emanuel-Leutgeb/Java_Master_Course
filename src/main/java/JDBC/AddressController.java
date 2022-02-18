package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressController extends DatabaseInterface<AddressJDBC> {
    private Connection connection;

    public AddressController(Connection connection) {
        this.connection = connection;
    }

    @Override
    public AddressJDBC getById(int id) throws SQLException {
        String sql = "SELECT * FROM ADDRESS WHERE ID = ?";
        AddressJDBC address = null;
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, id);
            prepareStatement.execute();
            ResultSet resultSet = prepareStatement.getResultSet();

            if (resultSet.next()) {
                int ZIP = resultSet.getInt("ZIP");
                String CITY = resultSet.getString("CITY");
                String STREET = resultSet.getString("STREET");
                address = new AddressJDBC(ZIP, CITY, STREET);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return address;
    }

    @Override
    public boolean insert(AddressJDBC address) {
        String sql = "INSERT INTO ADDRESS (ZIP, CITY, STREET) VALUES (?, ?, ?)";

        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, address.getZip());
            prepareStatement.setString(2, address.getCity());
            prepareStatement.setString(3, address.getStreet());
            prepareStatement.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }

    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM ADDRESS WHERE ID = ?";

        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, id);
            prepareStatement.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }
}