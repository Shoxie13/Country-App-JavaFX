package com.countryapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

import javafx.scene.control.Alert.AlertType;

import javafx.application.Platform;

public class PrimaryController extends Field {

    // switches to the second scene and validates the input in the textfield
    // also transfers information from the textfield to the second scene
    @FXML
    private void switchToSecondary(ActionEvent event) throws IOException {
        if (!validCheck()) {
            if (getCountry().matches("^[A-Z][a-z]+(( |-)[A-Z][a-z]+)*$")
                    && (getCountry().length() >= 3 && getCountry().length() <= 25)) {
                if (App.countryCapitals.containsKey(getCountry())) {
                    loadScene(event);
                } else {
                    colorField(getCountryField());
                    App.showAlert(AlertType.ERROR, "Error!",
                            "The country " + getCountry()
                                    + " is not currently in the application.\nPlease try later...",
                            "Country Not Found!");
                }
            } else {
                colorField(getCountryField());
                if (getCountry().length() > 25) {
                    App.showAlert(AlertType.ERROR, "Error!",
                            "The country must have less than " + getCountry().length()
                                    + " character/s!",
                            "Validation Error!");
                } else {
                    App.showAlert(AlertType.ERROR, "Error!",
                            "The country must start with UPPERCASE and has to be\nmore than " + getCountry().length()
                                    + " character/s!",
                            "Validation Error!");
                }
            }
        } else {
            outlineFields();
        }

    }

    // button function that exits the application
    @FXML
    private void exitApp() throws IOException {
        Platform.exit();
    }

    // loads the secondary.fxml scene and sends information to the other controller
    void loadScene(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("secondary.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        // access the controller and call a method
        SecondaryController controller = loader.getController();

        // sends the data to the other controller
        controller.initData(getCountry());

        // This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }
}
