package com.example.image_view;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private ImageView imageView;

    int count = 1;


    public void changeImage() {
        count++;
        Image image1 = new Image(getClass().getResourceAsStream("Iron_Man_(circa_2018).png"));
        Image image2 = new Image(getClass().getResourceAsStream("image_b97b56f3.jpeg"));
        imageView.setImage(count % 2 == 1 ? image1 : image2);
    }
}
