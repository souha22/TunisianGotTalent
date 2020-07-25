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
import java.sql.SQLException;
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
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import tunisiangottalent.domain.Administrateur;
import tunisiangottalent.domain.Utilisateur;
import tunisiangottalent.service.AdministrateurService;
import tunisiangottalent.service.ServiceUser;
import tunisiangottalent.service.UtilisateurService;
import static tunisiangottalent.util.Flash.flash;
import tunisiangottalent.util.JavaModals;
import tunisiangottalent.util.UserSession;
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
    @FXML
    private Label passwordWarning;
    @FXML
    private Label usernameWarning;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            if (!tunisiangottalent1.TunisianGotTalent1.isSplashLoaded) {
            loadSplashScreen();
            rootP = root;
           
        }
                usernameWarning.setVisible(false);
        passwordWarning.setVisible(false); 
                    btnLoginUser.setOnAction(event -> {

//            List<Utilisateur> l = new ArrayList<>();
//         Utilisateur r = new Utilisateur();
//            r.setMail(loginUser.getText());
//            r.setPassword(passwordUser.getText());
//            UtilisateurService Rs = new UtilisateurService();
//            l = Rs.check_utilisateur(r);
//            if (l.isEmpty()) {
//             flash(btnLoginUser, "Erreur!");
//           } else {
//               try {
//                    LoginController.utilisateurSession = l.get(0);
//                   Parent page = FXMLLoader.load(getClass().getResource(("/tunisiangottalent/views/MainWindow.fxml")));
//                   Scene scene = new Scene(page);
//                   Stage stage = (Stage) ((Node) event.getSource()) .getScene().getWindow();
//                   stage.setScene(scene);
//                   stage.show();
//               } catch (IOException ex) {
//                   Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
//               }
//            }
//             btnLoginUser.setOnAction((event) -> {
           
            try {
                String username = loginUser.getText();
                String password = passwordUser.getText();
                if (username.isEmpty()) {
                    //JavaModals.ErrorBox("Please enter your email", null, "ERROR");
                    usernameWarning.setVisible(true);
                    System.out.println("email ne doit pas etre vide");
                }else if (password.isEmpty()) {
                    //JavaModals.ErrorBox("Please enter your password", null, "ERROR");
                    passwordWarning.setVisible(true);
                    System.out.println("password ne doit pas etre vide");
                } else {

                    ServiceUser se = new ServiceUser();
                    boolean flag = se.validateCredentials(username, password);
                    if (!flag) {
                        JavaModals.ErrorBox("Erreur login ou mot de passe", null, "ERROR");
                        System.out.println("Erreur login ou mot de passe");
                    } else {
                        UserSession.setInstance(username);
                      //  if (UserSession.getInstance().getActive() == 1) {
                            JavaModals.infoBox("welcome", null, "sccess");
                            Stage stage = (Stage) btnLoginUser.getScene().getWindow();
                            Parent newParent = FXMLLoader.load(getClass().getResource("HomeFXML.fxml"));
                            Scene newScene = new Scene(newParent);
                            stage.setScene(newScene);
                            stage.show();
                        //} else {
                          //  JavaModals.infoBox("Account disabled Please contact Administrator", null, "WARNING");
                       // }
                    }
                }
            } catch (IOException ex) {
                System.out.println("error" + ex.getMessage());
            } catch (SQLException ex) {
                System.out.println("error z" + ex.getMessage());
            }
        });
    
                       

     
             btnRegisterUser.setOnAction(event -> {

            try {
                Parent page = FXMLLoader.load(getClass().getResource("/tunisiangottalent/views/AjouterCandidat.fxml"));
                Scene scene = new Scene(page);
                Stage stage = (Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
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
//     btnLoginAdmin.setOnAction(event -> {
//            try {
//                List<Administrateur> l = new ArrayList<>();
//                Administrateur a = new Administrateur();
//                a.setLogin(String.valueOf(loginAdmin.getText()));
//                a.setPassword(String.valueOf(passwordAdmin.getText()));
//                AdministrateurService As = new AdministrateurService();
//                l = As.check_administrateur(a)
//                if (l.isEmpty()) {
//                    flash(btnLoginAdmin, "Erreur!");
//                } else {
//                    Parent page = FXMLLoader.load(getClass().getResource("/gestionrandonnee/views/MainAdminWindow.fxml"));
//                    Scene scene = new Scene(page);
//                    Stage stage = (Stage) ((Node) event.getSource())
//                            .getScene()
//                            .getWindow();
//                    stage.setScene(scene);
//                    stage.show();
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(NoterViewController.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        });



    
}
