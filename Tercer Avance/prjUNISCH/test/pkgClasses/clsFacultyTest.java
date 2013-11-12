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
public class clsFacultyTest {
    
    public clsFacultyTest() {
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
     * Test of getFacultyName method, of class clsFaculty.
     */
    @Test
    public void testGetFacultyName() {
        System.out.println("getFacultyName");
        clsFaculty instance = null;
        String expResult = "";
        String result = instance.getFacultyName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFacultyName method, of class clsFaculty.
     */
    @Test
    public void testSetFacultyName() {
        System.out.println("setFacultyName");
        String facultyName = "";
        clsFaculty instance = null;
        instance.setFacultyName(facultyName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLstSubject method, of class clsFaculty.
     */
    @Test
    public void testGetLstSubject() {
        System.out.println("getLstSubject");
        clsFaculty instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getLstSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstSubject method, of class clsFaculty.
     */
    @Test
    public void testSetLstSubject() {
        System.out.println("setLstSubject");
        ArrayList<clsSubject> lstSubject = null;
        clsFaculty instance = null;
        instance.setLstSubject(lstSubject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLstTeacher method, of class clsFaculty.
     */
    @Test
    public void testGetLstTeacher() {
        System.out.println("getLstTeacher");
        clsFaculty instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getLstTeacher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstTeacher method, of class clsFaculty.
     */
    @Test
    public void testSetLstTeacher() {
        System.out.println("setLstTeacher");
        ArrayList<clsTeacher> lstTeacher = null;
        clsFaculty instance = null;
        instance.setLstTeacher(lstTeacher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}