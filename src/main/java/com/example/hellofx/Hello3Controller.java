package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Hello3Controller {

    @FXML
    private Circle myCircle;

    public void up(ActionEvent e) {
        myCircle.setCenterY(myCircle.getCenterY() - 10);
    }

    public void down(ActionEvent e) {
        myCircle.setCenterY(myCircle.getCenterY() + 10);
    }

    public void left(ActionEvent e) {
        myCircle.setCenterX(myCircle.getCenterX() - 10);
    }

    public void right(ActionEvent e) {
        myCircle.setCenterX(myCircle.getCenterX() + 10);
    }
}
