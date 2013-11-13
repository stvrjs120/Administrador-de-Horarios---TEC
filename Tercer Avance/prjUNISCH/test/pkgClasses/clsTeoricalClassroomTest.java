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
    
    @Test
    public void SetGetAirConditioner() {
        System.out.println("Testing SetGet-AirConditioner-clsTheoricalClassroom...");
        clsTeoricalClassroom instance = new clsTeoricalClassroom("", 0, "", 0, false, false);
        boolean expResult = true;
        instance.setAirConditioner(true);
        boolean result = instance.isAirConditioner();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetMultimedia() {
        System.out.println("Testing SetGet-Multimedia-clsTheoricalClassroom...");
        clsTeoricalClassroom instance = new clsTeoricalClassroom("", 0, "", 0, false, false);
        boolean expResult = true;
        instance.setMultimedia(true);
        boolean result = instance.isMultimedia();
        assertEquals(expResult, result);
    }
}