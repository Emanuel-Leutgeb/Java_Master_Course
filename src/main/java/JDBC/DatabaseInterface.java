package JDBC;

import java.sql.SQLException;

public abstract class DatabaseInterface<T> {

    public abstract T getById(int id) throws SQLException;
    public abstract boolean insert(T data);
    public abstract boolean delete(int id);
}