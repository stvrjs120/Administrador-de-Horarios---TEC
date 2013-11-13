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
     * SetGet-FacultyName-clsFaculty
     * Se probara que funcionen los métodos setFacultyName y getFacultyName de la clase clsFaculty
     */
    @Test
    public void SetGetFacultyName() {
        System.out.println("Testing SetGet-FacultyName-clsFaculty...");
        clsFaculty instance = new clsFaculty("");
        instance.setFacultyName("Computación");
        String expResult = "Computación";
        String result = instance.getFacultyName();
        assertEquals(expResult, result);
    }
    
    /**
     * SetGet-LstSubject-clsFaculty
     * Se probara que funcionen los métodos setLstSubject y getLstSubject de la clase clsFaculty
     */
    @Test
    public void SetGetLstSubject() {
        System.out.println("Testing SetGet-LstSubject-clsFaculty...");
        clsFaculty instance = new clsFaculty("");
        ArrayList<clsSubject> tempList = new ArrayList<clsSubject>();
        tempList.add(new clsPracticalSubject(4, "Investigación de Operaciones", "Linux", "Proyector"));
        instance.setLstSubject(tempList);
        ArrayList<clsSubject> result = instance.getLstSubject();
        assertEquals(tempList, result);
    }
    
    /**
     * SetGet-LstTeacher-clsFaculty
     * Se probara que funcionen los métodos setLstTeacher y getLstTeacher de la clase clsFaculty
     */
    @Test
    public void SetGetLstTeacher() {
        System.out.println("Testing SetGet-LstTeacher-clsFaculty...");
        clsFaculty instance = new clsFaculty("");
        ArrayList<clsTeacher> tempList = new ArrayList<clsTeacher>();
        tempList.add(new clsTeacher("olopez", "Oscar Lopez", "123456"));
        instance.setLstTeacher(tempList);
        ArrayList<clsTeacher> result = instance.getLstTeacher();
        assertEquals(tempList, result);
    }
}