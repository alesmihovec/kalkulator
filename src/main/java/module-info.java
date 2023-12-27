module com.alesmihovec.kalkulator {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.alesmihovec.kalkulator to javafx.fxml;
    exports com.alesmihovec.kalkulator;
}