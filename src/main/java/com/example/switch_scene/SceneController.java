package com.example.switch_scene;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
    Parent root;
    Scene scene;
    Stage stage;

    public void switchToScene1(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("scene-1.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("scene-2.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
