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
     * SetGet-ClassroomName-clsClassroom
     * Se probara que funcionen los métodos setClassroomName y getClassroomName de la clase clsClassroom
     */
    @Test
    public void SetGetClassroomName() {
        System.out.println("Testing SetGet-ClassroomName-clsClassroom...");
        clsClassroom instance = new clsPracticalClassroom(0, "", 0, "");
        instance.setClassroomName("AU01");
        String expResult = "AU01";
        String result = instance.getClassroomName();
        assertEquals(expResult, result);
    }
    
    /**
     * SetGet-ClassroomNumber-clsClassroom
     * Se probara que funcionen los métodos setClassroomNumber y getClassroomNumber de la clase clsClassroom
     */
    @Test
    public void SetGetClassroomNumber() {
        System.out.println("Testing SetGet-ClassroomNumber-clsClassroom...");
        clsClassroom instance = new clsPracticalClassroom(0, "", 0, "");
        instance.setClassroomNumber(1);
        int expResult = 1;
        int result = instance.getClassroomNumber();
        assertEquals(expResult, result);
    }
    
    /**
     * SetGet-Location-clsClassroom
     * Se probara que funcionen los métodos setLocation y getLocation de la clase clsClassroom
     */
    @Test
    public void SetGetLocation() {
        System.out.println("Testing SetGet-Location-clsClassroom...");
        clsClassroom instance = new clsPracticalClassroom(0, "", 0, "");
        instance.setLocation("Junto al comedor");
        String expResult = "Junto al comedor";
        String result = instance.getLocation();
        assertEquals(expResult, result);
    }
    
    /**
     * SetGet-Capacity-clsClassroom
     * Se probara que funcionen los métodos setCapacity y getCapacity de la clase clsClassroom
     */
    @Test
    public void SetGetCapacity() {
        System.out.println("Testing SetGet-Location-clsClassroom...");
        clsClassroom instance = new clsPracticalClassroom(0, "", 0, "");
        instance.setCapacity(30);
        int expResult = 30;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }
}