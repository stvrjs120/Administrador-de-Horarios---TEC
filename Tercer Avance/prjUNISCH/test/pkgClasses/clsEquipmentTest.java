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
public class clsEquipmentTest {
    
    public clsEquipmentTest() {
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
     * Test of getAmount method, of class clsEquipment.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        clsEquipment instance = null;
        int expResult = 0;
        int result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class clsEquipment.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        int amount = 0;
        clsEquipment instance = null;
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipmentName method, of class clsEquipment.
     */
    @Test
    public void testGetEquipmentName() {
        System.out.println("getEquipmentName");
        clsEquipment instance = null;
        String expResult = "";
        String result = instance.getEquipmentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipmentName method, of class clsEquipment.
     */
    @Test
    public void testSetEquipmentName() {
        System.out.println("setEquipmentName");
        String equipmentName = "";
        clsEquipment instance = null;
        instance.setEquipmentName(equipmentName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}