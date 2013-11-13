/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgClasses;

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
public class clsSubjectTest {
    
    public clsSubjectTest() {
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
    public void SetGetSubjectName() {
        System.out.println("Testing SetGet-SubjectName-clsSubject...");
        clsSubject instance = new clsTheoricalSubject(0, "", "");
        String expResult = "Emprendedores";
        instance.setSubjectName("Emprendedores");
        String result = instance.getSubjectName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetCredits() {
        System.out.println("Testing SetGet-Credits-clsSubject...");
        clsSubject instance = new clsTheoricalSubject(0, "", "");
        int expResult = 4;
        instance.setCredits(4);
        int result = instance.getCredits();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetWeeklyWorkTime() {
        System.out.println("Testing SetGet-WeeklyWorkTime-clsSubject...");
        clsSubject instance = new clsTheoricalSubject(0, "", "");
        int expResult = 12;
        instance.setWeeklyWorkTime(12);
        int result = instance.getWeeklyWorkTime();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetSchedule() {
        System.out.println("Testing SetGet-Schedule-clsSubject...");
        clsSubject instance = new clsTheoricalSubject(0, "", "");
        clsSchedule expResult = new clsSchedule("Lunes", "08:00","16:00");
        instance.setSchedule(expResult);
        clsSchedule result = instance.getSchedule();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetClsClassroom() {
        System.out.println("Testing SetGet-ClsClassroom-clsSubject...");
        clsSubject instance = new clsTheoricalSubject(0, "", "");
        clsClassroom expResult = new clsPracticalClassroom(40, "AU01", 1, "En algun lugar de un gran país.");
        instance.setClsClassroom(expResult);
        clsClassroom result = instance.getClsClassroom();
        assertEquals(expResult, result);
    }
}