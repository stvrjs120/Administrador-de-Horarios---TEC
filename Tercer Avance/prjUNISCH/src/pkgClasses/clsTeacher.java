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

    private ArrayList<clsSchedule> lstSchedule;

    /**
     * Getter of the property <tt>clsSchedule</tt>
     *
     * @return Returns the clsSchedule.
     * @uml.property name="clsSchedule"
     */
    public ArrayList<clsSchedule> getLstSchedule() {
        return lstSchedule;
    }

    /**
     * Setter of the property <tt>clsSchedule</tt>
     *
     * @param clsSchedule the clsSchedule to set.
     * @uml.property name="clsSchedule"
     */
    public void setLstSchedule(ArrayList<clsSchedule> lstSchedule) {
        this.lstSchedule = lstSchedule;
    }
    
    /**
     * @uml.property name="lstSemester"
     * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
     * inverse="clsTeacher:pkgClases.clsSubject"
     * @uml.association name="teaches"
     */
    private ArrayList<clsSubject> lstSubject;

    /**
     * Getter of the property <tt>lstSemester</tt>
     *
     * @return Returns the lstSemester.
     * @uml.property name="lstSemester"
     */
    public ArrayList<clsSubject> getLstSubject() {
        return lstSubject;
    }

    /**
     * Setter of the property <tt>lstSemester</tt>
     *
     * @param lstSubject the lstSemester to set.
     * @uml.property name="lstSemester"
     */
    public void setLstSubject(ArrayList<clsSubject> lstSubject) {
        this.lstSubject = lstSubject;
    }
    
    /**
     * Teacher class constructor
     *
     * @param pID
     * @param pName
     * @param pPassword
     * @param pSchedule
     */
    public clsTeacher(String pID, String pName, String pPassword) {
        super(pID, pName, pPassword);
        lstSubject = new ArrayList<>();
    }
}
