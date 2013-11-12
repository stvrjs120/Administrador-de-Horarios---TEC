/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgClasses;

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
@Suite.SuiteClasses({pkgClasses.clsUserTest.class, pkgClasses.clsClassroomTest.class, pkgClasses.clsPracticalSubjectTest.class, pkgClasses.clsTeoricalClassroomTest.class, pkgClasses.clsFacultyTest.class, pkgClasses.clsTeacherTest.class, pkgClasses.clsTheoricalSubjectTest.class, pkgClasses.clsScheduleTest.class, pkgClasses.clsSemesterTest.class, pkgClasses.clsStudentTest.class, pkgClasses.clsSubjectTest.class, pkgClasses.clsCoordinatorTest.class, pkgClasses.clsEquipmentTest.class, pkgClasses.clsPracticalClassroomTest.class})
public class PkgClassesSuite {

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