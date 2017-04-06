/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;



/**
 *
 * @author Osmar
 */
public class video {
   private static String url = "jdbc:derby://localhost:1527/DBUsuarios";
   private static String user1 = "isdcm";
   private static String password1 = "1234";
   
   public static void insert (String[] args, String user){
       try{
           System.out.println("Argument: " + Arrays.toString(args));
           
           String sqlStatement = MessageFormat.format("INSERT INTO VIDEOS (TITULO, AUTOR, FECHA_CREACION, DURACION, REPRODUCCIONES, DESCRIPCION, FORMATO, USERID) VALUES(''{0}'',''{1}'',DATE(''{2}''),TIME(''{3}''),INT(''{4}''),''{5}'',''{6}'',''{7}'')", 
                                                args[0], args[1], args[2], args[3], args[4], args[5], args[6], user);
           
           
           System.out.println("SQL statement: " + sqlStatement);
           
           Connection conn = DriverManager.getConnection(url,user1,password1);
           Statement st = conn.createStatement();
           st.executeUpdate(sqlStatement);
           
           conn.close();
       } catch (Exception e){
           System.err.println("Error: " + e.getMessage());
       }
   }
   
   public static ResultSet getVideos(String user) throws SQLException{
       //String driverName = "com.mysql.jdbc.Driver";
       String connectionUrl = "jdbc:derby://localhost:1527/";
       String dbName = "DBUsuarios";
       String userId = "isdcm";
       String password = "1234";

    //try {
    //Class.forName(driverName);
    //} catch (ClassNotFoundException e) {
    //e.printStackTrace();
    //}

       Connection connection = null;
       Statement statement = null;
       ResultSet resultSet = null;

       try{
           connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
           statement=connection.createStatement();
           //String sql ="SELECT * FROM VIDEOS";
           String sqlStatement = MessageFormat.format("SELECT * FROM ISDCM.VIDEOS WHERE USERID=''{0}''", user);

           resultSet = statement.executeQuery(sqlStatement);



       }catch (Exception e) {
           e.printStackTrace();
       }return resultSet;
    }
}
