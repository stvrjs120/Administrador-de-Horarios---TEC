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
public class clsUserTest {
    
    public clsUserTest() {
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
     * Test of getID method, of class clsUser.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        clsUser instance = null;
        String expResult = "";
        String result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class clsUser.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        String id = "";
        clsUser instance = null;
        instance.setID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class clsUser.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        clsUser instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class clsUser.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        clsUser instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class clsUser.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        clsUser instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class clsUser.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        clsUser instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class clsUserImpl extends clsUser {

        public clsUserImpl() {
            super("", "", "");
        }
    }
}