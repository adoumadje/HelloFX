module com.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellofx to javafx.fxml;
    opens com.example.hellofx.css_styling to javafx.fxml;
    exports com.example.hellofx;
    exports com.example.hellofx.css_styling;
}