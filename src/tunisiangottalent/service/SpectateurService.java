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
import tunisiangottalent.domain.Spectateur;
import tunisiangottalent.util.DataSource;

/**
 *
 * @author KA
 */
public class SpectateurService implements IService<Spectateur>{

    private Connection cnx;
    private PreparedStatement pste;

    ;

    public SpectateurService(){
        try {
            cnx = DataSource.getInstance().getCnx();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SpectateurService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*public void insert(Spectateur s){
        String requete="insert into utilisateur (nom,prenom,cin,mail,adresse,tel,sexe,password,type,date_naissance) values"
                + " ('"+s.getNom()+"','"+s.getPrenom()+"','"+s.getCin()+"','"+s.getMail()+"','"+s.getAdresse()+"','"+s.getTel()+"','"+s.getSexe()+"','"+s.getPassword()+"','"+s.getType()+"','"+s.getDateNaissance()+"')";
        
       
        try {
            ste=cnx.createStatement();
            ste.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(SpectateurService.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }*/
    public void insert(Spectateur s) {
        String requete = "insert into utilisateur (nom,prenom,cin,mail,adresse,tel,sexe,password,type,date_naissance)values(?,?,?,?,?,?,?,?,?,?)";
        try {
            pste = cnx.prepareStatement(requete);
            pste.setString(1, s.getNom());
            pste.setString(2, s.getPrenom());
            pste.setString(3, s.getCin());
            pste.setString(4, s.getMail());
            pste.setString(5, s.getAdresse());
            pste.setString(6, s.getTel());
            pste.setString(7, s.getSexe());
            pste.setString(8, s.getPassword());
            pste.setString(9, "spectateur");
            pste.setDate(10, s.getDateNaissance());

            pste.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CandidatService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Update(Spectateur s) {

        int x = 0;
        String sql = ""
                + "update utilisateur set nom = ? , prenom = ?, mail=?, "
                + " adresse = ?, tel = ?, "
                + "sexe = ?, password= ?, date_naissance=?, "
                + "where cin= ?";
        try {
            pste = cnx.prepareStatement(sql);
            pste.setString(1, s.getNom());
            pste.setString(2, s.getPrenom());
            pste.setString(3, s.getMail());
            pste.setString(4, s.getAdresse());
            pste.setString(5, s.getTel());
            pste.setString(6, s.getSexe());
            pste.setString(7, s.getPassword());
            pste.setDate(8, s.getDateNaissance());

            x = pste.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       
    }

    @Override
    public void delete(Spectateur s) {
        String sql = "delete from utilisateur where cin = ?";
        try {
            pste = cnx.prepareStatement(sql);
            pste.setString(1, s.getCin());
            pste.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Spectateur displayById(int s) {

        ResultSet rs;
        Spectateur as = new Spectateur();
        String sql = "select * from utilisateur where type='spectateur' and Id_utilisateur = ?";
        try {

            pste = cnx.prepareStatement(sql);
            pste.setInt(1, s);
            rs = pste.executeQuery();
            while (rs.next()) {
                as.setId(rs.getInt(1));
                as.setNom(rs.getString(2));
                as.setPrenom(rs.getString(3));
                as.setCin(rs.getString(4));
                as.setMail(rs.getString(5));
                as.setAdresse(rs.getString(6));
                as.setTel(rs.getString(7));
                as.setSexe(rs.getString(8));
                as.setPassword(rs.getString(9));
                as.setType(rs.getString(10));
                as.setDateNaissance(rs.getDate(11)); 
                
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return as;
    }

    @Override
    public List<Spectateur> displayAll() {

        List<Spectateur> liste = new ArrayList<>();
        ResultSet rs;
        String sql = "select * from utilisateur where type = 'spectateur'";

        try {
            pste = cnx.prepareStatement(sql);
            rs = pste.executeQuery();

            while (rs.next()) {
                Spectateur as = new Spectateur(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10),rs.getDate(11));
                liste.add(as);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return liste;
    }
    
    public Spectateur check_spectateur(Spectateur s) {

        ResultSet rs;
        Spectateur as = new Spectateur();
        String sql = "select * from utilisateur where mail = ? and password = ?";
        try {
            pste = cnx.prepareStatement(sql);
            pste.setString(1, s.getMail());
            pste.setString(2, s.getPassword());
            rs = pste.executeQuery();
            
      while (rs.next()){
      as.setId(rs.getInt(1));
      as.setNom(rs.getString(2));
      as.setPrenom(rs.getString(3));
      as.setCin(rs.getString(4));
      as.setMail(rs.getString(5));
      as.setAdresse(rs.getString(6));
      as.setTel(rs.getString(7));
      as.setSexe(rs.getString(8));
      as.setPassword(rs.getString(9));
      as.setType(rs.getString(10));
      as.setDateNaissance(rs.getDate(11)); 
   }    

        

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return as;
    
    }
}