package com.mycompany.gradepointcalculator;

import Content.AssignPoints;
import Content.CalculateGradePoint;
import Content.GradePointTable;
import Utilities.MessageBox;
import Utilities.ModuleType;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author emers
 */
public class SecondaryController implements Initializable {

    @FXML
    private TextField moduleTextField;
    @FXML
    private TextField gradeTextField;
    @FXML
    private TextField creditHoursTextField;
    @FXML
    private ComboBox<Enum> modCategoryComboBox;
    @FXML
    private Button enterButton;
    @FXML
    private Button backButton;
    @FXML
    private TableView<GradePointTable> tableView;
    @FXML
    private TableColumn<GradePointTable, String> moduleColumn;
    @FXML
    private TableColumn<GradePointTable, String> categColumn;
    @FXML
    private TableColumn<GradePointTable, String> gradeColumn;
    @FXML
    private TableColumn<GradePointTable, Number> pointsColumn;
    @FXML
    private TableColumn<GradePointTable, Number> hoursColumn;
    @FXML
    private Button gpaButton;

    private final ObservableList<GradePointTable> tableList = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        modCategoryComboBox.setItems(FXCollections.observableArrayList(ModuleType.values()));
        modCategoryComboBox.getSelectionModel().selectFirst();

        moduleColumn.setCellValueFactory(data -> data.getValue().getModule());
        categColumn.setCellValueFactory(data -> data.getValue().getCategory());
        hoursColumn.setCellValueFactory(data -> data.getValue().getHours());
        gradeColumn.setCellValueFactory(data -> data.getValue().getGrade());
        pointsColumn.setCellValueFactory(data -> data.getValue().getPoints());

        tableView.setItems(tableList);
    }

    @FXML
    private void methodEnterVariables(ActionEvent event) {

        try {
            String module = moduleTextField.getText();
            String category = String.valueOf(modCategoryComboBox.getSelectionModel().getSelectedItem());
            String grades = gradeTextField.getText();
            Double hours = Double.parseDouble(creditHoursTextField.getText());
            Double points;

            if (category.equals(String.valueOf(ModuleType.DEPARTMENTAL))) {
                points = AssignPoints.DepartmentalGradePoints(grades);
            } else {
                points = AssignPoints.FoundationalGradePoints(grades);
            }

            tableList.addAll(new GradePointTable(module, category, grades, points, hours));
            moduleTextField.clear();
            gradeTextField.clear();
            creditHoursTextField.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void methodGoBack(ActionEvent event) {
        try {
            App.setRoot("primary");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void methodGPAButton(ActionEvent event) {

        Double totalPoints = 0.0;
        Double totalHours = 0.0;

        try {
            for (GradePointTable tb : tableView.getItems()) {
                totalHours += tb.getHours().doubleValue();
                totalPoints += tb.getPoints().doubleValue();
            }
            MessageBox.ShowMessage(CalculateGradePoint.CalculateAverageGradePoint(totalHours, totalPoints));
        } catch (Exception e) {
        }
    }

}
