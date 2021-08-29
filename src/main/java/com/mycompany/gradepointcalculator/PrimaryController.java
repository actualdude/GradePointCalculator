package com.mycompany.gradepointcalculator;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button switchToNextPage;

    @FXML
    private void MethodSwitchToNextPage(ActionEvent event) {
        try {
            App.setRoot("secondary");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
