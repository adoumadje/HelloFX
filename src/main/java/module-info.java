module com.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellofx to javafx.fxml;
    opens com.example.hellofx.css_styling to javafx.fxml;
    exports com.example.hellofx;
    exports com.example.hellofx.css_styling;

    opens com.example.switch_scene to javafx.fxml;
    exports com.example.switch_scene;

    opens com.example.data_btw_controller to javafx.fxml;
    exports com.example.data_btw_controller;

    opens com.example.logout to javafx.fxml;
    exports com.example.logout;

    opens com.example.image_view to javafx.fxml;
    exports com.example.image_view;
}