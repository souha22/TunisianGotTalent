/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataSource {
      //API JDBC = JAVA DATA BASE CONNECTIVITY
    private String url="jdbc:mysql://127.0.0.1:3308/tgt?useSSL=false";
    private String login="root";
    private String password="";
    
    private Connection cnx;
  //Singleton
    private static DataSource instance;
          
    private DataSource() throws ClassNotFoundException {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            cnx=DriverManager.getConnection(url, login, password);
        } catch (SQLException ex) {
            Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DataSource getInstance() throws ClassNotFoundException{
        if(instance==null)
            instance=new DataSource();
        return instance;
    }
    
    
    

    public Connection getCnx() {
        return cnx;
    }
    
    
}
