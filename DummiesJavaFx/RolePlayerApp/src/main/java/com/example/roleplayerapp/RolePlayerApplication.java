package com.example.roleplayerapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class RolePlayerApplication extends Application {

    public static void main(String[] args) {

        launch(args);
    }


    TextField txtCharacter;
    TextField txtActor;

    @Override
    public void start(Stage primaryStage) {

        Label lblCharacter = new Label("Character's Name:");
        lblCharacter.setMinWidth(100);
        lblCharacter.setAlignment(Pos.BOTTOM_RIGHT);

        txtCharacter = new TextField();
        txtCharacter.setMinWidth(200);
        txtCharacter.setMaxWidth(200);
        txtCharacter.setPromptText(
                "Enter the name of the character here.");

        


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Role Player");
        primaryStage.show();
    }

    public void btnOK_Click()
    {
        String errorMessage = "";

        if (txtCharacter.getText().length() == 0)
        {
            errorMessage += "\nCharacter is a required field.";
        }

        if (txtActor.getText().length() == 0)
        {
            errorMessage += "\nActor is a required field.";
        }

        if (errorMessage.length() == 0)
        {
            String message = "The role of "
                    + txtCharacter.getText()
                    + " will be played by "
                    + txtActor.getText()
                    + ".";
            Alert a = new Alert(Alert.AlertType.INFORMATION, message);
            a.setTitle("Cast");
            a.showAndWait();
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.WARNING, errorMessage);
            a.setTitle("Missing Data");
            a.showAndWait();
        }
    }


}