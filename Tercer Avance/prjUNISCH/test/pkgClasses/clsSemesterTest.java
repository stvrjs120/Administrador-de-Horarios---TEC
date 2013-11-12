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
public class clsSemesterTest {
    
    public clsSemesterTest() {
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
     * Test of getSemesterNumber method, of class clsSemester.
     */
    @Test
    public void testGetSemesterNumber() {
        System.out.println("getSemesterNumber");
        clsSemester instance = null;
        String expResult = "";
        String result = instance.getSemesterNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSemesterNumber method, of class clsSemester.
     */
    @Test
    public void testSetSemesterNumber() {
        System.out.println("setSemesterNumber");
        String semesterNumber = "";
        clsSemester instance = null;
        instance.setSemesterNumber(semesterNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSemesterYear method, of class clsSemester.
     */
    @Test
    public void testGetSemesterYear() {
        System.out.println("getSemesterYear");
        clsSemester instance = null;
        String expResult = "";
        String result = instance.getSemesterYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSemesterYear method, of class clsSemester.
     */
    @Test
    public void testSetSemesterYear() {
        System.out.println("setSemesterYear");
        String semesterYear = "";
        clsSemester instance = null;
        instance.setSemesterYear(semesterYear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLstSubject method, of class clsSemester.
     */
    @Test
    public void testGetLstSubject() {
        System.out.println("getLstSubject");
        clsSemester instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getLstSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstSubject method, of class clsSemester.
     */
    @Test
    public void testSetLstSubject() {
        System.out.println("setLstSubject");
        ArrayList<clsSubject> lstSubject = null;
        clsSemester instance = null;
        instance.setLstSubject(lstSubject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}