package com.example.data_btw_controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
    @FXML
    Label myLabel;

    public void displayUsername(String username) {
        myLabel.setText("Hello, " + username + "!");
    }
}
