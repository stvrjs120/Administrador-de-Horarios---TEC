/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgClasses;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author StvRjs.K12
 */
public class clsTeacherTest {
    
    public clsTeacherTest() {
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
    public void SetGetScheduleclsTeacher() {
        System.out.println("Testing SetGet-Schedule-clsTeacher...");
        clsTeacher instance = new clsTeacher("", "", "");
        clsSchedule schedule = new clsSchedule("Lunes", "08:00","16:00");
        ArrayList<clsSchedule> expResult = new ArrayList<>();
        expResult.add(schedule);
        instance.setLstSchedule(expResult);
        ArrayList<clsSchedule> result = instance.getLstSchedule();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetSubjectclsTeacher() {
        System.out.println("Testing SetGet-Subject-clsTeacher...");
        clsTeacher instance = new clsTeacher("", "", "");
        clsSubject subject = new clsPracticalSubject(4, "Emprendedores", "Windows", "");
        ArrayList<clsSubject> expResult = new ArrayList<>();
        expResult.add(subject);
        instance.setLstSubject(expResult);
        ArrayList<clsSubject> result = instance.getLstSubject();
        assertEquals(expResult, result);
    }
}