package com.example.bankass;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

import java.io.IOException;

public class MainClass extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainClass.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 503, 364);
        stage.setTitle("Ass Bank");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}