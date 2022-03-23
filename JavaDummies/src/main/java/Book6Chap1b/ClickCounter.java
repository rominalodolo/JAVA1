/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book6Chap1b;

/**
 *
 * @author rominalodolo
 */
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickCounter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btn;
    Label lbl;

    int iClickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        // Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());

        // Create the Label
        lbl = new Label();
        lbl.setText("You have not clicked the button.");

        // Add the label and the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setTop(lbl);
        pane.setCenter(btn);

        // Add the layout pane to a scene	
        Scene scene = new Scene(pane, 250, 150);

        // Add the scene to the stage, set the title
        // and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();
    }

    public void buttonClick() {
        iClickCount++;
        if (iClickCount == 1) {
            lbl.setText("You have clicked once.");
        } else {
            lbl.setText("You have clicked "
                    + iClickCount + " times.");
        }
    }

}
