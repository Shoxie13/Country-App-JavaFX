module com.countryapp {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens com.countryapp to javafx.fxml;

    exports com.countryapp;
}
