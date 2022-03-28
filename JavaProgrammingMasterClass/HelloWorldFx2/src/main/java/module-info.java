module com.example.helloworldfx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloworldfx2 to javafx.fxml;
    exports com.example.helloworldfx2;
}