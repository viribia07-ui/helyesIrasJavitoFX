module com.example.helyesirasjavitoai {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.helyesirasjavitoai to javafx.fxml;
    exports com.example.helyesirasjavitoai;
}