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

    /**
     * Test of getLstSchedule method, of class clsTeacher.
     */
    @Test
    public void testGetLstSchedule() {
        System.out.println("getLstSchedule");
        clsTeacher instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getLstSchedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstSchedule method, of class clsTeacher.
     */
    @Test
    public void testSetLstSchedule() {
        System.out.println("setLstSchedule");
        ArrayList<clsSchedule> lstSchedule = null;
        clsTeacher instance = null;
        instance.setLstSchedule(lstSchedule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLstSubject method, of class clsTeacher.
     */
    @Test
    public void testGetLstSubject() {
        System.out.println("getLstSubject");
        clsTeacher instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getLstSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstSubject method, of class clsTeacher.
     */
    @Test
    public void testSetLstSubject() {
        System.out.println("setLstSubject");
        ArrayList<clsSubject> lstSubject = null;
        clsTeacher instance = null;
        instance.setLstSubject(lstSubject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}