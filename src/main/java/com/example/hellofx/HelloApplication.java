package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();

        Scene scene = new Scene(root, 420, 420, Color.SKYBLUE);

        String url1 = Objects.requireNonNull(getClass().getResource("logo.png")).toExternalForm();
        Image image = new Image(url1);

        Text text = new Text();
        text.setText("Hello, JavaFX!");
        text.setX(50);
        text.setY(50);
        text.setFill(Color.LIMEGREEN);
        text.setFont(Font.font("Verdana", 24));

        Line line = new Line();
        line.setStartX(30);
        line.setStartY(150);
        line.setEndX(370);
        line.setEndY(150);
        line.setStrokeWidth(3);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(30);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(80);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.ORANGE);
        rectangle.setStroke(Color.BLUE);
        rectangle.setStrokeWidth(3);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 200.0,
                300.0, 200.0,
                250.0, 100.0
        );
        triangle.setFill(Color.TURQUOISE);
        triangle.setStroke(Color.DARKVIOLET);

        Circle circle = new Circle();
        circle.setCenterX(300);
        circle.setCenterY(300);
        circle.setRadius(50);
        circle.setFill(Color.PINK);
        circle.setStroke(Color.PURPLE);
        circle.setStrokeWidth(3);

        String pizzaUrl = Objects.requireNonNull(getClass()
                .getResource("pizza-png-4.png"))
                .toExternalForm();
        Image pizza = new Image(pizzaUrl);
        ImageView imageView = new ImageView(pizza);
        imageView.setX(50);
        imageView.setY(210);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

        stage.setTitle("HelloFX");
        stage.setScene(scene);
        stage.getIcons().add(image);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}