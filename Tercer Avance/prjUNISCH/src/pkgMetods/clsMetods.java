/**
 *
 */
package pkgMetods;

import java.util.ArrayList;

import pkgClasses.*;

/**
 * @author StvRjs.K12
 */
public class clsMetods {

    /**
     * @uml.property name="lstSemester"
     * @uml.associationEnd multiplicity="(0 -1)" ordering="true"
     * inverse="clsMetods:pkgClasses.clsSemester"
     * @uml.association name="contains"
     */
    private ArrayList<clsSemester> lstSemester = new ArrayList<>();

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
     * inverse="clsMetods:pkgClasses.clsClassroom"
     * @uml.association name="contains"
     */
    private ArrayList<clsClassroom> lstClassroom = new ArrayList<>();

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
     * inverse="clsMetods:pkgClases.clsFaculty"
     * @uml.association name="contains"
     */
    private ArrayList<clsFaculty> lstFaculty = new ArrayList<>();

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
     * inverse="clsMetods:pkgClases.clsUser"
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
     * clsMetods class constructor
     */
    public clsMetods() {
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
    
    public void insertTeacher(String pid, String pName, String pPassword) {
        clsTeacher tempTeacher = new clsTeacher(pid, pName, pPassword);
        lstUsers.add(tempTeacher);
    }
    
    public void insertFacultyTeacher(String pFaculty, String pID) {
        for (clsFaculty tempFaculty : lstFaculty)
            if(tempFaculty.getFacultyName().equals(pFaculty))
                for (clsUser tempUser : lstUsers)
                    if (tempUser.getClass() == clsTeacher.class) {
                        clsTeacher tempTeacher = (clsTeacher) tempUser;
                        if(tempTeacher.getID().equals(pID)) {
                            ArrayList<clsTeacher> tempLstTeacher = tempFaculty.getLstTeacher();
                            tempLstTeacher.add(tempTeacher);
                            break;
                        }
                    }
    }
    
    public void insertSubjects(String pFaculty, ArrayList<clsSubject> pLstSubject) {
        for (clsFaculty tempFaculty : lstFaculty)
            if(tempFaculty.getFacultyName().equals(pFaculty)) {
                tempFaculty.setLstSubject(pLstSubject);
                break;
            }
    }
    
    public void insertScheduleSubject(String pSubjectName, String pDay, String pStartSchedule, String pEndSchedule) {
        for (clsFaculty tempFaculty : lstFaculty)
            for (clsSubject tempSubject : tempFaculty.getLstSubject())
                if(tempSubject.getSubjectName().equals(pSubjectName)) {
                    tempSubject.setSchedule(new clsSchedule(pDay, pStartSchedule, pEndSchedule));
                    break;
                }
    }
    
    public void insertScheduleTeacher(String pID, ArrayList<clsSchedule> pSchedule) {
        for (clsUser tempUser : lstUsers)
            if (tempUser.getClass() == clsTeacher.class) {
                clsTeacher tempTeacher = (clsTeacher) tempUser;
                if(tempTeacher.getID().equals(pID)) {
                    tempTeacher.setLstSchedule(pSchedule);
                    break;
                }
            }
    }
    
    public void insertSemesterSubject(String pSemesterNumber, String pSemesterYear, String pSubjectName) {
        for (clsSemester tempSemester : lstSemester)
            if(tempSemester.getSemesterYear().equals(pSemesterYear) && tempSemester.getSemesterNumber().equals(pSemesterNumber))
                for (clsFaculty tempFaculty : lstFaculty)
                    for (clsSubject tempSubject : tempFaculty.getLstSubject())
                        if(tempSubject.getSubjectName().equals(pSubjectName)) {
                            ArrayList<clsSubject> tempLstSubject = tempSemester.getLstSubject();
                            tempLstSubject.add(tempSubject);
                            break;
                        }
    }
    
    public void insertSubjectClassroom(String pSemesterNumber, String pSemesterYear, String pSubjectName, String pClassroomName) {
        for (clsSemester tempSemester : lstSemester)
            if(tempSemester.getSemesterYear().equals(pSemesterYear) && tempSemester.getSemesterNumber().equals(pSemesterNumber))
                for (clsFaculty tempFaculty : lstFaculty)
                    for (clsSubject tempSubject : tempFaculty.getLstSubject())
                        if(tempSubject.getSubjectName().equals(pSubjectName))
                            for (clsClassroom tempClassroom : lstClassroom)
                                if(tempClassroom.getClassroomName().equals(pClassroomName)) {
                                    tempSubject.setClsClassroom(tempClassroom);
                                    break;
                                }
    }
    
    public boolean insertTeacherSubject(String pID, String pSubjectName) {
        nofind:
        for (clsFaculty tempFaculty : lstFaculty) {
            ArrayList<clsTeacher> tempLstTeacher = tempFaculty.getLstTeacher();
            for (clsTeacher tempTeacher : tempLstTeacher)
                if (tempTeacher.getID().equals(pID)) {
                    ArrayList<clsSubject> tempLstSubject = tempFaculty.getLstSubject();
                    for (clsSubject tempSubject : tempLstSubject)
                        if (tempSubject.getSubjectName().equals(pSubjectName)) {
                            ArrayList<clsSubject> tempTeacherLstSubject = tempTeacher.getLstSubject();
                            tempTeacherLstSubject.add(tempSubject);
                            return true;
                        }
                    break nofind;
                }
        }
        return false;
    }
}