/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgMetods;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkgClasses.*;

/**
 *
 * @author StvRjs.K12
 */
public class clsMetodsTest {

    public clsMetodsTest() {
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
        System.out.println("Testing SetGet-Semester-clsMetods...");
        clsMetods instance = new clsMetods();
        clsSemester semester = new clsSemester("1", "2013");
        ArrayList<clsSemester> expResult = new ArrayList<>();
        expResult.add(semester);
        instance.setLstSemester(expResult);
        ArrayList<clsSemester> result = instance.getLstSemester();
        assertEquals(expResult, result);
    }

    @Test
    public void SetGetClassroom() {
        System.out.println("Testing SetGet-Classroom-clsMetods...");
        clsMetods instance = new clsMetods();
        clsClassroom classroom = new clsPracticalClassroom(40, "AU01", 1, "En algun lugar de un gran país.");
        ArrayList<clsClassroom> expResult = new ArrayList<>();
        expResult.add(classroom);
        instance.setLstClassroom(expResult);
        ArrayList<clsClassroom> result = instance.getLstClassroom();
        assertEquals(expResult, result);
    }

    @Test
    public void SetGetFaculty() {
        System.out.println("Testing SetGet-Faculty-clsMetods...");
        clsMetods instance = new clsMetods();
        clsFaculty facultad = new clsFaculty("Computación");
        ArrayList<clsFaculty> expResult = new ArrayList<>();
        expResult.add(facultad);
        instance.setLstFaculty(expResult);
        ArrayList<clsFaculty> result = instance.getLstFaculty();
        assertEquals(expResult, result);
    }

    @Test
    public void SetGetUser() {
        System.out.println("Testing SetGet-User-clsMetods...");
        clsMetods instance = new clsMetods();
        clsUser user = new clsStudent("JD01", "José", "j0s3");
        ArrayList<clsUser> expResult = new ArrayList<>();
        expResult.add(user);
        instance.setLstUsers(expResult);
        ArrayList<clsUser> result = instance.getLstUsers();
        assertEquals(expResult, result);
    }

    @Test
    public void insertSemester() {
        System.out.println("Testing InsertSemester-clsMetods...");
        clsMetods instance = new clsMetods();
        instance.insertSemester("I", "2013");
        String expResult = "I";
        String expResult2 = "2013";
        String result = instance.getLstSemester().get(0).getSemesterNumber();
        String result2 = instance.getLstSemester().get(0).getSemesterYear();
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }

    @Test
    public void insertTheoricalClassroom() {
        System.out.println("Testing InsertTheoricalClassroom-clsMethods...");
        clsMetods instance = new clsMetods();
        instance.insertClassroom("Auditorio", 1, "Laboratorios de Computación", 24, true, true);

        String expName = "Auditorio";
        int expNumber = 1;
        String expLocation = "Laboratorios de Computación";
        int expCapacity = 24;
        boolean expAirCond = true;
        boolean expMulti = true;

        clsTeoricalClassroom tempClass = (clsTeoricalClassroom) instance.getLstClassroom().get(0);

        String resultName = tempClass.getClassroomName();
        int resultNumber = tempClass.getClassroomNumber();
        String resultLocation = tempClass.getLocation();
        int resultCapacity = tempClass.getCapacity();
        boolean resultAirCond = tempClass.isAirConditioner();
        boolean resultMulti = tempClass.isMultimedia();

        assertEquals(expName, resultName);
        assertEquals(expNumber, resultNumber);
        assertEquals(expLocation, resultLocation);
        assertEquals(expCapacity, resultCapacity);
        assertEquals(expAirCond, resultAirCond);
        assertEquals(expMulti, resultMulti);
    }

    @Test
    public void insertPracticalClassroom() {
        System.out.println("Testing InsertPracticalClassroom-clsMethods...");
        clsMetods instance = new clsMetods();
        clsEquipment equipo = new clsEquipment(30, "Computadora");
        ArrayList<clsEquipment> expLstEquip = new ArrayList<>();
        expLstEquip.add(equipo);
        instance.insertClassroom(30, "AU01", 1, "Junto a la biblioteca", expLstEquip);

        String expName = "AU01";
        int expNumber = 1;
        String expLocation = "Junto a la biblioteca";
        int expCapacity = 30;

        clsPracticalClassroom tempClass = (clsPracticalClassroom) instance.getLstClassroom().get(0);

        String resultName = tempClass.getClassroomName();
        int resultNumber = tempClass.getClassroomNumber();
        String resultLocation = tempClass.getLocation();
        int resultCapacity = tempClass.getCapacity();
        ArrayList<clsEquipment> resultLstEquip = tempClass.getLstEquipment();

        assertEquals(expName, resultName);
        assertEquals(expNumber, resultNumber);
        assertEquals(expLocation, resultLocation);
        assertEquals(expCapacity, resultCapacity);
        assertEquals(expLstEquip, resultLstEquip);
    }

    @Test
    public void insertFaculty() {
        System.out.println("Testing InsertFaculty-clsMetods...");
        clsMetods instance = new clsMetods();
        instance.insertFaculty("Escuela de Computación");

        String expName = "Escuela de Computación";
        String resultName = instance.getLstFaculty().get(0).getFacultyName();
        assertEquals(expName, resultName);
    }

    @Test
    public void insertStudent() {
        System.out.println("Testing InsertStudent-clsMetods...");
        clsMetods instance = new clsMetods();
        instance.insertStudent("srojas", "Steven Rojas", "srjs120");

        String expID = "srojas";
        String expName = "Steven Rojas";
        String expPass = "srjs120";

        String resultID = ((clsStudent) instance.getLstUsers().get(0)).getID();
        String resultName = ((clsStudent) instance.getLstUsers().get(0)).getName();
        String resultPass = ((clsStudent) instance.getLstUsers().get(0)).getPassword();

        assertEquals(expID, resultID);
        assertEquals(expName, resultName);
        assertEquals(expPass, resultPass);
    }

    @Test
    public void insertCoordinator() {
        System.out.println("Testing InsertCoordinator-clsMethods...");
        clsMetods instance = new clsMetods();
        instance.insertCoordinator("OV01", "Oscar", "VQZ123");

        String expID = "OV01";
        String expName = "Oscar";
        String expPass = "VQZ123";

        String resultID = ((clsCoordinator) instance.getLstUsers().get(0)).getID();
        String resultName = ((clsCoordinator) instance.getLstUsers().get(0)).getName();
        String resultPass = ((clsCoordinator) instance.getLstUsers().get(0)).getPassword();

        assertEquals(expID, resultID);
        assertEquals(expName, resultName);
        assertEquals(expPass, resultPass);
    }

    @Test
    public void insertTeacher() {
        System.out.println("Testing InsertTeacher-clsMetods...");
        clsMetods instance = new clsMetods();
        instance.insertTeacher("lvalerio", "Lorena Valerio", "ovale");

        String expID = "lvalerio";
        String expName = "Lorena Valerio";
        String expPass = "ovale";

        String resultID = ((clsTeacher) instance.getLstUsers().get(0)).getID();
        String resultName = ((clsTeacher) instance.getLstUsers().get(0)).getName();
        String resultPass = ((clsTeacher) instance.getLstUsers().get(0)).getPassword();

        assertEquals(expID, resultID);
        assertEquals(expName, resultName);
        assertEquals(expPass, resultPass);
    }

    @Test
    public void insertInsertFacultyTeacher() {
        System.out.println("Testing InsertFacultyTeacher-clsMethods...");
        clsMetods instance = new clsMetods();
        instance.insertFaculty("Computación");
        instance.insertTeacher("OV01", "Oscar", "VQZ123");

        instance.insertFacultyTeacher("Computación", "OV01");

        String expFacultyName = "Computación";
        String expTeacherID = "OV01";

        String resultFacultyName = instance.getLstFaculty().get(0).getFacultyName();
        ArrayList<clsTeacher> tempLstTeacher = instance.getLstFaculty().get(0).getLstTeacher();
        String resultTeacherID = tempLstTeacher.get(0).getID();

        assertEquals(expFacultyName, resultFacultyName);
        assertEquals(expTeacherID, resultTeacherID);
    }

    @Test
    public void insertInsertSubjects() {
        System.out.println("Testing InsertSubjects-clsMethods...");
        clsMetods instance = new clsMetods();
        instance.insertFaculty("Escuela de Computación");

        ArrayList<clsSubject> lstSubject = new ArrayList<>();
        lstSubject.add(new clsPracticalSubject(4, "Sistemas Operativos", "Linux", "Presentaciones"));
        instance.insertSubjects("Escuela de Computación", lstSubject);

        String expFacultyName = "Escuela de Computación";
        String expSubjectName = "Sistemas Operativos";

        String resultFacultyName = instance.getLstFaculty().get(0).getFacultyName();
        ArrayList<clsSubject> tempLstSubject = instance.getLstFaculty().get(0).getLstSubject();
        String resultSubjectName = tempLstSubject.get(0).getSubjectName();

        assertEquals(expFacultyName, resultFacultyName);
        assertEquals(expSubjectName, resultSubjectName);
    }

    @Test
    public void insertInsertScheduleTeacher() {
        System.out.println("Testing InsertScheduleTeacher-clsMethods...");
        clsMetods methods = new clsMetods();

        ArrayList<clsUser> lstUser = new ArrayList<>();
        lstUser.add(new clsTeacher("lvalerio", "Lorena", "123"));
        methods.setLstUsers(lstUser);

        ArrayList<clsSchedule> lstSchedule = new ArrayList<>();
        lstSchedule.add(new clsSchedule("Lunes", "7:00", "10:00"));

        methods.insertScheduleTeacher("lvalerio", lstSchedule);

        String expDay = "Lunes";
        String expStartSchedule = "7:00";
        String expEndSchedule = "10:00";

        clsTeacher teacher = (clsTeacher) lstUser.get(0);
        ArrayList<clsSchedule> resultLstSchedule = teacher.getLstSchedule();
        String resultDay = resultLstSchedule.get(0).getDay();
        String resultStartSchedule = resultLstSchedule.get(0).getStarSchedule();
        String resultEndSchedule = resultLstSchedule.get(0).getEndSchedule();

        assertEquals(expDay, resultDay);
        assertEquals(expStartSchedule, resultStartSchedule);
        assertEquals(expEndSchedule, resultEndSchedule);
    }

    @Test
    public void insertInsertSemesterSubject() {
        System.out.println("Testing InsertSemesterSubject-clsMethods...");
        clsMetods methods = new clsMetods();

        ArrayList<clsSubject> lstSubject = new ArrayList<>();
        clsSubject subject = new clsPracticalSubject(4, "Calculo", "Windows", "Video Beam");
        lstSubject.add(subject);

        ArrayList<clsSemester> lstSemester = new ArrayList<>();
        clsSemester semester = new clsSemester("1", "2012");
        semester.setLstSubject(lstSubject);
        lstSemester.add(semester);
        methods.setLstSemester(lstSemester);

        methods.insertSemesterSubject("1", "2012", "Calculo");

        String expSemesterNumber = "1";
        String expSemesterYear = "2012";
        String expSubjectName = "Calculo";

        clsSemester resultSemester = methods.getLstSemester().get(0);
        String resultSemesterNumber = resultSemester.getSemesterNumber();
        String resultSemesterYear = resultSemester.getSemesterYear();
        String resultSubjectName = resultSemester.getLstSubject().get(0).getSubjectName();

        assertEquals(expSemesterNumber, resultSemesterNumber);
        assertEquals(expSemesterYear, resultSemesterYear);
        assertEquals(expSubjectName, resultSubjectName);
    }

    @Test
    public void insertInsertSubjectClassroom() {
        System.out.println("Testing InsertSubjectClassroom-clsMethods...");
        clsMetods methods = new clsMetods();

        ArrayList<clsClassroom> lstClassroom = new ArrayList<>();
        clsClassroom classroom = new clsPracticalClassroom(24, "Auditorio", 1, "Laboratorio de Computación");
        lstClassroom.add(classroom);

        ArrayList<clsSubject> lstSubject = new ArrayList<>();
        clsSubject subject = new clsPracticalSubject(4, "Proyecto", "Windows", "Video Beam");
        subject.setClsClassroom(classroom);
        lstSubject.add(subject);

        ArrayList<clsFaculty> lstFaculty = new ArrayList<>();
        clsFaculty faculty = new clsFaculty("Escuela de Ingeniería en Computación");
        faculty.setLstSubject(lstSubject);
        lstFaculty.add(faculty);

        ArrayList<clsSemester> lstSemester = new ArrayList<>();
        clsSemester semester = new clsSemester("1", "2013");
        semester.setLstSubject(lstSubject);
        lstSemester.add(semester);
        methods.setLstSemester(lstSemester);

        String expSubjectName = "Proyecto";
        String expClassroomName = "Auditorio";

        clsSubject resultSubject = (clsPracticalSubject) methods.getLstSemester().get(0).getLstSubject().get(0);
        String resultSubjectName = resultSubject.getSubjectName();
        clsClassroom resultClassroom = resultSubject.getClsClassroom();
        String resultClassroomName = resultClassroom.getClassroomName();

        assertEquals(expSubjectName, resultSubjectName);
        assertEquals(expClassroomName, resultClassroomName);
    }
    
    @Test
    public void insertTeacherSubject() {
        System.out.println("Testing insertTeacherSubject-clsMethods...");
        clsMetods methods = new clsMetods();
        clsFaculty facultad = new clsFaculty("Computación");
        methods.getLstFaculty().add(facultad);
        clsTeacher profe = new clsTeacher("lvalerio", "Lorena", "12345");
        methods.getLstFaculty().get(0).getLstTeacher().add(profe);
        clsSubject curso = new clsTheoricalSubject(4, "Estructuras de Datos", "www.Datos2.com");
        methods.getLstFaculty().get(0).getLstSubject().add(curso);
        String expNameResult = "Estructuras de Datos";
        methods.insertTeacherSubject("lvalerio", "Estructuras de Datos");
        String NameResult = methods.getLstFaculty().get(0).getLstTeacher().get(0).getLstSubject().get(0).getSubjectName();
        assertEquals(expNameResult, NameResult);
    }
    
    //IMCOMPLETO
    @Test
    public void insertSubjectSchedule() {
        System.out.println("Testing insertSubjectSchedule-clsMethods...");
        clsMetods methods = new clsMetods();
        clsFaculty facultad = new clsFaculty("Computación");
        methods.getLstFaculty().add(facultad);
        clsSubject curso = new clsTheoricalSubject(4, "Estructuras de Datos", "www.Datos2.com");
        methods.getLstFaculty().get(0).getLstSubject().add(curso);
        clsSemester semestre = new clsSemester("I", "2013");
        methods.getLstSemester().add(semestre);
        
        //String expNameResult = "Estructuras de Datos";
        //methods.insertTeacherSubject("lvalerio", "Estructuras de Datos");
        //String NameResult = methods.getLstFaculty().get(0).getLstTeacher().get(0).getLstSubject().get(0).getSubjectName();
        //assertEquals(expNameResult, NameResult);
    }
    
    @Test
    public void evaluateScheduleTeacher() {
        System.out.println("Testing evaluateScheduleTeacher-clsMethods...");
        clsMetods methods = new clsMetods();
        clsTeacher profe = new clsTeacher("lvalerio", "Lorena", "12345");
        profe.getLstSubject().add(new clsTheoricalSubject(4, "Datos2", ""));
        profe.getLstSubject().get(0).setSchedule(new clsSchedule("Lunes", "08:00", "11:00"));
        clsSchedule horario = new clsSchedule("Lunes", "07:00", "10:00");
        boolean expResult = methods.evaluateScheduleTeacher(profe, horario);
        assertTrue(expResult);
    }
    
    @Test
    public void evaluateSubjectSemester() {
        System.out.println("Testing evaluateSubjectSemester-clsMethods...");
        clsMetods methods = new clsMetods();
        clsSemester semestre = new clsSemester("I", "2013");
        clsSubject materia = new clsTheoricalSubject(4, "Calculo", "");
        semestre.getLstSubject().add(materia);
        methods.getLstSemester().add(semestre);
        boolean expResult = methods.evaluateSubjectSemester("I", "2013", "Calculo");
        assertTrue(expResult);
    }
    
    @Test
    public void login() {
        System.out.println("Testing login-clsMethods...");
        clsMetods methods = new clsMetods();
        clsUser user = new clsStudent("j0s3", "José", "12345");
        methods.getLstUsers().add(user);
        String expIDresult = "j0s3";
        String expPassResult = "12345";
        user = methods.login("j0s3", "12345");
        String IDresult = user.getID();
        String PassResult = user.getPassword();
        assertEquals(expIDresult, IDresult);
        assertEquals(expPassResult, PassResult);
    }
    
    @Test
    public void loadSubjects() {
        System.out.println("Testing loadSubjects-clsMethods...");
        clsMetods methods = new clsMetods();
        clsSemester semestre = new clsSemester("I", "2013");
        clsSubject materia = new clsTheoricalSubject(4, "Calculo", "");
        clsSchedule horario = new clsSchedule("Martes", "08:00", "11:00");
        materia.setSchedule(horario);
        semestre.getLstSubject().add(materia);
        methods.getLstSemester().add(semestre);
        String expResult = "Caculo - Martes -> 08:00 to 11:00\n";
        String result = methods.loadSubjects("I - 2013");
        assertEquals(expResult, result);
    }
    
    @Test
    public void loadSubjectsTeacher() {
        System.out.println("Testing loadSubjectsTeacher-clsMethods...");
        clsMetods methods = new clsMetods();
        clsSemester semestre = new clsSemester("I", "2013");
        clsSubject materia = new clsTheoricalSubject(4, "Calculo", "");
        clsSchedule horario = new clsSchedule("Martes", "08:00", "11:00");
        materia.setSchedule(horario);
        semestre.getLstSubject().add(materia);
        methods.getLstSemester().add(semestre);
        String expResult = "Caculo - Martes -> 08:00 to 11:00\n";
        clsTeacher profe = new clsTeacher("Ballestero", "Esteban", "12345");
        profe.getLstSubject().add(new clsTheoricalSubject(4, "Calculo", ""));
        String result = methods.loadSubjectsTeacher(profe, "I - 2013");
        assertEquals(expResult, result);
    }
    
    public void loadClassroomSchedule() {
        System.out.println("Testing loadClassroomSchedule-clsMethods...");
        clsMetods methods = new clsMetods();
        clsSemester semestre = new clsSemester("I", "2013");
        clsSubject materia = new clsTheoricalSubject(4, "Calculo", "");
        clsSchedule horario = new clsSchedule("Martes", "08:00", "11:00");
        clsClassroom aula = new clsTeoricalClassroom("AU01", 1, "", 30, true, true);
        materia.setClsClassroom(aula);
        materia.setSchedule(horario);
        semestre.getLstSubject().add(materia);
        methods.getLstSemester().add(semestre);
        String expResult = "1 - 2013\n     Martes -> 08:00 tot 11:00";
        String result = methods.loadClassroomSchedule("AU01");
        assertEquals(expResult, result);
    }
}