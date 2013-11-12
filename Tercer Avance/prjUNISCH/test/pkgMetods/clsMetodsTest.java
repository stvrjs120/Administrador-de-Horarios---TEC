/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgMetods;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkgClasses.clsClassroom;
import pkgClasses.clsEquipment;
import pkgClasses.clsFaculty;
import pkgClasses.clsSchedule;
import pkgClasses.clsSemester;
import pkgClasses.clsSubject;
import pkgClasses.clsTeacher;
import pkgClasses.clsUser;

/**
 *
 * @author StvRjs.K12
 */
public class clsMetodsTest {
    
    public clsMetodsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLstSemester method, of class clsMetods.
     */
    @Test
    public void testGetLstSemester() {
        System.out.println("getLstSemester");
        clsMetods instance = new clsMetods();
        ArrayList expResult = null;
        ArrayList result = instance.getLstSemester();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstSemester method, of class clsMetods.
     */
    @Test
    public void testSetLstSemester() {
        System.out.println("setLstSemester");
        ArrayList<clsSemester> lstSemester = null;
        clsMetods instance = new clsMetods();
        instance.setLstSemester(lstSemester);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLstClassroom method, of class clsMetods.
     */
    @Test
    public void testGetLstClassroom() {
        System.out.println("getLstClassroom");
        clsMetods instance = new clsMetods();
        ArrayList expResult = null;
        ArrayList result = instance.getLstClassroom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstClassroom method, of class clsMetods.
     */
    @Test
    public void testSetLstClassroom() {
        System.out.println("setLstClassroom");
        ArrayList<clsClassroom> lstClassroom = null;
        clsMetods instance = new clsMetods();
        instance.setLstClassroom(lstClassroom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLstFaculty method, of class clsMetods.
     */
    @Test
    public void testGetLstFaculty() {
        System.out.println("getLstFaculty");
        clsMetods instance = new clsMetods();
        ArrayList expResult = null;
        ArrayList result = instance.getLstFaculty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstFaculty method, of class clsMetods.
     */
    @Test
    public void testSetLstFaculty() {
        System.out.println("setLstFaculty");
        ArrayList<clsFaculty> lstFaculty = null;
        clsMetods instance = new clsMetods();
        instance.setLstFaculty(lstFaculty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLstUsers method, of class clsMetods.
     */
    @Test
    public void testGetLstUsers() {
        System.out.println("getLstUsers");
        clsMetods instance = new clsMetods();
        ArrayList expResult = null;
        ArrayList result = instance.getLstUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstUsers method, of class clsMetods.
     */
    @Test
    public void testSetLstUsers() {
        System.out.println("setLstUsers");
        ArrayList<clsUser> lstUsers = null;
        clsMetods instance = new clsMetods();
        instance.setLstUsers(lstUsers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertSemester method, of class clsMetods.
     */
    @Test
    public void testInsertSemester() {
        System.out.println("insertSemester");
        String pSemesterNumber = "";
        String pSemesterYear = "";
        clsMetods instance = new clsMetods();
        instance.insertSemester(pSemesterNumber, pSemesterYear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertClassroom method, of class clsMetods.
     */
    @Test
    public void testInsertClassroom_6args() {
        System.out.println("insertClassroom");
        String pClassroomName = "";
        int pClassroomNumber = 0;
        String pLocation = "";
        int pCapacity = 0;
        boolean pAirConditioner = false;
        boolean pMultimedia = false;
        clsMetods instance = new clsMetods();
        instance.insertClassroom(pClassroomName, pClassroomNumber, pLocation, pCapacity, pAirConditioner, pMultimedia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertClassroom method, of class clsMetods.
     */
    @Test
    public void testInsertClassroom_5args() {
        System.out.println("insertClassroom");
        int pCapacity = 0;
        String pClassroomName = "";
        int pClassroomNumber = 0;
        String pLocation = "";
        ArrayList<clsEquipment> pEquipment = null;
        clsMetods instance = new clsMetods();
        instance.insertClassroom(pCapacity, pClassroomName, pClassroomNumber, pLocation, pEquipment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertFaculty method, of class clsMetods.
     */
    @Test
    public void testInsertFaculty() {
        System.out.println("insertFaculty");
        String pFacultyName = "";
        clsMetods instance = new clsMetods();
        instance.insertFaculty(pFacultyName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertStudent method, of class clsMetods.
     */
    @Test
    public void testInsertStudent() {
        System.out.println("insertStudent");
        String pid = "";
        String pName = "";
        String pPassword = "";
        clsMetods instance = new clsMetods();
        instance.insertStudent(pid, pName, pPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertCoordinator method, of class clsMetods.
     */
    @Test
    public void testInsertCoordinator() {
        System.out.println("insertCoordinator");
        String pid = "";
        String pName = "";
        String pPassword = "";
        clsMetods instance = new clsMetods();
        instance.insertCoordinator(pid, pName, pPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTeacher method, of class clsMetods.
     */
    @Test
    public void testInsertTeacher() {
        System.out.println("insertTeacher");
        String pid = "";
        String pName = "";
        String pPassword = "";
        clsMetods instance = new clsMetods();
        instance.insertTeacher(pid, pName, pPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertFacultyTeacher method, of class clsMetods.
     */
    @Test
    public void testInsertFacultyTeacher() {
        System.out.println("insertFacultyTeacher");
        String pFaculty = "";
        String pID = "";
        clsMetods instance = new clsMetods();
        instance.insertFacultyTeacher(pFaculty, pID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertSubjects method, of class clsMetods.
     */
    @Test
    public void testInsertSubjects() {
        System.out.println("insertSubjects");
        String pFaculty = "";
        ArrayList<clsSubject> pLstSubject = null;
        clsMetods instance = new clsMetods();
        instance.insertSubjects(pFaculty, pLstSubject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertScheduleTeacher method, of class clsMetods.
     */
    @Test
    public void testInsertScheduleTeacher() {
        System.out.println("insertScheduleTeacher");
        String pID = "";
        ArrayList<clsSchedule> pSchedule = null;
        clsMetods instance = new clsMetods();
        instance.insertScheduleTeacher(pID, pSchedule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertSemesterSubject method, of class clsMetods.
     */
    @Test
    public void testInsertSemesterSubject() {
        System.out.println("insertSemesterSubject");
        String pSemesterNumber = "";
        String pSemesterYear = "";
        String pSubjectName = "";
        clsMetods instance = new clsMetods();
        instance.insertSemesterSubject(pSemesterNumber, pSemesterYear, pSubjectName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertSubjectClassroom method, of class clsMetods.
     */
    @Test
    public void testInsertSubjectClassroom() {
        System.out.println("insertSubjectClassroom");
        String pSemesterNumber = "";
        String pSemesterYear = "";
        String pSubjectName = "";
        String pClassroomName = "";
        clsMetods instance = new clsMetods();
        instance.insertSubjectClassroom(pSemesterNumber, pSemesterYear, pSubjectName, pClassroomName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTeacherSubject method, of class clsMetods.
     */
    @Test
    public void testInsertTeacherSubject() {
        System.out.println("insertTeacherSubject");
        String pID = "";
        String pSubjectName = "";
        clsMetods instance = new clsMetods();
        boolean expResult = false;
        boolean result = instance.insertTeacherSubject(pID, pSubjectName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertSubjectSchedule method, of class clsMetods.
     */
    @Test
    public void testInsertSubjectSchedule() throws Exception {
        System.out.println("insertSubjectSchedule");
        String pSemesterNumber = "";
        String pSemesterYear = "";
        String pSubjectName = "";
        clsSchedule pSchedule = null;
        clsMetods instance = new clsMetods();
        instance.insertSubjectSchedule(pSemesterNumber, pSemesterYear, pSubjectName, pSchedule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluateScheduleTeacher method, of class clsMetods.
     */
    @Test
    public void testEvaluateScheduleTeacher() {
        System.out.println("evaluateScheduleTeacher");
        clsTeacher pTeacher = null;
        clsSchedule pSchedule = null;
        clsMetods instance = new clsMetods();
        boolean expResult = false;
        boolean result = instance.evaluateScheduleTeacher(pTeacher, pSchedule);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluateSubjectSemester method, of class clsMetods.
     */
    @Test
    public void testEvaluateSubjectSemester() {
        System.out.println("evaluateSubjectSemester");
        String pSemesterNumber = "";
        String pSemesterYear = "";
        String pSubjectName = "";
        clsMetods instance = new clsMetods();
        boolean expResult = false;
        boolean result = instance.evaluateSubjectSemester(pSemesterNumber, pSemesterYear, pSubjectName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class clsMetods.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String pID = "";
        String pPassword = "";
        clsMetods instance = new clsMetods();
        clsUser expResult = null;
        clsUser result = instance.login(pID, pPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadSubjects method, of class clsMetods.
     */
    @Test
    public void testLoadSubjects() {
        System.out.println("loadSubjects");
        String pSemester = "";
        clsMetods instance = new clsMetods();
        String expResult = "";
        String result = instance.loadSubjects(pSemester);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadSubjectsTeacher method, of class clsMetods.
     */
    @Test
    public void testLoadSubjectsTeacher() {
        System.out.println("loadSubjectsTeacher");
        clsTeacher pTeacher = null;
        String pSemester = "";
        clsMetods instance = new clsMetods();
        String expResult = "";
        String result = instance.loadSubjectsTeacher(pTeacher, pSemester);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadClassroomSchedule method, of class clsMetods.
     */
    @Test
    public void testLoadClassroomSchedule() {
        System.out.println("loadClassroomSchedule");
        String pClassroomName = "";
        clsMetods instance = new clsMetods();
        String expResult = "";
        String result = instance.loadClassroomSchedule(pClassroomName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}