/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import javafx.scene.control.Alert;

/**
 *
 * @author emers
 */
public class MessageBox {

    /**
     * Information Alert that displays 
     * the grade point for the given input
     * @param gradePoint
     */
    public static void ShowMessage(Double gradePoint) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("AVERAGE GRADE POINT");
        alert.setContentText("YOUR AVERAGEE GRADE POINT IS: " + gradePoint);
        
        alert.showAndWait();
    }

}
