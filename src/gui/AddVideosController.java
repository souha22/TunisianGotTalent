/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import tunisiangottalent.domain.Fichier;
import tunisiangottalent.service.FichierService;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class AddVideosController implements Initializable {

    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private Button addButton;
    @FXML
    private TextField videoURL;
    @FXML
    private DatePicker addDate;
    @FXML
    private ChoiceBox<?> videoType;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            FichierService fichierService = new FichierService();
       
        addButton.setOnAction(event -> {
            System.out.println("gui.AddVideosController.initialize()"+videoURL.getText());
            
            
            Fichier f = new Fichier();
            f.setUrl(videoURL.getText());   
          
            f.setType(videoType.getSelectionModel().getSelectedItem().toString());
        fichierService.insert(f);
        }
        );
         } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddVideosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }    
    void addVideo(){
        
    }
    
}
