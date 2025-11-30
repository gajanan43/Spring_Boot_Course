package org.example;
import java.sql.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    /*
        import package
        load & register
        create connection
        create statement
        execute statement
        process the results
        close
     */

        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "mysql";
//        String query = "select * from student"; //Read-1
//        String query = "update student set id='4' where id='3'"; //Update-2
//        String query = "delete from student where id='3'"; //Delete-3
        String query = "INSERT INTO student(name, email) VALUES('Shivam','demo3@gmail.com')"; // Insert-4

        //2 (Optional) Explicit driver load:

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //3  create connection
        try(Connection connection = DriverManager.getConnection(url,user,password)){
            System.out.println("✅ Connected to MySQL successfully!");

            //4 create statement
            try(Statement statement = connection.createStatement()){
                //5 execute statement

                //CRUD Operation
                // Read-1
//                ResultSet rs=statement.executeQuery(query);

                //Update-2 & Delete-3 & Insert-4
                statement.execute(query);
                ResultSet rs=statement.executeQuery("select * from student");


                //6 process the results
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    System.out.println("id=" + id + " name=" + name + " email=" + email);

                }
            }
        }
        catch (SQLException e){
            System.out.println("❌ Connection failed!");
        }

    }
}
