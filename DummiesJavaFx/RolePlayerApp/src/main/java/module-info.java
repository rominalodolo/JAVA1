module com.example.roleplayerapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.roleplayerapp to javafx.fxml;
    exports com.example.roleplayerapp;
}