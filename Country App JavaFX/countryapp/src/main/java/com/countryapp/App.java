/**********************************************
Workshop 7 - Task2
Course: JAC444 - Semester 4
Last Name: Abdi
First Name: Tareq
ID: 123809196
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature - TA
Date: 19/03/2022
**********************************************/

package com.countryapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Alert;

import java.util.HashMap;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    public static HashMap<String, String> countryCapitals = new HashMap<String, String>() {
        {
            put("England", "London");
            put("Denmark", "Copenhagen");
            put("Cuba", "Havana");
            put("Croatia", "Zagreb");
            put("Germany", "Berlin");
            put("Iceland", "Reykjavik");
            put("Hungary", "Budapest");
            put("Palestine", "Jerusalem");
            put("Japan", "Tokyo");
            put("Lebanon", "Beirut");
            put("Mexico", "Mexico City");
            put("Portugal", "Lisbon");
            put("Switzerland", "Bern");
            put("Turkey", "Ankara");
            put("Qatar", "Doha");
            put("Greece", "Athens");
            put("Finland", "Helsinki");
            put("Egypt", "Cairo");
            put("Colombia", "Bogota");
            put("Canada", "Ottawa");
            put("Brazil", "Brasilia");
            put("Austria", "Vienna");
            put("France", "Paris");
            put("Italy", "Rome");
            put("Bulgaria", "Sofia");
        }
    };

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"));
        stage.setScene(scene);
        stage.setTitle("Country Application");
        stage.setResizable(false);
        stage.show();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    // function that will show allert wherever needed
    public static void showAlert(Alert.AlertType alertType, String title, String message, String header) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.show();
    }

    public static void main(String[] args) {
        launch();
    }

}