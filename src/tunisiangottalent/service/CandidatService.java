/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tunisiangottalent.domain.Candidat;
import tunisiangottalent.util.DataSource;

/**
 *
 * @author KA
 */
public class CandidatService  implements IService<Candidat>{
    
    private Connection cnx;
    private PreparedStatement pste;

    public CandidatService() {
        try {
            cnx= DataSource.getInstance().getCnx();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CandidatService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }           
    
  
    /*public void insert(Candidat c){
        String requete="insert into utilisateur (nom,prenom,cin,mail,adresse,tel,sexe,password,type,date_naissance,talent) values"
                + " ('"+c.getNom()+"','"+c.getPrenom()+"','"+c.getCin()+"','"+c.getMail()+"','"+c.getAdresse()+"','"+c.getTel()+"','"+c.getSexe()+"','"+c.getPassword()+"','"+c.getType()+"','"+c.getDateNaissance()+"','"+c.getTalent()+"')";
        
       
        try {
            ste=cnx.createStatement();
            ste.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(CandidatService.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }*/
  
  public void insert(Candidat c){
      String requete="insert into utilisateur (nom,prenom,cin,mail,adresse,tel,sexe,password,type,date_naissance,talent)values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pste=cnx.prepareStatement(requete);
            pste.setString(1,c.getNom());
            pste.setString(2,c.getPrenom());
            pste.setString(3,c.getCin());
            pste.setString(4,c.getMail());
            pste.setString(5,c.getAdresse());
            pste.setString(6,c.getTel());
            pste.setString(7,c.getSexe());
            pste.setString(8,c.getPassword());
            pste.setString(9,"candidat");
            pste.setDate(10,c.getDateNaissance());
            pste.setString(11,c.getTalent());
            
            pste.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CandidatService.class.getName()).log(Level.SEVERE, null, ex);
        }
  } 

    /**
     *
     * @param c
     * @return
     */
    @Override
    public void Update(Candidat c) {

        int s = 0;
        String sql = ""
                + "update utilisateur set nom = ? , prenom = ?, mail=?, "
                + " adresse = ?, tel = ?, "
                + "sexe = ?, password= ?, date_naissance=?, "
                + "talent = ?"
                + "where cin= ?";
        try {
            pste = cnx.prepareStatement(sql);
            pste.setString(1, c.getNom());
            pste.setString(2, c.getPrenom());
            pste.setString(3,c.getMail());
            pste.setString(4,c.getAdresse());
            pste.setString(5,c.getTel());
            pste.setString(6,c.getSexe());
            pste.setString(7,c.getPassword());
            pste.setDate(8,c.getDateNaissance());
            pste.setString(9,c.getTalent());
            pste.setString(10,c.getCin());
         
            
            s = pste.executeUpdate();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

      
    }  
    
    public void delete(Candidat c) {
        String sql = "delete from utilisateur where cin = ?";
        try {
            pste = cnx.prepareStatement(sql);
            pste.setString(1, c.getCin());
            pste.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     
    @Override
    public Candidat displayById(int id) {

        ResultSet rs;
        Candidat ad = new Candidat();
        String sql = "select * from utilisateur where type='candidat' and id_utilisateur = ?";
        try {
            
            pste = cnx.prepareStatement(sql);
            pste.setInt(1, id);
            rs = pste.executeQuery();
        while (rs.next()){
        ad.setId(rs.getInt(1));
        ad.setNom(rs.getString(2));
        ad.setPrenom(rs.getString(3));
        ad.setCin(rs.getString(4));
        ad.setMail(rs.getString(5));
        ad.setAdresse(rs.getString(6));
        ad.setTel(rs.getString(7)); 
        ad.setSexe(rs.getString(8));
        ad.setPassword(rs.getString(9));
        ad.setType(rs.getString(10));
        ad.setDateNaissance(rs.getDate(11));
        ad.setTalent(rs.getString(12));
        
      
   }    

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
      return ad;
    }
     
    @Override
    public List<Candidat> displayAll() {

        List<Candidat> liste = new ArrayList<>();
        ResultSet rs;
        String sql = "select * from utilisateur where type = 'candidat'";

        try {
            pste = cnx.prepareStatement(sql);
            rs = pste.executeQuery();

            while (rs.next()) {
                Candidat ad = new Candidat(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDate(10), rs.getString(11));
                liste.add(ad);
            }

        } catch (SQLException e) { 
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return liste;
    }
       
    public Candidat check_candidat(Candidat c) {

        ResultSet rs;
        Candidat ad = new Candidat();
        String sql = "select * from utilisateur where mail = ? and password = ?";
        try {
            pste = cnx.prepareStatement(sql);
            pste.setString(1, c.getMail());
            pste.setString(2, c.getPassword());
            rs = pste.executeQuery();
            
      while (rs.next()){
      ad.setId(rs.getInt(1));
      ad.setNom(rs.getString(2));
      ad.setPrenom(rs.getString(3));
      ad.setCin(rs.getString(4));
      ad.setMail(rs.getString(5));
      ad.setAdresse(rs.getString(6));
      ad.setTel(rs.getString(7)); 
      ad.setSexe(rs.getString(8));
      ad.setPassword(rs.getString(9));
      ad.setType(rs.getString(10));
      ad.setDateNaissance(rs.getDate(11));
      ad.setTalent(rs.getString(12));
      
      
      
      
      
   }    

        

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ad;
    }




}


