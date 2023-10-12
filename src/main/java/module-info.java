module com.example.bankass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bankass to javafx.fxml;
    exports com.example.bankass;
}