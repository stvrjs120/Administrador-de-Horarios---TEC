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
public class clsClassroomTest {
    
    public clsClassroomTest() {
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
     * Test of getClassroomName method, of class clsClassroom.
     */
    @Test
    public void testGetClassroomName() {
        System.out.println("getClassroomName");
        clsClassroom instance = null;
        String expResult = "";
        String result = instance.getClassroomName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClassroomName method, of class clsClassroom.
     */
    @Test
    public void testSetClassroomName() {
        System.out.println("setClassroomName");
        String classroomName = "";
        clsClassroom instance = null;
        instance.setClassroomName(classroomName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClassroomNumber method, of class clsClassroom.
     */
    @Test
    public void testGetClassroomNumber() {
        System.out.println("getClassroomNumber");
        clsClassroom instance = null;
        int expResult = 0;
        int result = instance.getClassroomNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class clsClassroom.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        clsClassroom instance = null;
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class clsClassroom.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "";
        clsClassroom instance = null;
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClassroomNumber method, of class clsClassroom.
     */
    @Test
    public void testSetClassroomNumber() {
        System.out.println("setClassroomNumber");
        int classroomNumber = 0;
        clsClassroom instance = null;
        instance.setClassroomNumber(classroomNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class clsClassroom.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        clsClassroom instance = null;
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class clsClassroom.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 0;
        clsClassroom instance = null;
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class clsClassroomImpl extends clsClassroom {

        public clsClassroomImpl() {
            super(0, "", 0, "");
        }
    }
}