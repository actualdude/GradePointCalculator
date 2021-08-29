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
public class AssignPoints {

    /**
     * Assigns a grade point to every letter (grade) 
     * for DEPARTMENTAL MODULES
     * @param grade
     * @return
     */
    public static double DepartmentalGradePoints(String grade) {

        if (grade.isEmpty()) {
            throw new NullPointerException("Enter Your Grade");
        }

        switch (grade) {
            case "A":
                return 15.0;
            case "A+":
                return 15.0;
            case "A-":
                return 14.1;
            case "B+":
                return 12.9;
            case "B":
                return 12.0;
            case "B-":
                return 11.1;
            case "C+":
                return 9.9;
            case "C":
                return 9.0;
            case "C-":
                return 8.1;
            case "D":
                return 7.0;
            case "E":
                return 0;
            case "F":
                return 0;
            default:
                break;
        }
        return 0;
    }

    /**
     * Assigns a grade point to every letter (grade) 
     * for FOUNDATIONAL MODULES
     * @param grade
     * @return
     */
    public static double FoundationalGradePoints(String grade) {

        if (grade.isEmpty()) {
            throw new NullPointerException("Enter Your Grade");
        }

        switch (grade) {
            case "A":
                return 10.0;
            case "A+":
                return 10.0;
            case "A-":
                return 9.4;
            case "B+":
                return 8.6;
            case "B":
                return 8.0;
            case "B-":
                return 7.4;
            case "C+":
                return 6.6;
            case "C":
                return 6.0;
            case "C-":
                return 5.4;
            case "D":
                return 4.0;
            case "E":
                return 0;
            case "F":
                return 0;
            default:
                break;
        }
        return 0;
    }

}
