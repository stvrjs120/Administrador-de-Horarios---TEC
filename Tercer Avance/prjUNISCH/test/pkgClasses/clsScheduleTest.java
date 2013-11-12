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
public class clsScheduleTest {
    
    public clsScheduleTest() {
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
     * Test of getDay method, of class clsSchedule.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        clsSchedule instance = null;
        String expResult = "";
        String result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDay method, of class clsSchedule.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        String day = "";
        clsSchedule instance = null;
        instance.setDay(day);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStarSchedule method, of class clsSchedule.
     */
    @Test
    public void testGetStarSchedule() {
        System.out.println("getStarSchedule");
        clsSchedule instance = null;
        String expResult = "";
        String result = instance.getStarSchedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStarSchedule method, of class clsSchedule.
     */
    @Test
    public void testSetStarSchedule() {
        System.out.println("setStarSchedule");
        String starSchedule = "";
        clsSchedule instance = null;
        instance.setStarSchedule(starSchedule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndSchedule method, of class clsSchedule.
     */
    @Test
    public void testGetEndSchedule() {
        System.out.println("getEndSchedule");
        clsSchedule instance = null;
        String expResult = "";
        String result = instance.getEndSchedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndSchedule method, of class clsSchedule.
     */
    @Test
    public void testSetEndSchedule() {
        System.out.println("setEndSchedule");
        String endSchedule = "";
        clsSchedule instance = null;
        instance.setEndSchedule(endSchedule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}