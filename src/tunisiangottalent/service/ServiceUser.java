/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import tunisiangottalent.domain.Utilisateur;
import tunisiangottalent.util.DataSource;

/**
 *
 * @author admin
 */
public class ServiceUser {
        private Connection cnx;
    
    
    public ServiceUser(){
            try {
                cnx = DataSource.getInstance().getCnx();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ServiceUser.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public boolean validateCredentials(String username, String password) {
        String request = "SELECT * FROM `utilisateur` WHERE mail = ? and password = ?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = cnx.prepareStatement(request);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
        
        if(resultSet.next()){
            System.out.println("one user");
            return true;
        }else{
            System.out.println("no user");
            return false;
        }
        } catch (SQLException ex) {
            System.out.println("db-error" + ex.getMessage());
        }   
            return false;
            
    }
        public Utilisateur getByUsername(String username) throws SQLException{
            Utilisateur u = new Utilisateur();
        System.out.println(username + "the user requested");
        String request = "SELECT * FROM `utilisateur` WHERE mail = '"+username+"'";
        System.out.println(request);
        Statement stm = cnx.createStatement();
        ResultSet rst = stm.executeQuery(request);
        //System.out.println(rst);
        if(rst.next()){
            u.setId(rst.getInt(1));
           u.setType(rst.getString("type"));
          
        System.out.println(u.getId());
        
    
}
   return u;         
        }
}