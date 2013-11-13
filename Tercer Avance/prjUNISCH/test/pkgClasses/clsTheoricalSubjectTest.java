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
public class clsTheoricalSubjectTest {
    
    public clsTheoricalSubjectTest() {
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
    public void SetGetWebsite() {
        System.out.println("Testing SetGet-Website-clsTheoricalSubject...");
        clsTheoricalSubject instance = new clsTheoricalSubject(0, "", "");
        String expResult = "www.SQA.com";
        instance.setWebsite("www.SQA.com");
        String result = instance.getWebsite();
        assertEquals(expResult, result);
    }
}