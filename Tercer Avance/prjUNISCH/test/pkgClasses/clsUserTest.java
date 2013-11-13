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
     * SetGet-ID-clsUsers
     * Se probará que funcionen los métodos setID y getID de la clase clsUsers
     */
    @Test
    public void SetGetID() {
        System.out.println("Testing SetGet-ID-clsUsers...");
        clsUser instance = new clsCoordinator("", "", "");
        instance.setID("JD01");
        String expResult = "JD01";
        String result = instance.getID();
        assertEquals(expResult, result);
    }
    
    /**
     * SetGet-Name-clsUsers
     * Se probará que funcionen los métodos setName y getName de la clase clsUsers
     */
    @Test
    public void SetGetName() {
        System.out.println("Testing SetGet-Name-clsUsers...");
        clsUser instance = new clsCoordinator("", "", "");
        instance.setName("José");
        String expResult = "José";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    /**
     * SetGet-Password-clsUsers
     * Se probara que funcionen los métodos setPassword y getPassword de la clase clsUsers
     */
    @Test
    public void SetGetPassword() {
        System.out.println("Testing SetGet-Password-clsUsers...");
        clsUser instance = new clsCoordinator("", "", "");
        instance.setPassword("j0s3");
        String expResult = "j0s3";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }
}