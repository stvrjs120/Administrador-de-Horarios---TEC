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
public class clsStudentTest {
    
    public clsStudentTest() {
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
    public void SetGetSemester() {
        System.out.println("Testing SetGet-Semester-clsStudent...");
        clsStudent instance = new clsStudent("", "", "");
        clsSemester semester = new clsSemester("1", "2013");
        ArrayList<clsSemester> expResult = new ArrayList<>();
        expResult.add(semester);
        instance.setLstSemester(expResult);
        ArrayList<clsSemester> result = instance.getLstSemester();
        assertEquals(expResult, result);
    }
}