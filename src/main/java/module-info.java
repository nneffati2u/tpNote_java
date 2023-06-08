module com.example.tpnote_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.tpnote_java to javafx.fxml;
    exports com.example.tpnote_java;
}