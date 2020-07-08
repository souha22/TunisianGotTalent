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
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tunisiangottalent.domain.Administrateur;
import tunisiangottalent.domain.Utilisateur;
import tunisiangottalent.util.DataSource;

/**
 *
 * @author admin
 */
public class UtilisateurService {
    
     private Connection cnx;
    private PreparedStatement pste;

    public UtilisateurService() {
    

    
         try {
             cnx= DataSource.getInstance().getCnx();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(UtilisateurService.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
        
public List<Utilisateur> check_utilisateur(Utilisateur u){
        
		ResultSet rs;
                Utilisateur aa = new Utilisateur();
                List<Utilisateur> liste = new ArrayList<>();
		String sql = "select * from utilisateur where mail = ? and password = ?";
		try {
			pste = cnx.prepareStatement(sql);
                        pste.setString(1, u.getMail());
                        pste.setString(2, u.getPassword());
			rs = pste.executeQuery();

			while (rs.next()) {
 aa.setId(rs.getInt(1));
        aa.setNom(rs.getString(2));
        aa.setPrenom(rs.getString(3));
        aa.setCin(rs.getString(4));
        aa.setMail(rs.getString(5));
        aa.setAdresse(rs.getString(6));
        aa.setTel(rs.getString(7)); 
        aa.setSexe(rs.getString(8));
        aa.setPassword(rs.getString(9));
        aa.setType(rs.getString(10));
        liste.add(aa);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
    }     
    
}
