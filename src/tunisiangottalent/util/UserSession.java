/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.util;

import tunisiangottalent.domain.Utilisateur;
import tunisiangottalent.service.ServiceUser;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AmineMissaoui
 */
public final class UserSession {

    private static UserSession instance;
    private String username;
    private int id;
    private String type;

   // private int id;
    //private int active;

    private UserSession(String username) {
        ServiceUser se = new ServiceUser();
        try {
            Utilisateur u = se.getByUsername(username);
            this.username = u.getMail();
            this.id = u.getId();
            this.type = u.getType();
        } catch (SQLException ex) {
            System.out.println("error in constructor" + ex.getMessage());
        }
        
    }

    public static UserSession setInstance(String username) throws SQLException {
        if (instance == null) {
            instance = new UserSession(username);
        }
        return instance;
    }
    
    public static UserSession getInstance(){
        return instance;
    }

    public String getUsername() {
        return this.username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    public void clearUserSession() {
        username = "";
    }

    @Override
    public String toString() {
        return "UserSession{" + "username=" + username + '}';
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
}
