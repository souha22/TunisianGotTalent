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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tunisiangottalent.domain.Administrateur;
import tunisiangottalent.util.DataSource;

/**
 *
 * @author KA
 */
public class AdministrateurService {
   private Connection cnx;
    private PreparedStatement pste;

    public AdministrateurService() {
       try {
           cnx= DataSource.getInstance().getCnx();
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(AdministrateurService.class.getName()).log(Level.SEVERE, null, ex);
       }
    }           
public Administrateur check_administrateur(Administrateur a){
        
		ResultSet rs;
                Administrateur aa = new Administrateur();
		String sql = "select nom_admin ,prenom_admin from admin where login = ? and mot_de_passe = ?";
		try {
			pste = cnx.prepareStatement(sql);
                        pste.setString(1, a.getLogin());
                        pste.setString(2, a.getPassword());
			rs = pste.executeQuery();

			while (rs.next()) {
		           aa.setNom(rs.getString(1));
                           aa.setPrenom(rs.getString(2));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aa;
    }     
}
