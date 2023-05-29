/*
11. Write a Java program that connects to a MySQL database using JDBC. The program
should read data from a table and display the results in the console.
*/

import java.sql.*;

public class Question_11 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase"; //  MySQL database URL
        String username = "root"; 
        String password = "ankur@12";

        try {
            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a SQL statement
            Statement st = conn.createStatement();

            // Execute a query to retrieve data from a table
            String query = "SELECT * FROM mytable"; //  table name
            ResultSet resultSet = st.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id"); 
                String name = resultSet.getString("name"); 

                // Display the retrieved data
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Close the resources
            resultSet.close();
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}