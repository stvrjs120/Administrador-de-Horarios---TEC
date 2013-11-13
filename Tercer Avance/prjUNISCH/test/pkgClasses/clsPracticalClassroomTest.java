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
public class clsPracticalClassroomTest {
    
    public clsPracticalClassroomTest() {
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
    public void SetGetlstEquipment() {
        System.out.println("Testing SetGet-lstEquipment-clsPracticalClassroom...");
        clsPracticalClassroom instance = new clsPracticalClassroom(0, "", 0, "");
        clsEquipment equipo = new clsEquipment(30, "Computadora");
        ArrayList<clsEquipment> expResult = new ArrayList<>();
        expResult.add(equipo);
        instance.setLstEquipment(expResult);
        ArrayList<clsEquipment> result = instance.getLstEquipment();
        assertEquals(expResult, result);
    }
}