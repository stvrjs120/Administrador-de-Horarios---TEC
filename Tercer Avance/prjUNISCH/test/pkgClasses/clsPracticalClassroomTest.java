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
public class clsPracticalClassroomTest {
    
    public clsPracticalClassroomTest() {
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
     * Test of getLstEquipment method, of class clsPracticalClassroom.
     */
    @Test
    public void testGetLstEquipment() {
        System.out.println("getLstEquipment");
        clsPracticalClassroom instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getLstEquipment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstEquipment method, of class clsPracticalClassroom.
     */
    @Test
    public void testSetLstEquipment() {
        System.out.println("setLstEquipment");
        ArrayList<clsEquipment> lstEquipment = null;
        clsPracticalClassroom instance = null;
        instance.setLstEquipment(lstEquipment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}