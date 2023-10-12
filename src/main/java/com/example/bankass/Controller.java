package com.example.bankass;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    String[] logMass = new String[]{"1"};
    String[] passMass = new String[]{"2"};

    @FXML
    public Button logButton, exitButton;

    @FXML
    public ComboBox groupUsers;

    public ComboBox getGroupUsers() {
        ObservableList<String> group = FXCollections.observableArrayList("Пользователь", "Администратор");
        groupUsers.setValue("Пользователь");
        return groupUsers;
    }

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
    void login () {
        if (passField.getText().equals(passMass[0]) && logField.getText().equals(logMass[0])) {
            if (groupUsers.getValue().equals("Пользователь")) {
                logPane.setVisible(false);
                userPane.setVisible(true);
            }
        }
        else if (groupUsers.getValue().equals("Администратор")){
            logPane.setVisible(false);
            userPane.setVisible(true);
        }
        else {
            outputText.setStyle("-fx-text-fill: #c61010");
            outputText.setText("Неверный логин или пароль");
        }
    }

    @FXML
    void exit (ActionEvent event) {
        userPane.setVisible(false);
        logPane.setVisible(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        groupUsers.getItems().removeAll(groupUsers.getItems());
        groupUsers.getItems().addAll("Пользователь", "Администратор");
        groupUsers.getSelectionModel().select("Пользователь");
    }

}