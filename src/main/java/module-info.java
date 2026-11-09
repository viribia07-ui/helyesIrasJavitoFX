module com.example.helyesirasjavitoai {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.fasterxml.jackson.core;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;

    opens com.example.helyesirasjavitoai to javafx.fxml;
    exports com.example.helyesirasjavitoai;
}