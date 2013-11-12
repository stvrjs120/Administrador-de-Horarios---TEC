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

    /**
     * Test of getSubjectName method, of class clsSubject.
     */
    @Test
    public void testGetSubjectName() {
        System.out.println("getSubjectName");
        clsSubject instance = null;
        String expResult = "";
        String result = instance.getSubjectName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubjectName method, of class clsSubject.
     */
    @Test
    public void testSetSubjectName() {
        System.out.println("setSubjectName");
        String subjectName = "";
        clsSubject instance = null;
        instance.setSubjectName(subjectName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCredits method, of class clsSubject.
     */
    @Test
    public void testGetCredits() {
        System.out.println("getCredits");
        clsSubject instance = null;
        int expResult = 0;
        int result = instance.getCredits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCredits method, of class clsSubject.
     */
    @Test
    public void testSetCredits() {
        System.out.println("setCredits");
        int credits = 0;
        clsSubject instance = null;
        instance.setCredits(credits);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeeklyWorkTime method, of class clsSubject.
     */
    @Test
    public void testGetWeeklyWorkTime() {
        System.out.println("getWeeklyWorkTime");
        clsSubject instance = null;
        int expResult = 0;
        int result = instance.getWeeklyWorkTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeeklyWorkTime method, of class clsSubject.
     */
    @Test
    public void testSetWeeklyWorkTime() {
        System.out.println("setWeeklyWorkTime");
        int weeklyWorkTime = 0;
        clsSubject instance = null;
        instance.setWeeklyWorkTime(weeklyWorkTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchedule method, of class clsSubject.
     */
    @Test
    public void testGetSchedule() {
        System.out.println("getSchedule");
        clsSubject instance = null;
        clsSchedule expResult = null;
        clsSchedule result = instance.getSchedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSchedule method, of class clsSubject.
     */
    @Test
    public void testSetSchedule() {
        System.out.println("setSchedule");
        clsSchedule schedule = null;
        clsSubject instance = null;
        instance.setSchedule(schedule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClsClassroom method, of class clsSubject.
     */
    @Test
    public void testGetClsClassroom() {
        System.out.println("getClsClassroom");
        clsSubject instance = null;
        clsClassroom expResult = null;
        clsClassroom result = instance.getClsClassroom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClsClassroom method, of class clsSubject.
     */
    @Test
    public void testSetClsClassroom() {
        System.out.println("setClsClassroom");
        clsClassroom clsClassroom = null;
        clsSubject instance = null;
        instance.setClsClassroom(clsClassroom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class clsSubjectImpl extends clsSubject {

        public clsSubjectImpl() {
            super(0, "");
        }
    }
}