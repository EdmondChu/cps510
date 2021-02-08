/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edmond.jobbank.mavenproject1;

import java.io.*;
import java.sql.*;
import org.apache.ibatis.jdbc.ScriptRunner;

/**
 *
 * @author Edmond
 */
public class JDBCTest {
    public static void main(String[]args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@oracle.scs.ryerson.ca:1521:orcl", "p6chu", "06084595")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
            ScriptRunner sr = new ScriptRunner(conn);
            Reader createTable = new BufferedReader(new FileReader("C:\\Users\\Edmond\\Documents\\Workspace\\cps510\\jobbankuimaven\\scripts\\CreateTables.sql"));
            Reader dropTable = new BufferedReader(new FileReader("C:\\Users\\Edmond\\Documents\\Workspace\\cps510\\jobbankuimaven\\scripts\\DropTables.sql"));
            Reader populateTable = new BufferedReader(new FileReader("C:\\Users\\Edmond\\Documents\\Workspace\\cps510\\jobbankuimaven\\scripts\\PopulateTables.sql"));

            sr.runScript(createTable);
            sr.runScript(populateTable);
            
            String query = "SELECT COUNT(*) AS rowcount FROM Accounts";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            rs.next();
            int count = rs.getInt("rowcount") ;
            rs.close();
            System.out.println(count);
            
            sr.runScript(dropTable);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
