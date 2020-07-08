/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class MainController implements Initializable {

    @FXML
    private JFXButton btn_logout;
    @FXML
    private TableView<?> tablerandonnee;
    @FXML
    private TableColumn<?, ?> colonneTitre;
    @FXML
    private GridPane table;
    @FXML
    private Label lbIdRandonnee;
    @FXML
    private Label lbTitre;
    @FXML
    private Label lbDescription;
    @FXML
    private Label lbDateDepart;
    @FXML
    private Label lbDateArrivee;
    @FXML
    private Label lbLieuDepart;
    @FXML
    private Label lbLieuArrivee;
    @FXML
    private Label lbIdRandonneur;
    @FXML
    private Label lbStatus;
    @FXML
    private JFXButton btn_media;
    @FXML
    private JFXButton btn_participer;
    @FXML
    private JFXButton btn_noter;
    @FXML
    private JFXButton btnCommenter;
    @FXML
    private TableView<?> tableCommentaires;
    @FXML
    private TableColumn<?, ?> ColonneIdRandonneur;
    @FXML
    private TableColumn<?, ?> ColonneCommentaire;
    @FXML
    private WebView WebViewMap;
    @FXML
    private Tab mes_infos;
    @FXML
    private JFXTextField NomRandonneurArea;
    @FXML
    private JFXTextField PrenomRandonneurArea;
    @FXML
    private JFXDatePicker date_naissance;
    @FXML
    private JFXTextField emailArea;
    @FXML
    private JFXButton btn_modifier_infos;
    @FXML
    private Tab tabMesRandonnees;
    @FXML
    private GridPane table1;
    @FXML
    private Label lbIdRandonnee1;
    @FXML
    private Label lbTitre1;
    @FXML
    private Label lbDescription1;
    @FXML
    private Label lbDateDepart1;
    @FXML
    private Label lbDateArrivee1;
    @FXML
    private Label lbLieuDepart1;
    @FXML
    private Label lbLieuArrivee1;
    @FXML
    private Label lbIdRandonneur1;
    @FXML
    private Label lbStatus1;
    @FXML
    private JFXTextField txtIdRandonnee;
    @FXML
    private JFXTextField txtTitre;
    @FXML
    private JFXTextArea txtDescription;
    @FXML
    private JFXTextField txtDepart;
    @FXML
    private JFXTextField txtNbePlaces;
    @FXML
    private JFXTextField txtNote;
    @FXML
    private JFXDatePicker datePickerDepart;
    @FXML
    private JFXDatePicker datePickerArrivee;
    @FXML
    private JFXTextField txtLieuArrivee;
    @FXML
    private JFXButton btn_ajouter_randonnee;
    @FXML
    private JFXButton btn_valider_modif;
    @FXML
    private TableView<?> tableMesRandonnees;
    @FXML
    private TableColumn<?, ?> colonneMesRandonnee;
    @FXML
    private Tab me_participation;
    @FXML
    private TableView<?> mes_participation_randonnee;
    @FXML
    private TableColumn<?, ?> colone_mes_participation;
    @FXML
    private Label lblIdrandonnee;
    @FXML
    private Label lblTitre;
    @FXML
    private Label lblDescription;
    @FXML
    private Label lblDateDepart;
    @FXML
    private Label lblDateArrivee;
    @FXML
    private Label lblLieuDepart;
    @FXML
    private Label lblLieuArrivee;
    @FXML
    private Label lblNbrParticipants;
    @FXML
    private Label lblNote;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AffichageCommentaires(MouseEvent event) {
    }

    @FXML
    private void ViewMedia(ActionEvent event) {
    }

    @FXML
    private void ParticiperAction(ActionEvent event) {
    }

    @FXML
    private void Noteme(ActionEvent event) {
    }

    @FXML
    private void AjouterCommentaire(ActionEvent event) {
    }

    @FXML
    private void ShowMap(MouseEvent event) {
    }

    @FXML
    private void ValiderModifInfos(ActionEvent event) {
    }

    @FXML
    private void AjouterRandonnee(ActionEvent event) {
    }
    
}
