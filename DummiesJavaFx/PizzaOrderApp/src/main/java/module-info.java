module com.example.pizzaorderapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pizzaorderapp to javafx.fxml;
    exports com.example.pizzaorderapp;
}