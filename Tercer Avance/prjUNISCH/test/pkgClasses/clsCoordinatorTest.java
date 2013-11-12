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
public class clsCoordinatorTest {
    
    public clsCoordinatorTest() {
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
     * Test of getLstSemester method, of class clsCoordinator.
     */
    @Test
    public void testGetLstSemester() {
        System.out.println("getLstSemester");
        clsCoordinator instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getLstSemester();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstSemester method, of class clsCoordinator.
     */
    @Test
    public void testSetLstSemester() {
        System.out.println("setLstSemester");
        ArrayList<clsSemester> lstSemester = null;
        clsCoordinator instance = null;
        instance.setLstSemester(lstSemester);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}