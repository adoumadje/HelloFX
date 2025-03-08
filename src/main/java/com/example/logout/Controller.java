package com.example.logout;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private AnchorPane scenePane;

    Stage stage;

    public void logout() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Are you sure you want to logout?");

        if(alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) this.scenePane.getScene().getWindow();
            System.out.println("User logged out successfully.");
            stage.close();
        }
    }
}
