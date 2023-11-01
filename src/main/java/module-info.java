module com.example.bankass {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.mail;


    opens com.example.bankass to javafx.fxml;
    exports com.example.bankass;
}