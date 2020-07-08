/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.service;



import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tunisiangottalent.domain.Evenement;
import tunisiangottalent.util.DataSource;

/**
 *
 * @author MRABET Chaima
 */
public class EvennementService implements IService<Evenement>{
       //CRUD
    private Connection conn;
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;
    public EvennementService() {
        try {
            conn = DataSource.getInstance().getCnx();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EvennementService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    //ajouter Evennemet
    
    @Override
     public void insert(Evenement  e) {
        String sql = "INSERT INTO Evenement (`libelle`, `lieu`, `date_debut`, `date_fin`,`nb_place`)"+"VALUES (?,?,?,?,?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, e.getLibelle());
            pst.setString(2, e.getLieu());
            pst.setDate(3, e.getDate_debut());
            pst.setDate (4, e.getDate_fin());
            pst.setInt (5, e.getNb_place());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EvennementService.class.getName()).log(Level.SEVERE, null, ex);
        }
   
  }
    
    
    
    // Supprimer Evennement Selon ID :
    @Override
    public void delete(Evenement e){

    String sql = "delete from evenement where id_ev ="+ e.getIdEv();
          if (e != null) {
            try {

                ste = conn.createStatement();
                ste.executeUpdate(sql);

            } catch (SQLException ex) {
                Logger.getLogger(EvennementService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("n'existe pas");
        }
};

// Mettre a JOUR Libelle Evennement selon ID: 

    @Override
   public void Update(Evenement e) {
        String qry = "UPDATE evenement SET libelle ='" + e.getLibelle() 
                + "' WHERE id_ev =" + e.getIdEv();
        try {
            ste = conn.createStatement();
            ste.executeUpdate(qry);
            
        } catch (SQLException ex) {
            Logger.getLogger(EvennementService.class.getName()).log(Level.SEVERE, null, ex);
        }
       
  }

   
   // Afficher Evennement
    @Override
   public List<Evenement> displayAll(){
     String requete="SELECT * FROM Evenement";
        List<Evenement> listEvenement= new ArrayList();
        try {
//            System.out.println(conn);
              Statement ste=conn.createStatement();
              ResultSet rs = ste.executeQuery(requete);
              while (rs.next()){
            Evenement ev=new Evenement();
            ev.setIdEv(rs.getInt("id_ev")); //NAJEM NHOT 1 FEL PARAMETRE// SELON L BD ATTRIBUT LOWEL 1 
            ev.setLibelle(rs.getString("libelle")); //NAJEM NHOT 2 FEL PARAMETRE  //ATTRIBUT 2 FEL BD
            ev.setLieu(rs.getString("Lieu"));
            ev.setDate_debut(rs.getDate("date_debut")); //NAJEM NHOT 3 FEL PARAMETRE //ATRIBUT 3 FEL BD
            ev.setDate_fin(rs.getDate("date_fin")); //NAJEM NHOT 3 FEL PARAMETRE //ATRIBUT 3 FEL BD
            ev.setNb_place(rs.getInt("Nb_place"));
            listEvenement.add(ev);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EvennementService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listEvenement;
}
//   public list juryEvenment(Jury j){
//       req ="select detail_evenement where id_utilisateur =" + J.getidJury();
//       
//   }


    @Override
    public Evenement displayById(int id) {
        ResultSet rs;
        Evenement a = new Evenement();
        String sql = "select * from Evenement where id_ev = ?";
        try {

            PreparedStatement pste = conn.prepareStatement(sql);
            pste.setInt(1, id);
            rs = pste.executeQuery();
            while (rs.next()) {
             a.setIdEv(rs.getInt("id_ev")); 
            a.setLibelle(rs.getString("libelle")); 
            a.setLieu(rs.getString("Lieu"));
            a.setDate_debut(rs.getDate("date_debut")); 
            a.setDate_fin(rs.getDate("date_fin")); 
            a.setNb_place(rs.getInt("Nb_place"));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return a;
    }
   

    
}

