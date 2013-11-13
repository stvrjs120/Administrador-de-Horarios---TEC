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

    @Test
    public void SetGetDayclsSchedule() {
        System.out.println("Testing SetGet-Day-clsSchedule...");
        clsSchedule instance = new clsSchedule("", "", "");
        String expResult = "Lunes";
        instance.setDay("Lunes");
        String result = instance.getDay();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetStarScheduleclsSchedule() {
        System.out.println("Testing SetGet-StarSchedule-clsSchedule...");
        clsSchedule instance = new clsSchedule("", "", "");
        String expResult = "08:00";
        instance.setStarSchedule("08:00");
        String result = instance.getStarSchedule();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetEndScheduleclsSchedule() {
        System.out.println("Testing SetGet-EndSchedule-clsSchedule...");
        clsSchedule instance = new clsSchedule("", "", "");
        String expResult = "16:00";
        instance.setEndSchedule("16:00");
        String result = instance.getEndSchedule();
        assertEquals(expResult, result);
    }
}