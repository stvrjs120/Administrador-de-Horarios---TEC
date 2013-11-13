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
    
    @Test
    public void SetGetSemesterNumber() {
        System.out.println("Testing SetGet-SemesterNumber-clsSemester...");
        clsSemester instance = new clsSemester("", "");
        String expResult = "1";
        instance.setSemesterNumber("1");
        String result = instance.getSemesterNumber();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetSemesterYear() {
        System.out.println("Testing SetGet-SemesterYear-clsSemester...");
        clsSemester instance = new clsSemester("", "");
        String expResult = "2013";
        instance.setSemesterYear("2013");
        String result = instance.getSemesterYear();
        assertEquals(expResult, result);
    }
    
    @Test
    public void SetGetLstSubject() {
        System.out.println("Testing SetGet-LstSubject-clsSemester...");
        clsSemester instance = new clsSemester("", "");
        clsSubject subject = new clsPracticalSubject(4, "Emprendedores", "Windows", "");
        ArrayList<clsSubject> expResult = new ArrayList<>();
        expResult.add(subject);
        instance.setLstSubject(expResult);
        ArrayList<clsSubject> result = instance.getLstSubject();
        assertEquals(expResult, result);
    }
}