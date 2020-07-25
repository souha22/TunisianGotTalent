/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.controllers;

import com.jfoenix.controls.JFXTextField;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import tunisiangottalent.domain.Candidat;
import tunisiangottalent.service.CandidatService;
import java.util.Calendar;
import java.time.LocalDate;
import javafx.scene.control.DatePicker;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author KA
 */
public class AjouterCandidatController implements Initializable {

    
    @FXML
    private Button btn;
    @FXML
    private JFXDatePicker dp;
    @FXML
    private JFXButton btn_valider;
    
    @FXML
    private JFXTextField txtn;
    @FXML
    private JFXTextField txtp;
    @FXML
    private JFXTextField txtc;
    @FXML
    private JFXTextField txtm;
    @FXML
    private JFXTextField txtad;
    @FXML
    private JFXTextField txttel;
    @FXML
    private JFXTextField txtpass;
    @FXML
    private JFXTextField txttal;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btn_valider.setOnAction((ActionEvent event) -> {
                    CandidatService cs = new CandidatService();
        Candidat c  = new Candidat();
       
        c.setNom(txtn.getText());
        c.setPrenom(txtp.getText());
        c.setCin(txtc.getText());
        c.setMail(txtm.getText());
        c.setAdresse(txtad.getText());
       // c.setTalent(txttal.getText());
        c.setPassword(txtpass.getText());
        c.setTel(txttel.getText());
        
        java.util.Date date = java.sql.Date.valueOf(dp.getValue());
        c.setDateNaissance((Date)date);
        
         
        cs.insert(c);
            
             });
        // TODO
    }    

//    @FXML
   /* public boolean verifData(){
    
       if(txtn.getText().equals("") || (txtp.getText().equals("")) || txtc.getText().equals("") 
           || (txtm.getText().equals(""))  || (txtad.getText().equals(""))  
                   || (txtp.getText().equals(""))  || (txts.getText().equals(""))  
                     || (txttal.getText().equals("")) || (txtpass.getText().equals(""))  
                     || (txttel.getText().equals("")))
       {
           JOptionPane.showMessageDialog(null, "Un ou plusieurs champs sont vides");
           return false;
       }
       else 
          return true;
   }*/
    
//    private void valider(ActionEvent event) {
//        
//        CandidatService cs = new CandidatService();
//        Candidat c  = new Candidat();
//       
//        c.setNom(txtn.getText());
//        c.setPrenom(txtp.getText());
//        c.setCin(txtc.getText());
//        c.setMail(txtm.getText());
//        c.setAdresse(txtad.getText());
//        c.setTalent(txttal.getText());
//        c.setPassword(txtpass.getText());
//        c.setTel(txttel.getText());
//        
//        java.util.Date date = java.sql.Date.valueOf(dp.getValue());
//        c.setDateNaissance((Date)date);
//        
//         
//        cs.insert(c);
//          
//        
//    }
//   
}   

