package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) throws SQLException {
        // init sqlite3 db
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite::memory");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");

        String dropTableSql = "DROP TABLE IF EXISTS `vulnerability_locations`";
        PreparedStatement dropTableStmt = c.prepareStatement(dropTableSql);
        dropTableStmt.executeUpdate();

        String sql = "CREATE TABLE IF NOT EXISTS `vulnerability_locations` (`location` varchar(96) UNIQUE, 'kind' varchar(32))";
        PreparedStatement pstmt = c.prepareStatement(sql);
        pstmt.executeUpdate();

        SpringApplication.run(RestServiceApplication.class, args);
    }
}
