module com.collinkite.usereditor.usereditor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.collinkite.usereditor.usereditor to javafx.fxml;
    exports com.collinkite.usereditor.usereditor;
}