module com.example.javadummiesjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javadummiesjavafx to javafx.fxml;
    exports com.example.javadummiesjavafx;
}