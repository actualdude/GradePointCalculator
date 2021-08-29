/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author emers
 */
public class GradePointTable {

    protected SimpleStringProperty module;
    protected SimpleStringProperty category;
    protected SimpleStringProperty grade;
    protected SimpleDoubleProperty points;
    protected SimpleDoubleProperty hours;

    /**
     * Constructor 
     * @param module
     * @param category
     * @param grade
     * @param hours
     * @param points
     */
    public GradePointTable(String module, String category, String grade, Double points, Double hours) {
        this.module = new SimpleStringProperty(module);
        this.category = new SimpleStringProperty(category);
        this.grade = new SimpleStringProperty(grade);
        this.points = new SimpleDoubleProperty(points);
        this.hours = new SimpleDoubleProperty(hours);
    }

    /**
     *
     * @return
     */
    public SimpleStringProperty getCategory() {
        return category;
    }

    /**
     *
     * @return
     */
    public SimpleStringProperty getGrade() {
        return grade;
    }

    /**
     *
     * @return
     */
    public SimpleDoubleProperty getHours() {
        return hours;
    }

    /**
     *
     * @return
     */
    public SimpleStringProperty getModule() {
        return module;
    }

    /**
     *
     * @return
     */
    public SimpleDoubleProperty getPoints() {
        return points;
    }

    /**
     *
     * @param category
     */
    public void setCategory(SimpleStringProperty category) {
        this.category = category;
    }

    /**
     *
     * @param grade
     */
    public void setGrade(SimpleStringProperty grade) {
        this.grade = grade;
    }

    /**
     *
     * @param hours
     */
    public void setHours(SimpleDoubleProperty hours) {
        this.hours = hours;
    }

    /**
     *
     * @param module
     */
    public void setModule(SimpleStringProperty module) {
        this.module = module;
    }

    /**
     *
     * @param points
     */
    public void setPoints(SimpleDoubleProperty points) {
        this.points = points;
    }

}
