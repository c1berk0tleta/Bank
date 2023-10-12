package com.example.bankass;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    String[] logMass = new String[]{"1"};
    String[] passMass = new String[]{"2"};

    @FXML
    public Button logButton, exitButton;

    @FXML
    public ComboBox groupUsers;

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
    public ImageView rock;

    @FXML
    public BorderPane backPane;

    @FXML
    void login () {
        FadeTransition fadeRock = new FadeTransition(Duration.seconds(2), rock);
        fadeRock.setByValue(1.0);
        fadeRock.setToValue(0);
        fadeRock.play();
        if (passField.getText().equals(passMass[0]) && logField.getText().equals(logMass[0])) {
            if (groupUsers.getValue().equals("Пользователь")) {
                // hide admin functions
            }
            logPane.setVisible(false);
            userPane.setVisible(true);
        }
        else {
            outputText.setStyle("-fx-text-fill: #c61010");
            outputText.setText("Неверный логин или пароль");
        }
    }

    @FXML
    void exit () {
        FadeTransition fadeRock = new FadeTransition(Duration.seconds(2), rock);
        fadeRock.setByValue(0);
        fadeRock.setToValue(1.0);
        fadeRock.play();
        logPane.setVisible(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        groupUsers.getItems().removeAll(groupUsers.getItems());
        groupUsers.getItems().addAll("Пользователь", "Администратор");
        groupUsers.getSelectionModel().select("Пользователь");
    }

}