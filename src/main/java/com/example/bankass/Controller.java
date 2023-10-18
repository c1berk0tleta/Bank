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
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    String[] logMass = new String[]{"1"};
    String[] passMass = new String[]{"2"};

    @FXML
    public Button logButton, exitButton, addUserButton, newUser, profileButton, trancHistoryButton;

    @FXML
    public ComboBox groupUsers;

    @FXML
    public TextField logField;

    @FXML
    public PasswordField passField;

    @FXML
    public Label outputText;

    @FXML
    public AnchorPane userPane;
    @FXML
    public Pane logPane, addUserPane, profilePane, trancHistoryPane;
    @FXML
    public ImageView rock;
    @FXML
    public BorderPane backPane;

    void enablePane(int num) {
        switch (num) {
            case 1: //profilePane
                profilePane.setVisible(true);
            case 2: //trancHistoryPane
                trancHistoryPane.setVisible(true);
            case 3: //addUserPane
                addUserPane.setVisible(true);
        }
    }

    @FXML
    void enableProfilePane() {
        disableAll();
        profilePane.setVisible(true);
    }
    @FXML
    void enableTrancHistoryPane() {
        disableAll();
        trancHistoryPane.setVisible(true);
    }
    @FXML
    void enableAddUserPane() {
        disableAll();
        addUserPane.setVisible(true);
    }

    void disableAll() {
        profilePane.setVisible(false);
        trancHistoryPane.setVisible(false);
        addUserPane.setVisible(false);
    }

    void disableButtons () {
        profileButton.setDisable(true);
        trancHistoryButton.setDisable(true);
        addUserButton.setDisable(true);
    }
    void enableButtons () {
        profileButton.setDisable(false);
        trancHistoryButton.setDisable(false);
        addUserButton.setDisable(false);
    }

    @FXML
    void login () {
        FadeTransition fadeRock = new FadeTransition(Duration.seconds(2), rock);
        fadeRock.setByValue(1.0);
        fadeRock.setToValue(0);

        if (passField.getText().equals(passMass[0]) && logField.getText().equals(logMass[0])) {
            if (groupUsers.getValue().equals("Пользователь")) {
                // hide admin functions
            }
            fadeRock.play();
            enableButtons();
            logPane.setVisible(false);
            userPane.setVisible(true);
            addUserPane.setVisible(false);
        }
        else {
            outputText.setStyle("-fx-text-fill: #c61010");
            outputText.setText("Неверный логин или пароль");
        }
    }

    @FXML
    void exit () {
        disableAll();
        FadeTransition fadeRock = new FadeTransition(Duration.seconds(2), rock);
        fadeRock.setByValue(0);
        fadeRock.setToValue(1.0);
        fadeRock.play();
        logPane.setVisible(true);
        disableButtons();
    }

    void addUserPane_show() {
        addUserPane.setVisible(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        groupUsers.getItems().removeAll(groupUsers.getItems());
        groupUsers.getItems().addAll("Пользователь", "Администратор");
        groupUsers.getSelectionModel().select("Пользователь");
    }

}