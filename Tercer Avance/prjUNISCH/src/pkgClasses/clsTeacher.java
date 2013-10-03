/**
 * Classes Package
 */
package pkgClasses;

import java.util.ArrayList;

/**
 * @author Steven Rojas <stvrjs.k12@gmail.com>
 * @version 1.0 (current version number of program)
 * @since 2013-09-21 (the version of the package this class was first added to)
 */
public class clsTeacher extends clsUser {

    /**
     * Teacher's schedule
     *
     * @uml.property name="Schedule"
     */
    private String schedule;

    /**
     * Getter of the property <tt>Schedule</tt>
     *
     * @return Returns the schedule.
     * @uml.property name="Schedule"
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Setter of the property <tt>Schedule</tt>
     *
     * @param Schedule The schedule to set.
     * @uml.property name="Schedule"
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    /**
     * @uml.property name="lstSemester"
     * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
     * inverse="clsTeacher:java.util.ArrayList"
     * @uml.association name="works_by"
     */
    private ArrayList<clsSemester> lstSemester;

    /**
     * Getter of the property <tt>lstSemester</tt>
     *
     * @return Returns the lstSemester.
     * @uml.property name="lstSemester"
     */
    public ArrayList<clsSemester> getLstSemester() {
        return lstSemester;
    }

    /**
     * Setter of the property <tt>lstSemester</tt>
     *
     * @param lstSemester the lstSemester to set.
     * @uml.property name="lstSemester"
     */
    public void setLstSemester(ArrayList<clsSemester> lstSemester) {
        this.lstSemester = lstSemester;
    }

    /**
     * Teacher class constructor
     *
     * @param pID
     * @param pName
     * @param pPassword
     * @param pSchedule
     */
    public clsTeacher(String pID, String pName, String pPassword, String pSchedule) {
        super(pID, pName, pPassword);
        schedule = pSchedule;
    }
}
