/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Content;

/**
 *
 * @author emers
 */
public class CalculateGradePoint {

    /**
     * Calculates the Average Grade Point for
     * the given number of CREDIT HOURS and POINTS
     * @param totalCreditHours
     * @param totalNumberOfPoints
     * @return
     */
    public static Double CalculateAverageGradePoint(Double totalCreditHours, Double totalNumberOfPoints) {
        double average = 0;
        try {
            average = totalNumberOfPoints / totalCreditHours;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return average;
    }

}
