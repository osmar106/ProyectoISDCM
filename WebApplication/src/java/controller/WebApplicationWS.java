/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Video;

/**
 *
 * @author Osmar
 */
@WebService(serviceName = "WebApplicationWS")
public class WebApplicationWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getByTitle")
    public List<Video> getByTitle(@WebParam(name = "title") String title) {
        
        List<Video> list = new ArrayList<Video>();
        
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
            String sqlStatement = MessageFormat.format("SELECT * FROM ISDCM.VIDEOS WHERE TITULO=''{0}''", title);

            resultSet = statement.executeQuery(sqlStatement);
            
            while(resultSet.next()){
                Video video = new Video();
   
                video.setVideo(
                        resultSet.getInt("ID"), 
                        resultSet.getString("TITULO"),
                        resultSet.getString("AUTOR"),
                        resultSet.getString("FECHA_CREACION"),
                        resultSet.getString("DURACION"),
                        resultSet.getInt("REPRODUCCIONES"),
                        resultSet.getString("DESCRIPCION"),
                        resultSet.getString("FORMATO"));
                 
                list.add(video);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getByAuthor")
    public List<Video> getByAuthor(@WebParam(name = "author") String author) {
        List<Video> list = new ArrayList<Video>();
        
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
            String sqlStatement = MessageFormat.format("SELECT * FROM ISDCM.VIDEOS WHERE AUTOR=''{0}''", author);

            resultSet = statement.executeQuery(sqlStatement);
            
            while(resultSet.next()){
                Video video = new Video();
   
                video.setVideo(
                        resultSet.getInt("ID"), 
                        resultSet.getString("TITULO"),
                        resultSet.getString("AUTOR"),
                        resultSet.getString("FECHA_CREACION"),
                        resultSet.getString("DURACION"),
                        resultSet.getInt("REPRODUCCIONES"),
                        resultSet.getString("DESCRIPCION"),
                        resultSet.getString("FORMATO"));
                 
                list.add(video);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getByDate")
    public List<Video> getByDate(@WebParam(name = "date") String date) {
        
        List<Video> list = new ArrayList<Video>();
        
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
            String sqlStatement = MessageFormat.format("SELECT * FROM ISDCM.VIDEOS WHERE FECHA_CREACION=DATE(''{0}'')", date);

            resultSet = statement.executeQuery(sqlStatement);
            
            while(resultSet.next()){
                Video video = new Video();
   
                video.setVideo(
                        resultSet.getInt("ID"), 
                        resultSet.getString("TITULO"),
                        resultSet.getString("AUTOR"),
                        resultSet.getString("FECHA_CREACION"),
                        resultSet.getString("DURACION"),
                        resultSet.getInt("REPRODUCCIONES"),
                        resultSet.getString("DESCRIPCION"),
                        resultSet.getString("FORMATO"));
                 
                list.add(video);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
}
