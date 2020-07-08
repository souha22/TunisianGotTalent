/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import tunisiangottalent.domain.Utilisateur;
import tunisiangottalent.service.UtilisateurService;
import static tunisiangottalent.util.Flash.flash;
import tunisiangottalent1.TunisianGotTalent1;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class LoginController implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private Tab tab_user;
    @FXML
    private JFXTextField loginUser;
    @FXML
    private JFXPasswordField passwordUser;
    @FXML
    private JFXButton btnLoginUser;
    @FXML
    private JFXButton btnRegisterUser;
    @FXML
    private Tab tab_admin;
    @FXML
    private JFXTextField loginAdmin;
    @FXML
    private JFXPasswordField passwordAdmin;
    @FXML
    private JFXButton btnLoginAdmin;
     public static AnchorPane rootP;
      public static Utilisateur utilisateurSession;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            if (!tunisiangottalent1.TunisianGotTalent1.isSplashLoaded) {
            loadSplashScreen();
            rootP = root;
        }
            
                    btnLoginUser.setOnAction(event -> {

            List<Utilisateur> l = new ArrayList<>();
         Utilisateur r = new Utilisateur();
            r.setMail(loginUser.getText());
            r.setPassword(passwordUser.getText());
            UtilisateurService Rs = new UtilisateurService();
            l = Rs.check_utilisateur(r);
            if (l.isEmpty()) {
             flash(btnLoginUser, "Erreur!");
           } else {
               try {
                    LoginController.utilisateurSession = l.get(0);
                   Parent page = FXMLLoader.load(getClass().getResource(("/tunisiangottalent/views/MainWindow.fxml")));
                   Scene scene = new Scene(page);
                   Stage stage = (Stage) ((Node) event.getSource()) .getScene().getWindow();
                   stage.setScene(scene);
                   stage.show();
               } catch (IOException ex) {
                   Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
               }
            }
       
                       

        });
        // TODO
    }
    
    private void loadSplashScreen() {

        try {
            TunisianGotTalent1.isSplashLoaded = true;
            StackPane pane = FXMLLoader.load(getClass().getResource(("/tunisiangottalent/views/SplashFXML.fxml")));

            root.getChildren().setAll(pane);
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(3), pane);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);
            fadeIn.setCycleCount(1);

            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), pane);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setCycleCount(1);

            fadeIn.play();

            fadeIn.setOnFinished((e) -> {
                fadeOut.play();
            });

            fadeOut.setOnFinished((e) -> {

                try {

                    AnchorPane parentContent = FXMLLoader.load(getClass().getResource("/tunisiangottalent/views/Login.fxml"));

                    root.getChildren().setAll(parentContent);
                } catch (IOException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }

            });
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


   
    
}
