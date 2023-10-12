package com.example.bankass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {

    String[] logMass = new String[]{"1"};
    String[] passMass = new String[]{"2"};

    @FXML
    public Button logButton, exitButton;

    @FXML
    public TextField logField;

    @FXML
    public PasswordField passField;

    @FXML
    public Label outputText;

    @FXML
    public AnchorPane logPane,mainPane;

    @FXML
    void login(ActionEvent event) {

        if (passField.getText().equals(passMass[0]) && logField.getText().equals(logMass[0])) {
            logPane.setVisible(false);
            mainPane.setVisible(true);

        } else {
            outputText.setStyle("-fx-text-fill: #c61010");
            outputText.setText("Неверный логин или пароль");
        }
    }

    @FXML
    void exit (ActionEvent event) {
        mainPane.setVisible(false);
        logPane.setVisible(true);
    }

}