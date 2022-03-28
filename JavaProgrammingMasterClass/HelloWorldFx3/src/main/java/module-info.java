module com.example.helloworldfx3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloworldfx3 to javafx.fxml;
    exports com.example.helloworldfx3;
}