module com.example.spinoffsapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spinoffsapp to javafx.fxml;
    exports com.example.spinoffsapp;
}