/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edmond.jobbank.mavenproject1;

import java.sql.*;


/**
 *
 * @author Edmond
 */
public class Database {
    static Connection conn = null;
    
    public static Connection getConnectionToDB(){
        try {
            String serverName = "oracle.scs.ryerson.ca";
            String serverPort = "1521";
            String sid = "orcl";
            String url = "jdbc:oracle:thin:@" + serverName + ":" + 
                        serverPort + ":" + sid;
            String username = "p6chu";
            String password = "06084595";
            conn = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
