/**
 *
 */
package pkgMetods;

import java.util.ArrayList;

import pkgClasses.*;
import pkgExceptions.ExceptionSchedule;

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
    
    /**
     * Function to insert students into the user's list
     * @param pid student's id
     * @param pName student's name
     * @param pPassword student's password
     */
    public void insertStudent(String pid, String pName, String pPassword) {
        clsStudent tempStudent = new clsStudent(pid, pName, pPassword);
        lstUsers.add(tempStudent);
    }
    
    /**
     * Function to insert coordinators into the user's list
     * @param pid coordinator's id
     * @param pName coordinator's name
     * @param pPassword coordinator's password
     */
    public void insertCoordinator(String pid, String pName, String pPassword) {
        clsCoordinator tempCoordinator = new clsCoordinator(pid, pName, pPassword);
        lstUsers.add(tempCoordinator);
    }
    
    /**
     * Function to insert teachers into the user's list
     * @param pid teacher's id
     * @param pName teacher's name
     * @param pPassword teacher's password
     */
    public void insertTeacher(String pid, String pName, String pPassword) {
        clsTeacher tempTeacher = new clsTeacher(pid, pName, pPassword);
        lstUsers.add(tempTeacher);
    }
    
    /**
     * Function to insert faculties into the faculty's list
     * @param pFaculty faculty's name
     * @param pID teacher's id
     */
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
    
    /**
     * Function to set the subject's list contained the faculty's list
     * @param pFaculty faculty's name
     * @param pLstSubject subject's list to set
     */
    public void insertSubjects(String pFaculty, ArrayList<clsSubject> pLstSubject) {
        for (clsFaculty tempFaculty : lstFaculty)
            if(tempFaculty.getFacultyName().equals(pFaculty)) {
                tempFaculty.setLstSubject(pLstSubject);
                break;
            }
    }
    
    /**
     * Function to set the teacher's schedule
     * @param pID teacher's id
     * @param pSchedule schedule to set
     */
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
    
    /**
     * Function to add subject into the subject's list contained in each semester
     * @param pSemesterNumber semester's number
     * @param pSemesterYear semester's year
     * @param pSubjectName subject name
     */
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
    
    /**
     * Function to set the classroom to the subjects in a particular semester
     * @param pSemesterNumber semester's number
     * @param pSemesterYear semester's year
     * @param pSubjectName subject's name
     * @param pClassroomName classroom's name
     */
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
    
    /**
     * Function to add subjects to a particular teacher
     * @param pID teacher's id
     * @param pSubjectName subject's name
     * @return 
     */
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
    
    /**
//     * Function to first evaluate and then insert schedule for an specific subject in an specific semester
     * @param pSemesterNumber semester's number
     * @param pSemesterYear semester's year
     * @param pSubjectName subject's name
     * @param pSchedule schedule to set
     * @throws ExceptionSchedule 
     */
    public void insertSubjectSchedule(String pSemesterNumber, String pSemesterYear, String pSubjectName, clsSchedule pSchedule) throws ExceptionSchedule {
        if (pSchedule.getStarSchedule().compareTo(pSchedule.getEndSchedule()) == 0)
            throw new ExceptionSchedule("The Schedule you are triying to set has a wrong format.");
        
        rollback:
        for (clsFaculty tempFaculty : lstFaculty)
            for (clsTeacher tempTeacher : tempFaculty.getLstTeacher())
                for(clsSubject tempSubject : tempTeacher.getLstSubject())
                    if (tempSubject.getSubjectName().equals(pSubjectName)) {
                        if (evaluateSubjectSemester(pSemesterNumber, pSemesterYear, pSubjectName)) {    //evaluar si el curso perteneces al semestre acutal
                            if (evaluateScheduleTeacher(tempTeacher, pSchedule))
                                throw new ExceptionSchedule("The teacher's schedule has some conflicts with the schedule you are trying to set.");
                            break rollback;
                        }
                    }
        
        clsSubject actSubject = null;
        
        for (clsSemester tempSemester : lstSemester)
            if (tempSemester.getSemesterNumber().equals(pSemesterNumber) && tempSemester.getSemesterYear().equals(pSemesterYear))
                for(clsSubject tempSubject : tempSemester.getLstSubject()) {
                    if (tempSubject.getSubjectName().equals(pSubjectName))
                        actSubject = tempSubject;
                    if (tempSubject.getSchedule() != null) {
                        clsSchedule tempSchedule = tempSubject.getSchedule();
                        if (tempSchedule.getDay().equals(pSchedule.getDay()))
                            if((pSchedule.getStarSchedule().compareTo(tempSchedule.getStarSchedule()) > 0 && pSchedule.getStarSchedule().compareTo(tempSchedule.getEndSchedule()) < 0) || (pSchedule.getEndSchedule().compareTo(tempSchedule.getStarSchedule())>0 && pSchedule.getEndSchedule().compareTo(tempSchedule.getEndSchedule()) < 0) || (pSchedule.getStarSchedule().compareTo(tempSchedule.getStarSchedule()) == 0 && pSchedule.getEndSchedule().compareTo(tempSchedule.getEndSchedule()) == 0))
                                throw new ExceptionSchedule("The semester's schedule has some conflicts with the schedule you are trying to set.");
                    }
                }
        try {
            actSubject.setSchedule(pSchedule);
        } catch (NullPointerException ex) {
            throw new ExceptionSchedule("Couldn't find the Subject you are trying to modify!");
        }
    }
    
    /**
     * Function to evaluate if there any conflict with other subject's schedules assigned to a teacher
     * @param pTeacher object teacher
     * @param pSchedule schedule to evaluate
     * @return true if there's any conflict, false if there's not
     */
    public boolean evaluateScheduleTeacher(clsTeacher pTeacher, clsSchedule pSchedule) {
        for (clsSubject tempSubject : pTeacher.getLstSubject())
            if (tempSubject.getSchedule() != null) {
                clsSchedule tempSchedule = tempSubject.getSchedule();
                if (tempSchedule.getDay().equals(pSchedule.getDay()))
                    if((pSchedule.getStarSchedule().compareTo(tempSchedule.getStarSchedule()) > 0 && pSchedule.getStarSchedule().compareTo(tempSchedule.getEndSchedule()) < 0) || (pSchedule.getEndSchedule().compareTo(tempSchedule.getStarSchedule())>0 && pSchedule.getEndSchedule().compareTo(tempSchedule.getEndSchedule()) < 0) || (pSchedule.getStarSchedule().compareTo(tempSchedule.getStarSchedule()) == 0 && pSchedule.getEndSchedule().compareTo(tempSchedule.getEndSchedule()) == 0))
                        return true;
            }
        return false;
    }
    
    /**
     * Function to evaluate if the subject is assigned to an specific semester
     * @param pSemesterNumber semester's number
     * @param pSemesterYear semester's year
     * @param pSubjectName subject's name
     * @return true if is assigned, false is not
     */
    public boolean evaluateSubjectSemester(String pSemesterNumber, String pSemesterYear, String pSubjectName) {
        for (clsSemester tempSemester : lstSemester)
            if (tempSemester.getSemesterNumber().equals(pSemesterNumber) && tempSemester.getSemesterYear().equals(pSemesterYear))
                for(clsSubject tempSubject : tempSemester.getLstSubject())
                    if(tempSubject.getSubjectName().equals(pSubjectName))
                        return true;
        return false;
    }
    
    /**
     * Function to find an specific user
     * @param pID user's id
     * @param pPassword user's password
     * @return the user if it find him, null if not
     */
    public clsUser login(String pID, String pPassword) {
        for (clsUser tempUSer : lstUsers)
            if (tempUSer.getID().equals(pID) && tempUSer.getPassword().equals(pPassword))
                return tempUSer;
        return null;
    }
    
    /**
     * Function to load subjects of an specific semester
     * @param pSemester semester's number and year
     * @return an string with all the subjects of the semester
     */
    public String loadSubjects(String pSemester) {
        StringBuilder result = new StringBuilder();
        
        for (clsSemester tempSemester : lstSemester)
            if (pSemester.equals(tempSemester.getSemesterNumber() +" - "+tempSemester.getSemesterYear()))
                if (tempSemester.getLstSubject() != null)
                    for (clsSubject tempSubject : tempSemester.getLstSubject()) {
                        result.append(tempSubject.getSubjectName());
                        result.append(" - ");
                        result.append(tempSubject.getSchedule().getDay());
                        result.append(" -> ");
                        result.append(tempSubject.getSchedule().getStarSchedule());
                        result.append(" to ");
                        result.append(tempSubject.getSchedule().getEndSchedule());
                        result.append("\n");
                    }
        
        return result.toString();
    }
    
    /**
     * Function to load the subjects of an specific teacher
     * @param pTeacher object teacher
     * @param pSemester semester's number and year
     * @return an string with all the subject of the teacher
     */
    public String loadSubjectsTeacher(clsTeacher pTeacher, String pSemester) {
        StringBuilder result = new StringBuilder();
        String[] parts = pSemester.split(" ");
        String semesterNumber = parts[0];
        String semesterYear = parts[2];
        
        for (clsSubject tempSubject : pTeacher.getLstSubject())
            if (evaluateSubjectSemester(semesterNumber, semesterYear, tempSubject.getSubjectName())) {
                result.append(tempSubject.getSubjectName());
                result.append(" - ");
                result.append(tempSubject.getSchedule().getDay());
                result.append(" -> ");
                result.append(tempSubject.getSchedule().getStarSchedule());
                result.append(" to ");
                result.append(tempSubject.getSchedule().getEndSchedule());
                result.append("\n");
            }
        
        return result.toString();
    }
    
    /**
     * Function to load the schedules where the classroom will be occupied
     * @param pClassroomName classroom's name
     * @return an string with all the schedules of the classroom
     */
    public String loadClassroomSchedule(String pClassroomName) {
        StringBuilder result = new StringBuilder();
        boolean flag = true;
        
        for (clsSemester tempSemester : lstSemester)
            for (clsSubject tempSubject : tempSemester.getLstSubject()) {
                clsClassroom tempClassroom = tempSubject.getClsClassroom();
                if (tempClassroom.getClassroomName().equals(pClassroomName)) {
                    if(flag) {
                        result.append(tempSemester.getSemesterNumber()).append(" - ").append(tempSemester.getSemesterYear());
                        flag = !flag;
                    }
                    result.append("\n     ").append(tempSubject.getSchedule().getDay()).append(" -> ").append(tempSubject.getSchedule().getStarSchedule()).append(" tot ").append(tempSubject.getSchedule().getEndSchedule());
                }
            }
        
        return result.toString();
    }
}