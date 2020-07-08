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
import tunisiangottalent.util.DataSource;

/**
 *
 * @author admin
 */
public class FichierService implements IService<Fichier>{
        
          private Connection conn;
          private Statement ste;
          private PreparedStatement pste;

    public FichierService() throws ClassNotFoundException {
        conn=DataSource.getInstance().getCnx();
    }

    @Override
    public void insert(Fichier f) {
               String request = "INSERT INTO fichier (`url`,`type`,`date`,`id_candidat`) VALUES (?,?,?,?)";
       
        try{
            
       PreparedStatement ps =conn.prepareStatement(request);
       ps.setString(1,f.getUrl());
       ps.setString(2,f.getType());
       ps.setDate(3,f.getDate());
       // ps.setInt(4,f.getIdcandidat().getId());

       ps.executeUpdate();
        } catch (SQLException ex){
       // Logger.getLogger(ServiceFicheMalade.class.getName().log(Level.SEVERE, null,ex));
            System.out.println("erreur lors de l'insertion " + ex.getMessage());

        }
       
    }

  
    @Override
    public void delete(Fichier f) {
            String sql = "delete from evenement where id_ev ="+ f.getIdFichier();
          if (f != null) {
            try {

                ste = conn.createStatement();
                ste.executeUpdate(sql);

            } catch (SQLException ex) {
                Logger.getLogger(EvennementService.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }
    }
    @Override
    public void Update(Fichier f) {

        int z = 0;
        String sql = ""
                + "update fuchier set url = ? , type = ?, date=?"
                + "where id_fichier= ?";
        try {
            pste = conn.prepareStatement(sql);
            pste.setString(1,f.getUrl());
            pste.setString(2,f.getType());
            pste.setDate(3,f.getDate());
             pste.setDate(3,f.getDate());
            z = pste.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
           e.printStackTrace();
        }

    }

    @Override
    public List<Fichier> displayAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Fichier displayById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
  
}
