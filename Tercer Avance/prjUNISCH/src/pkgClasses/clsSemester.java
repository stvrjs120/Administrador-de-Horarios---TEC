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
public class clsSemester {

    /**
     * Semester's number
     *
     * @uml.property name="SemesterNumber"
     */
    private int semesterNumber;

    /**
     * Getter of the property <tt>SemesterNumber</tt>
     *
     * @return Returns the semesterNumber.
     * @uml.property name="SemesterNumber"
     */
    public int getSemesterNumber() {
        return semesterNumber;
    }

    /**
     * Setter of the property <tt>SemesterNumber</tt>
     *
     * @param SemesterNumber The semesterNumber to set.
     * @uml.property name="SemesterNumber"
     */
    public void setSemesterNumber(int semesterNumber) {
        this.semesterNumber = semesterNumber;
    }
    /**
     * @uml.property name="lstSubject"
     * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
     * inverse="clsSemester:pkgClases.clsSubject"
     * @uml.association name="contains"
     */
    private ArrayList<clsSubject> lstSubject;

    /**
     * Getter of the property <tt>lstSubject</tt>
     *
     * @return Returns the lstSubject.
     * @uml.property name="lstSubject"
     */
    public ArrayList<clsSubject> getLstSubject() {
        return lstSubject;
    }

    /**
     * Setter of the property <tt>lstSubject</tt>
     *
     * @param lstSubject the lstSubject to set.
     * @uml.property name="lstSubject"
     */
    public void setLstSubject(ArrayList<clsSubject> lstSubject) {
        this.lstSubject = lstSubject;
    }

    /**
     * Semester class constructor
     *
     * @param pSemesterNumber
     */
    public clsSemester(int pSemesterNumber) {
        semesterNumber = pSemesterNumber;
    }
}
