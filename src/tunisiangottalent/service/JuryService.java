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
import tunisiangottalent.domain.Jury;
import tunisiangottalent.util.DataSource;

/**
 *
 * @author KA
 */
public class JuryService implements IService<Jury>{
    private Connection cnx;
    private PreparedStatement pste;

    public JuryService() {
        try {
            cnx= DataSource.getInstance().getCnx();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JuryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }           
    
  
    /*public void insert(Jury j){
        String requete="insert into utilisateur (nom,prenom,cin,mail,adresse,tel,sexe,password,type,profession) values"
                + " ('"+j.getNom()+"','"+j.getPrenom()+"','"+j.getCin()+"','"+j.getMail()+"','"+j.getAdresse()+"','"+j.getTel()+"','"+j.getSexe()+"','"+j.getPassword()+"','"+j.getType()+"','"+j.getProfession()+"')";
        
       
        try {
            ste=cnx.createStatement();
            ste.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(JuryService.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }*/
  
      public void insert(Jury j){
      String requete="insert into utilisateur (nom,prenom,cin,mail,adresse,tel,sexe,password,type,profession) values(?,?,?,?,?,?,?,?,?,?)";
               
        try {
            pste=cnx.prepareStatement(requete);
            pste.setString(1,j.getNom());
            pste.setString(2,j.getPrenom());
            pste.setString(3,j.getCin());
            pste.setString(4,j.getMail());
            pste.setString(5,j.getAdresse());
            pste.setString(6,j.getTel());
            pste.setString(7,j.getSexe());
            pste.setString(8,j.getPassword());
            pste.setString(9,j.getType());
            pste.setString(10,j.getProfession());
            pste.executeUpdate();  
        } catch (SQLException ex) {
            Logger.getLogger(CandidatService.class.getName()).log(Level.SEVERE, null, ex);
        }
  }  
    @Override
    public void Update(Jury j) {

        int x = 0;
        String sql = ""
                + "update utilisateur set nom = ? , prenom = ?, mail=?, "
                + " adresse = ?, tel = ?, "
                + "sexe = ?, password= ?, profession=?, "
                + "where cin= ?";
        try {
            pste = cnx.prepareStatement(sql);
            pste.setString(1, j.getNom());
            pste.setString(2, j.getPrenom());
            pste.setString(3, j.getMail());
            pste.setString(4, j.getAdresse());
            pste.setString(5, j.getTel());
            pste.setString(6, j.getSexe());
            pste.setString(7, j.getPassword());
            pste.setString(8, j.getProfession());

            x = pste.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }

    @Override
    public void delete(Jury j) {
        String sql = "delete from utilisateur where cin = ?";
        try {
            pste = cnx.prepareStatement(sql);
            pste.setString(1, j.getCin());
            pste.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Jury displayById(int id) {

        ResultSet rs;
        Jury aj = new Jury();
        String sql = "select * from utilisateur where type='jury' and id_utilisateur = ?";
        try {

            pste = cnx.prepareStatement(sql);
            pste.setInt(1, id);
            rs = pste.executeQuery();
            while (rs.next()) {
                aj.setId(rs.getInt(1));
                aj.setNom(rs.getString(2));
                aj.setPrenom(rs.getString(3));
                aj.setCin(rs.getString(4));
                aj.setMail(rs.getString(5));
                aj.setAdresse(rs.getString(6));
                aj.setTel(rs.getString(7));
                aj.setSexe(rs.getString(8));
                aj.setPassword(rs.getString(9));
                aj.setType(rs.getString(10));
                aj.setProfession(rs.getString(11)); 
                
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return aj;
    }

    public List<Jury> displayAll() {

        List<Jury> liste = new ArrayList<>();
        ResultSet rs;
        String sql = "select * from utilisateur where type = 'jury'";

        try {
            pste = cnx.prepareStatement(sql);
            rs = pste.executeQuery();

            while (rs.next()) {
                Jury aj = new Jury(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10),rs.getString(11));
                liste.add(aj);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return liste;
    }  
    
    public Jury check_jury(Jury j) {

        ResultSet rs;
        Jury aj = new Jury();
        String sql = "select * from utilisateur where mail = ? and password = ?";
        try {
            pste = cnx.prepareStatement(sql);
            pste.setString(1, j.getMail());
            pste.setString(2, j.getPassword());
            rs = pste.executeQuery();
            
      while (rs.next()){
      aj.setId(rs.getInt(1));
      aj.setNom(rs.getString(2));
      aj.setPrenom(rs.getString(3));
      aj.setCin(rs.getString(4));
      aj.setMail(rs.getString(5));
      aj.setAdresse(rs.getString(6));
      aj.setTel(rs.getString(7));
      aj.setSexe(rs.getString(8));
      aj.setPassword(rs.getString(9));
      aj.setType(rs.getString(10));
      aj.setProfession(rs.getString(11)); 
   }    
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return aj;
    }


  
}
