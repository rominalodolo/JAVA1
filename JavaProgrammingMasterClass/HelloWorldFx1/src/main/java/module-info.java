module com.example.HelloWorldFx1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloworldfx1 to javafx.fxml;
    exports com.example.helloworldfx1;
}