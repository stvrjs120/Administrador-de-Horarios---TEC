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
public class clsPracticalSubjectTest {
    
    public clsPracticalSubjectTest() {
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
    public void SetGetSupportMaterial() {
        System.out.println("Testing SetGet-SupportMaterial-clsPracticalSubject...");
        clsPracticalSubject instance = new clsPracticalSubject(0, "", "", "");
        String expResult = "Pizarra Electronica";
        instance.setSupportMaterial("Pizarra Electronica");
        String result = instance.getSupportMaterial();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetOperatingSystem() {
        System.out.println("Testing SetGet-OperatingSystem-clsPracticalSubject...");
        clsPracticalSubject instance = new clsPracticalSubject(0, "", "", "");
        String expResult = "Windows 8";
        instance.setOperativeSystem("Windows 8");
        String result = instance.getOperativeSystem();
        assertEquals(expResult, result);
    }
}