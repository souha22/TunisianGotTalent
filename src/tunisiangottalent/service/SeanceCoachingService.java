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

import tunisiangottalent.domain.SeanceCoaching;

import tunisiangottalent.util.DataSource;

public class SeanceCoachingService implements IService<SeanceCoaching>{
 private Connection conn;
 private Statement ste;
 private PreparedStatement pst;
 private ResultSet rs;
 public SeanceCoachingService() throws ClassNotFoundException{
     conn=DataSource.getInstance().getCnx();
 }
 
 @Override
 public void insert(SeanceCoaching s){
      String req = "insert into seance_coaching (date_debut,date_fin,lieu,type) values(?,?,?,?)";
     try {
        // ste=conn.createStatement();
         pst = conn.prepareStatement(req);
        
          //pst.setInt(1,s.getIdSeance());
           pst.setDate(1,s.getDate_debut());
            pst.setDate(2,s.getDate_Fin());
            pst.setString(3,s.getLieu());
            pst.setString(4, s.getType()); 
          pst.executeUpdate(); 
     } catch (SQLException ex) {
         Logger.getLogger(SeanceCoachingService.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 @Override
 public void delete(SeanceCoaching s){
  String req = "delete from seance_coaching where id_seance = ?"; 
     try {  
         pst = conn.prepareStatement(req);
         pst.setDouble(1, s.getId_seance());
           pst.executeUpdate();
     } catch (SQLException ex) {
         Logger.getLogger(SeanceCoachingService.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 @Override
 public void Update(SeanceCoaching s){
     String req = "update seance_coaching set "+"date_debut= ?,"+"date_fin= ?,"+"lieu=?,"+ " type =? "+ "where id_seance=?";
     try {
         pst=conn.prepareStatement(req);
         pst.setDate(1, s.getDate_debut());
         pst.setDate(2, s.getDate_Fin());
          pst.setString(3, s.getLieu());
          pst.setString(4, s.getType());
          pst.setInt(5,s.getId_seance());
          pst.executeUpdate();
     } catch (SQLException ex) {
         Logger.getLogger(SeanceCoachingService.class.getName()).log(Level.SEVERE, null, ex);
     }
     
 }
 @Override
 public List<SeanceCoaching> displayAll(){
   String requete = "select * from seance_coaching"; 
   List<SeanceCoaching> list=new ArrayList<>();
     try {
         ste=conn.createStatement();
         rs=ste.executeQuery(requete);
         while(rs.next()){
list.add(new SeanceCoaching(rs.getInt(1),  rs.getDate(2), rs.getDate(3), rs.getString(4), rs.getString(5))); 
     } }
     catch (SQLException ex) {
         Logger.getLogger(SeanceCoachingService.class.getName()).log(Level.SEVERE, null, ex);
     }
   return list;
}
 @Override
 public SeanceCoaching displayById(int id) {
     SeanceCoaching se = new SeanceCoaching();
     String req = "select * from seance_coaching where id_seance = ?";
     System.out.println("bbbb");
     try {
         
        pst=conn.prepareStatement(req);
        pst.setInt(1,id);
          rs = pst.executeQuery();
          
          while (rs.next()){
              
           
             se.setId_seance(rs.getInt(1));
             se.setDate_Debut(rs.getDate(2));
             se.setDate_Fin(rs.getDate(3));
             se.setLieu(rs.getString(4));
             se.setType(rs.getString(5));
              System.out.println("aaaa");
          }
     } catch (SQLException ex) {
     }
      return se;  
 }

 

 





}