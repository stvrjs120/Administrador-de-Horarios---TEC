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
import pkgClasses.clsPracticalClassroom;
import pkgClasses.clsSchedule;
import pkgClasses.clsSemester;
import pkgClasses.clsStudent;
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
    
    @Test
    public void SetGetSemester() {
        System.out.println("Testing SetGet-Semester-clsMetods...");
        clsMetods instance = new clsMetods();
        clsSemester semester = new clsSemester("1", "2013");
        ArrayList<clsSemester> expResult = new ArrayList<>();
        expResult.add(semester);
        instance.setLstSemester(expResult);
        ArrayList<clsSemester> result = instance.getLstSemester();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetClassroom() {
        System.out.println("Testing SetGet-Classroom-clsMetods...");
        clsMetods instance = new clsMetods();
        clsClassroom classroom = new clsPracticalClassroom(40, "AU01", 1, "En algun lugar de un gran país.");
        ArrayList<clsClassroom> expResult = new ArrayList<>();
        expResult.add(classroom);
        instance.setLstClassroom(expResult);
        ArrayList<clsClassroom> result = instance.getLstClassroom();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetFaculty() {
        System.out.println("Testing SetGet-Faculty-clsMetods...");
        clsMetods instance = new clsMetods();
        clsFaculty facultad = new clsFaculty("Computación");
        ArrayList<clsFaculty> expResult = new ArrayList<>();
        expResult.add(facultad);
        instance.setLstFaculty(expResult);
        ArrayList<clsFaculty> result = instance.getLstFaculty();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetUser() {
        System.out.println("Testing SetGet-User-clsMetods...");
        clsMetods instance = new clsMetods();
        clsUser user = new clsStudent("JD01", "José", "j0s3");
        ArrayList<clsUser> expResult = new ArrayList<>();
        expResult.add(user);
        instance.setLstUsers(expResult);
        ArrayList<clsUser> result = instance.getLstUsers();
        assertEquals(expResult, result);
    }
    
    @Test
    public void insertSemester() {
        System.out.println("Testing insertSemester-clsMetods...");
        clsMetods instance = new clsMetods();
        instance.insertSemester("I", "2013");
        String expResult = "I";
        String expResult2 = "2013";
        String result = instance.getLstSemester().get(0).getSemesterNumber();
        String result2 = instance.getLstSemester().get(0).getSemesterYear();
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }
}