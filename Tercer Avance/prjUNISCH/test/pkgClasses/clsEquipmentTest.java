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
    
    @Test
    public void SetGetAmount() {
        System.out.println("Testing SetGet-Amount-clsEquipment...");
        clsEquipment instance = new clsEquipment(0, "");
        int expResult = 1000;
        instance.setAmount(1000);
        int result = instance.getAmount();
        assertEquals(expResult, result);
    }
            
    @Test
    public void SetGetEquipmentName() {
        System.out.println("Testing SetGet-EquipmentName-clsEquipment...");
        clsEquipment instance = new clsEquipment(0, "");
        String expResult = "Computadora";
        instance.setEquipmentName("Computadora");
        String result = instance.getEquipmentName();
        assertEquals(expResult, result);
    }
}