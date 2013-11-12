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
public class clsTeoricalClassroomTest {
    
    public clsTeoricalClassroomTest() {
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
     * Test of isAirConditioner method, of class clsTeoricalClassroom.
     */
    @Test
    public void testIsAirConditioner() {
        System.out.println("isAirConditioner");
        clsTeoricalClassroom instance = null;
        boolean expResult = false;
        boolean result = instance.isAirConditioner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAirConditioner method, of class clsTeoricalClassroom.
     */
    @Test
    public void testSetAirConditioner() {
        System.out.println("setAirConditioner");
        boolean airConditioner = false;
        clsTeoricalClassroom instance = null;
        instance.setAirConditioner(airConditioner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMultimedia method, of class clsTeoricalClassroom.
     */
    @Test
    public void testIsMultimedia() {
        System.out.println("isMultimedia");
        clsTeoricalClassroom instance = null;
        boolean expResult = false;
        boolean result = instance.isMultimedia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMultimedia method, of class clsTeoricalClassroom.
     */
    @Test
    public void testSetMultimedia() {
        System.out.println("setMultimedia");
        boolean multimedia = false;
        clsTeoricalClassroom instance = null;
        instance.setMultimedia(multimedia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}