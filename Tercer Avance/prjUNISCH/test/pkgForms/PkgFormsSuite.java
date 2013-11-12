/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgForms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author StvRjs.K12
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({pkgForms.frmStudentIniTest.class, pkgForms.frmTeacherIniTest.class, pkgForms.frmLoginTest.class, pkgForms.frmCoordinatorTest.class})
public class PkgFormsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}