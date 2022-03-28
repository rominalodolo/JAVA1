module com.example.helloworldfx4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloworldfx4 to javafx.fxml;
    exports com.example.helloworldfx4;
}