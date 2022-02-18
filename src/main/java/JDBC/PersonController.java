package JDBC;

import java.sql.*;

public class PersonController extends DatabaseInterface<PersonJDBC> {
    private Connection connection;

    public PersonController(Connection connection) {
        this.connection = connection;
    }

    @Override
    public PersonJDBC getById(int id) throws SQLException {

        String sql = "SELECT * FROM PEOPLE P JOIN ADDRESS A ON P.ADDRESS_ID = A.ID WHERE P.ID = ?";
        PersonJDBC person = null;
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, id);
            prepareStatement.execute();

            ResultSet resultSet = prepareStatement.getResultSet();

            if (resultSet.next()) {
                String FIRSTNAME = resultSet.getString("FIRSTNAME");
                String LASTNAME = resultSet.getString("LASTNAME");
                String BIRTHDAY = resultSet.getString("BIRTHDAY");
                int AGE = resultSet.getInt("AGE");
                int ZIP = resultSet.getInt("ZIP");
                String CITY = resultSet.getString("CITY");
                String STREET = resultSet.getString("STREET");
                String SEX = resultSet.getString("SEX");
                person = new PersonJDBC(FIRSTNAME, LASTNAME, BIRTHDAY, AGE, new AddressJDBC(ZIP, CITY, STREET), SexJDBC.valueOf(SEX));
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return person;
    }

    @Override
    public boolean insert(PersonJDBC person) {
        String sql = "INSERT INTO PEOPLE (FIRSTNAME, LASTNAME, BIRTHDAY, AGE, SEX) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, person.getFirstName());
            prepareStatement.setString(2, person.getLastName());
            prepareStatement.setString(3, person.getBirthday());
            prepareStatement.setInt(4, person.getAge());
            prepareStatement.setString(5, person.getSex().toString());
            prepareStatement.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM PEOPLE WHERE ID = ?";

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