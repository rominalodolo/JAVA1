package com.example.clickcounter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ClickCounter extends Application {

    Button btn;
    Label lbl;

    int iClickCount = 0;

    @Override
    public void start(Stage primaryStage) throws IOException {

        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());

        lbl = new Label();
        lbl.setText("You have not clicked the button.");

        BorderPane pane = new BorderPane();
        pane.setTop(lbl);
        pane.setCenter(btn);

        FXMLLoader fxmlLoader = new FXMLLoader(ClickCounter.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 250, 150);

        primaryStage.setTitle("Click Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void buttonClick()
    {
        iClickCount++;
        if (iClickCount == 1)
        {
            lbl.setText("You have clicked once.");
        }
        else
        {
            lbl.setText("You have clicked "
                    + iClickCount + " times." );
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}