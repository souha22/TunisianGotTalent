/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.util;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author heni
 */
public class Flash {
 
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Status Flash");
        BorderPane layout = new BorderPane();
        Scene scene = new Scene(layout, 300, 250);
 
        final TextField text = new TextField("Added 1 Record");        
        final Button btn = new Button();
 
        btn.setText("Show Message");
        layout.setCenter(text);
        layout.setBottom(btn);
 
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                flash(btn, text.getText());
            }
        });
 
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void flash(Node node, String message) {
        Font font = Font.font("Helvetica", FontWeight.NORMAL, 20);
        Color boxColor = Color.TOMATO;
        Color textColor = Color.WHITE;
        double duration = 3000;
        double arcH = 10;
        double arcW = 10;
 
        final Rectangle rectangle = new Rectangle();
        final Text text = new Text(message);
 
 
        double x = 0;
        double y = 0;
        text.setLayoutX(x);
        text.setLayoutY(y);
        text.setFont(font);
        text.setFill(textColor);
 
        Scene scene = node.getScene();
        final Parent p = scene.getRoot();
 
        if (p instanceof Group) 
        {
            Group group = (Group) p;
            group.getChildren().add(rectangle);
            group.getChildren().add(text);
        }
        if (p instanceof Pane) 
        {
            Pane group = (Pane) p;
            group.getChildren().add(rectangle);
            group.getChildren().add(text);
        }
 
        Bounds bounds = text.getBoundsInParent();
 
        double sWidth = scene.getWidth();
        double sHeight = scene.getHeight();
 
        x = sWidth / 2 - (bounds.getWidth() / 2);
        y = sHeight / 2 - (bounds.getHeight() / 2);
        text.setLayoutX(x);
        text.setLayoutY(y);
        bounds = text.getBoundsInParent();
        double baseLineOffset = text.getBaselineOffset();
 
 
        rectangle.setFill(boxColor);
        rectangle.setLayoutX(x - arcW);
        rectangle.setLayoutY(y - baseLineOffset - arcH);
        rectangle.setArcHeight(arcH);
        rectangle.setArcWidth(arcW);
        rectangle.setWidth(bounds.getWidth() + arcW * 2);
        rectangle.setHeight(bounds.getHeight() + arcH * 2);
 
        FadeTransition ft = new FadeTransition(
                Duration.millis(duration), rectangle);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.play();
        ft.setOnFinished(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                if (p instanceof Group) {
                    Group group = (Group) p;
                    group.getChildren().remove(rectangle);
                    group.getChildren().remove(text);
                }
                 if (p instanceof Pane) {
                    Pane group = (Pane) p;
                    group.getChildren().remove(rectangle);
                    group.getChildren().remove(text);
                }
            }
        });
        FadeTransition ft2 = new FadeTransition(
                Duration.millis(duration + (duration * .1)), text);
        ft2.setFromValue(1.0);
        ft2.setToValue(0.0);
        ft2.play();
    }
    
}
