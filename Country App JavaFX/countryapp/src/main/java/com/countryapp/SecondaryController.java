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

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

import javafx.application.Platform;
import javafx.scene.control.Label;

public class SecondaryController {

    // final result label that is shown in the second scene
    @FXML
    private Label resultLabel;

    // switches back to the main scene of the application
    @FXML
    private void switchToMain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        Scene scene = new Scene(root);

        // This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

    // exits the application
    @FXML
    private void exitApp() throws IOException {
        Platform.exit();
    }

    // receives the data from the primary controller
    public void initData(String country) {
        setData(country);
    }

    // sets the result label
    void setData(String country) {
        resultLabel.setText("The capital of " + country + " is " + App.countryCapitals.get(country));
    }
}