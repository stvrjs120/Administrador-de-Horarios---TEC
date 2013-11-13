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
public class clsCoordinatorTest {
    
    public clsCoordinatorTest() {
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
     * SetGet-LstSemester-clsCoordinator
     * Se probara que funcionen los métodos setLstSemester y getLstSemester de la clase clsCoordinator
     */
    @Test
    public void SetGetLstSemester() {
        System.out.println("Testing SetGet-LstSemester-clsCoordinator...");
        clsCoordinator instance = new clsCoordinator("", "", "");
        ArrayList<clsSemester> tempList = new ArrayList<clsSemester>();
        tempList.add(new clsSemester("I", "2013"));
        instance.setLstSemester(tempList);
        ArrayList<clsSemester> result = instance.getLstSemester();
        assertEquals(tempList, result);
    }
}