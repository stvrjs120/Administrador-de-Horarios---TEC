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

    /**
     * Test of getSupportMaterial method, of class clsPracticalSubject.
     */
    @Test
    public void testGetSupportMaterial() {
        System.out.println("getSupportMaterial");
        clsPracticalSubject instance = null;
        String expResult = "";
        String result = instance.getSupportMaterial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupportMaterial method, of class clsPracticalSubject.
     */
    @Test
    public void testSetSupportMaterial() {
        System.out.println("setSupportMaterial");
        String supportMaterial = "";
        clsPracticalSubject instance = null;
        instance.setSupportMaterial(supportMaterial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperativeSystem method, of class clsPracticalSubject.
     */
    @Test
    public void testGetOperativeSystem() {
        System.out.println("getOperativeSystem");
        clsPracticalSubject instance = null;
        String expResult = "";
        String result = instance.getOperativeSystem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperativeSystem method, of class clsPracticalSubject.
     */
    @Test
    public void testSetOperativeSystem() {
        System.out.println("setOperativeSystem");
        String operativeSystem = "";
        clsPracticalSubject instance = null;
        instance.setOperativeSystem(operativeSystem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}