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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tunisiangottalent.domain.Fichier;
import utils.DataSource;

/**
 *
 * @author admin
 */
public class FichierService{
        
          private Connection conn;
          private Statement ste;

    public FichierService() throws ClassNotFoundException {
        conn=DataSource.getInstance().getCnx();
    }

    public void Ajouter(Fichier f) throws SQLException {
               String request = "INSERT INTO fichier (`url`,`type`,`date`,`id_candidat`) VALUES (?,?,?,?)";
       
        try{
            
       PreparedStatement ps =conn.prepareStatement(request);
       ps.setString(1,f.getUrl());
       ps.setString(2,f.getType());
       ps.setDate(3,f.getDate());
       ps.setInt(4,f.getIdcandidat().getId());

       ps.executeUpdate();
        } catch (SQLException ex){
       // Logger.getLogger(ServiceFicheMalade.class.getName().log(Level.SEVERE, null,ex));
            System.out.println("erreur lors de l'insertion " + ex.getMessage());

        }
       
    }

  
//    public void Supprimer(Object o) {
//       String req = "delete from randonnee where id_randonnee=" + r.getIdRandonnee();
//        Randonnee ra = displayById(r.getIdRandonnee());
//
//        if (ra != null) {
//            try {
//
//                st.executeUpdate(req);
//
//            } catch (SQLException ex) {
//                Logger.getLogger(RandonneeService.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            System.out.println("n'existe pas");
//        }   
//    }
 
    public List Afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    public Object AfficherparId(int id) {
              return null;
        
       
    }

   
    public boolean Modifier(Object os) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void Ajouter(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
