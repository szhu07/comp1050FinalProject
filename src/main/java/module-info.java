module com.example.finalprojectrockpaperscissior {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalprojectrockpaperscissior to javafx.fxml;
    exports com.example.finalprojectrockpaperscissior;
}