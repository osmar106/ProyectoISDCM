/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

/**
 *
 * @author Osmar
 */
public class videoREST {
   public static void incrementVideos(int id){
       //String driverName = "com.mysql.jdbc.Driver";
       String connectionUrl = "jdbc:derby://localhost:1527/";
       String dbName = "DBUsuarios";
       String userId = "isdcm";
       String password = "1234";


       Connection connection = null;
       Statement statement = null;
       ResultSet resultSet = null;

       try{
           connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
           statement=connection.createStatement();
           //String sql ="SELECT * FROM VIDEOS";
           String sqlStatement = MessageFormat.format("UPDATE ISDCM.VIDEOS SET REPRODUCCIONES = REPRODUCCIONES + 1 WHERE ID = {0}", id);

           statement.executeUpdate(sqlStatement);



       }catch (Exception e) {
           e.printStackTrace();
       }
    } 

}
