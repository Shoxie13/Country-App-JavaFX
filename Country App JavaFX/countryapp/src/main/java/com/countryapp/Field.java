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

import javafx.scene.control.TextField;

import javafx.fxml.FXML;

public abstract class Field {
    // textfield from the first scene (primaryController)
    @FXML
    private TextField countryTxt;

    // default constructor
    Field() {
    }

    // get function that will get the text inside the textfield
    String getCountry() {
        return countryTxt.getText();
    }

    // function that will get the field and return it
    TextField getCountryField() {
        return countryTxt;
    }

    // empty checker function
    boolean validCheck() {
        return getCountry().isEmpty();
    }

    // function that sets the style of the fields to red
    void colorField(TextField cc) {
        cc.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
    }

    // function that resets the style of the fields
    void colorFieldReset(TextField cc) {
        cc.setStyle("");
    }

    // checks if the field is empty
    boolean isEmptyField(String cc) {
        return cc.isEmpty();
    }

    // outline or resets the textfield border color depending on the condition
    void outlineFields() {
        if (isEmptyField(getCountry())) {
            colorField(getCountryField());
        } else
            colorFieldReset(getCountryField());
    }
}
