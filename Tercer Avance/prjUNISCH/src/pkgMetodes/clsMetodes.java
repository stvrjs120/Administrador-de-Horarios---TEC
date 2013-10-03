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
    private static ArrayList<clsSemester> lstSemester = new ArrayList<>();

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
    private static ArrayList<clsClassroom> lstClassroom = new ArrayList<>();

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
    private static ArrayList<clsFaculty> lstFaculty = new ArrayList<>();

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
     * @uml.property name="lstUsers"
     * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
     * inverse="clsMetodes:pkgClases.clsUser"
     */
    private ArrayList<clsUser> lstUsers = new ArrayList<>();

    /**
     * Getter of the property <tt>lstUsers</tt>
     *
     * @return Returns the lstUsers.
     * @uml.property name="lstUsers"
     */
    public ArrayList<clsUser> getLstUsers() {
        return lstUsers;
    }

    /**
     * Setter of the property <tt>lstUsers</tt>
     *
     * @param lstUsers the lstUsers to set.
     * @uml.property name="lstUsers"
     */
    public void setLstUsers(ArrayList<clsUser> lstUsers) {
        this.lstUsers = lstUsers;
    }

    /**
     * clsMetodes class constructor
     */
    public clsMetodes() {
    }

    /**
     *
     * @param pSemesterNumber
     * @param pSemesterYear
     */
    public void insertSemester(String pSemesterNumber, String pSemesterYear) {
        clsSemester tempSemester = new clsSemester(pSemesterNumber, pSemesterYear);
        lstSemester.add(tempSemester);
    }

    /**
     *
     * @param pClassroomName
     * @param pClassroomNumber
     * @param pLocation
     * @param pCapacity
     * @param pAirConditioner
     * @param pMultimedia
     */
    public void insertClassroom(String pClassroomName, int pClassroomNumber, String pLocation, int pCapacity, boolean pAirConditioner, boolean pMultimedia) {
        clsTeoricalClassroom tempClassroom = new clsTeoricalClassroom(pClassroomName, pClassroomNumber, pLocation, pCapacity, pAirConditioner, pMultimedia);
        lstClassroom.add(tempClassroom);
    }

    /**
     *
     * @param pCapacity
     * @param pClassroomName
     * @param pClassroomNumber
     * @param pLocation
     */
    public void insertClassroom(int pCapacity, String pClassroomName, int pClassroomNumber, String pLocation, ArrayList<clsEquipment> pEquipment) {
        clsPracticalClassroom tempClassroom = new clsPracticalClassroom(pCapacity, pClassroomName, pClassroomNumber, pLocation);
        tempClassroom.setLstEquipment(pEquipment);
        lstClassroom.add(tempClassroom);
    }

    /**
     *
     * @param pFacultyName
     */
    public void insertFaculty(String pFacultyName) {
        clsFaculty tempFaculty = new clsFaculty(pFacultyName);
        lstFaculty.add(tempFaculty);
    }
    
    public void insertStudent(String pid, String pName, String pPassword) {
        clsStudent tempStudent = new clsStudent(pid, pName, pPassword);
        lstUsers.add(tempStudent);
    }
    
    public void insertCoordinator(String pid, String pName, String pPassword) {
        clsCoordinator tempCoordinator = new clsCoordinator(pid, pName, pPassword);
        lstUsers.add(tempCoordinator);
    }
    
    public void insertTeacher(String pid, String pName, String pPassword, String pSchedule) {
        clsTeacher tempTeacher = new clsTeacher(pid, pName, pPassword, pSchedule);
        lstUsers.add(tempTeacher);
    }
}
