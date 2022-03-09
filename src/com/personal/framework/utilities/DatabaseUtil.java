package com.personal.framework.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseUtil {

    public void Open(String connectionString) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            DriverManager.getConnection(connectionString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Close() {

    }

    public void ExecuteQuery(String query, Connection connection) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
        } catch (Exception e) {

        }
    }
}
