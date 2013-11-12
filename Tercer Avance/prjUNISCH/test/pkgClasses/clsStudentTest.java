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
public class clsStudentTest {
    
    public clsStudentTest() {
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
     * Test of getLstSemester method, of class clsStudent.
     */
    @Test
    public void testGetLstSemester() {
        System.out.println("getLstSemester");
        clsStudent instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getLstSemester();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstSemester method, of class clsStudent.
     */
    @Test
    public void testSetLstSemester() {
        System.out.println("setLstSemester");
        ArrayList<clsSemester> lstSemester = null;
        clsStudent instance = null;
        instance.setLstSemester(lstSemester);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}