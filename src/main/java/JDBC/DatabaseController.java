package JDBC;

import java.sql.*;

public class DatabaseController {

    private Connection connection;
    private PersonController personController;
    private AddressController addressController;

    public DatabaseController(Connection connection) throws SQLException {
        this.connection = connection;
        Statement statement = connection.createStatement();
        statement.executeQuery("USE PeopleManagementSystem");

        this.personController = new PersonController(this.connection);
        this.addressController = new AddressController(this.connection);
    }

    public PersonJDBC getPersonById(int id) throws SQLException {
        PersonJDBC personJDBC = this.personController.getById(id);
        return personJDBC;
    }

    public AddressJDBC getAddressById(int id) throws SQLException {
        AddressJDBC addressJDBC = this.addressController.getById(id);
        return addressJDBC;
    }

    public boolean insertPerson(PersonJDBC personJDBC) {
        return this.personController.insert(personJDBC);
    }

    public boolean insertAddress(AddressJDBC addressJDBC) {
        return this.addressController.insert(addressJDBC);
    }

    public boolean deletePerson(int id) {
        return this.personController.delete(id);
    }

    public boolean deleteAddress(int id) {
        return this.addressController.delete(id);
    }
}