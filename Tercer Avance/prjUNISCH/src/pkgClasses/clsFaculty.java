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
public class clsFaculty {

    /**
     * Faculty's name
     *
     * @uml.property name="FacultyName"
     */
    private String facultyName;

    /**
     * Getter of the property <tt>FacultyName</tt>
     *
     * @return Returns the facultyName.
     * @uml.property name="FacultyName"
     */
    public String getFacultyName() {
        return facultyName;
    }

    /**
     * Setter of the property <tt>FacultyName</tt>
     *
     * @param FacultyName The facultyName to set.
     * @uml.property name="FacultyName"
     */
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    /**
     * Faculty subject's list
     *
     * @uml.property name="lstSubject"
     * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
     * inverse="Faculty:pkgClases.clsSubject"
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
     * Faculty teacher's list
     *
     * @uml.property name="lstTeacher"
     * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
     * inverse="clsFaculty:pkgClases.clsTeacher"
     * @uml.association name="contains"
     */
    private ArrayList<clsTeacher> lstTeacher;

    /**
     * Getter of the property <tt>lstTeacher</tt>
     *
     * @return Returns the lstTeacher.
     * @uml.property name="lstTeacher"
     */
    public ArrayList<clsTeacher> getLstTeacher() {
        return lstTeacher;
    }

    /**
     * Setter of the property <tt>lstTeacher</tt>
     *
     * @param lstTeacher the lstTeacher to set.
     * @uml.property name="lstTeacher"
     */
    public void setLstTeacher(ArrayList<clsTeacher> lstTeacher) {
        this.lstTeacher = lstTeacher;
    }

    /**
     * Faculty class constructor
     *
     * @param pFacultyName
     */
    public clsFaculty(String pFacultyName) {
        facultyName = pFacultyName;
    }
    
    public void insertSubject(int pCredits, String pSubjectName) {
        
    }
}
