package com.example.bankass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.util.ResourceBundle;

public class Controller {

    String[] logMass = new String[]{"1"};
    String[] passMass = new String[]{"2"};

    @FXML
    public Button logButton, exitButton;

    @FXML
    public MenuButton groupUsers;

    @FXML
    public MenuItem userItem;

    @FXML
    public TextField logField;

    @FXML
    public PasswordField passField;

    @FXML
    public Label outputText;

    @FXML
    public AnchorPane logPane,userPane;

    @FXML
    void login(ActionEvent event) {

        if (passField.getText().equals(passMass[0]) && logField.getText().equals(logMass[0])) {
            if (groupUsers.equals("Пользователь")) {
                logPane.setVisible(false);
                userPane.setVisible(true);
            }

        } else {
            outputText.setStyle("-fx-text-fill: #c61010");
            outputText.setText("Неверный логин или пароль");
        }
    }

    @FXML
    void exit (ActionEvent event) {
        userPane.setVisible(false);
        logPane.setVisible(true);
    }


}