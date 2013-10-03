/**
 *
 */
package pkgMetodes;

import java.util.ArrayList;

import pkgClasses.*;

/**
 * @author StvRjs.K12
 */
public class clsMetodes {

    /**
     * @uml.property name="lstSemester"
     * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
     * inverse="clsMetodes:pkgClasses.clsSemester"
     * @uml.association name="contains"
     */
    private ArrayList<clsSemester> lstSemester;

    /**
     * Getter of the property <tt>lstSemester</tt>
     *
     * @return Returns the clsSemester.
     * @uml.property name="lstSemester"
     */
    public ArrayList<clsSemester> getLstSemester() {
        return lstSemester;
    }

    /**
     * Setter of the property <tt>lstSemester</tt>
     *
     * @param lstSemester the clsSemester to set.
     * @uml.property name="lstSemester"
     */
    public void setLstSemester(ArrayList<clsSemester> lstSemester) {
        this.lstSemester = lstSemester;
    }
    /**
     * @uml.property name="lstClassroom"
     * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
     * inverse="clsMetodes:pkgClasses.clsClassroom"
     * @uml.association name="contains"
     */
    private ArrayList<clsClassroom> lstClassroom;

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of element to return.
     * @return the element at the specified position in this list.
     * @see java.util.List#get(int)
     * @uml.property name="lstClassroom"
     */
    public ArrayList<clsClassroom> getLstClassroom() {
        return lstClassroom;
    }

    /**
     * Setter of the property <tt>lstClassroom</tt>
     *
     * @param lstClassroom the lstClassroom to set.
     * @uml.property name="lstClassroom"
     */
    public void setLstClassroom(ArrayList<clsClassroom> lstClassroom) {
        this.lstClassroom = lstClassroom;
    }
    /**
     * @uml.property name="lstFaculty"
     * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
     * inverse="clsMetodes:pkgClases.clsFaculty"
     * @uml.association name="contains"
     */
    private ArrayList<clsFaculty> lstFaculty;

    /**
     * Getter of the property <tt>lstFaculty</tt>
     *
     * @return Returns the lstFaculty.
     * @uml.property name="lstFaculty"
     */
    public ArrayList<clsFaculty> getLstFaculty() {
        return lstFaculty;
    }

    /**
     * Setter of the property <tt>lstFaculty</tt>
     *
     * @param lstFaculty the lstFaculty to set.
     * @uml.property name="lstFaculty"
     */
    public void setLstFaculty(ArrayList<clsFaculty> lstFaculty) {
        this.lstFaculty = lstFaculty;
    }

    /**
     *
     * @param pSemesterNumber
     */
    public void insertSemester(int pSemesterNumber) {
        clsSemester tempSemester = new clsSemester(pSemesterNumber);
        lstSemester.add(tempSemester);
    }

    /**
     *
     * @param pCapacity
     * @param classroomName
     * @param pClassroomNumber
     * @param location
     */
    public void insertClassroom(String pClassroomType, int pCapacity, String classroomName, int pClassroomNumber, String location) {
        
    }

    /**
     *
     * @param pFacultyName
     */
    public void insertFaculty(String pFacultyName) {
    }
}
