module com.mycompany.gradepointcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.gradepointcalculator to javafx.fxml;
    exports com.mycompany.gradepointcalculator;
}
