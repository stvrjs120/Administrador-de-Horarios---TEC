/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prjunisch;

import java.util.ArrayList;
import pkgClasses.*;
import pkgMetods.clsMetods;

/**
 *
 * @author StvRjs.K12
 */
public class PrjUNISCH {
    
    public static clsMetods myMetodes = new clsMetods();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inserts();
    }
    
    public static void inserts() {
        
        //
        //Coordinators insertions
        //
        myMetodes.insertCoordinator("oviquez", "Oscar Viquez", "12345");
        
        //
        //Students insertions
        //
        myMetodes.insertStudent("srojas", "Steven Rojas", "srjs120");
        myMetodes.insertStudent("fsalazar", "Fabrizzio Salazar", "fslar10");
        
        //
        //Teachers insertions
        //
        myMetodes.insertTeacher("eballestero", "Esteban Ballestero", "eballes");
        ArrayList<clsSchedule> tempSchedule = new ArrayList<>();
        tempSchedule.add(new clsSchedule("Lunes", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Martes", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Miercoles", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Jueves", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Viernes", "7:00am", "4:00pm"));
        myMetodes.insertScheduleTeacher("eballestero", tempSchedule);
        
        myMetodes.insertTeacher("olopez", "Oscar Lopez", "olop");
        tempSchedule.clear();
        tempSchedule.add(new clsSchedule("Lunes", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Martes", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Miercoles", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Jueves", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Viernes", "7:00am", "4:00pm"));
        myMetodes.insertScheduleTeacher("olopez", tempSchedule);
        
        myMetodes.insertTeacher("lvalerio", "Lonera Valerio", "ovale");
        tempSchedule.clear();
        tempSchedule.add(new clsSchedule("Lunes", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Martes", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Miercoles", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Jueves", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Viernes", "7:00am", "4:00pm"));
        myMetodes.insertScheduleTeacher("lvalerio", tempSchedule);
        
        myMetodes.insertTeacher("mcampos", "Marvin Campos", "mcamp");
        tempSchedule.clear();
        tempSchedule.add(new clsSchedule("Lunes", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Martes", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Miercoles", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Jueves", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Viernes", "7:00am", "4:00pm"));
        myMetodes.insertScheduleTeacher("mcampos", tempSchedule);
        
        myMetodes.insertTeacher("jrojas", "Jiddu Rojas", "jroj");
        tempSchedule.clear();
        tempSchedule.add(new clsSchedule("Lunes", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Martes", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Miercoles", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Jueves", "7:00am", "4:00pm"));
        tempSchedule.add(new clsSchedule("Viernes", "7:00am", "4:00pm"));
        myMetodes.insertScheduleTeacher("jrojas", tempSchedule);
        
        //
        //Semesters insertions
        //
        myMetodes.insertSemester("I", "2013");
        myMetodes.insertSemester("II", "2013");
        
        //
        //Faculty insertions
        //
        myMetodes.insertFaculty("Computer Engineering");
        myMetodes.insertFaculty("Letters & Science");
        
        //
        //Classrooms insertions
        //
        ArrayList<clsEquipment> tempEquipment1 = new ArrayList<>();
        tempEquipment1.add(new clsEquipment(22, "Computadoras"));
        tempEquipment1.add(new clsEquipment(1, "Proyector"));
        myMetodes.insertClassroom(22, "LaboratorioN1", 1, "Atrás del comedor", tempEquipment1);
        
        ArrayList<clsEquipment> tempEquipment2 = new ArrayList<>();
        tempEquipment2.add(new clsEquipment(25, "Computadoras"));
        tempEquipment2.add(new clsEquipment(1, "Proyector"));
        myMetodes.insertClassroom(25, "LaboratorioN2", 2, "Atrás del comedor", tempEquipment2);
        
        ArrayList<clsEquipment> tempEquipment3 = new ArrayList<>();
        tempEquipment3.add(new clsEquipment(23, "Computadoras"));
        tempEquipment3.add(new clsEquipment(1, "Proyector"));
        myMetodes.insertClassroom(23, "Laboratorio MAC", 3, "A la par de las oficinas de la carrera de computación", tempEquipment3);
        
        myMetodes.insertClassroom("Pecera", 1, "Primer piso", 24, true, true);
        myMetodes.insertClassroom("Aula de inglés", 2, "Segundo piso", 27, true, true);
        myMetodes.insertClassroom("Aula grande", 3, "Segundo piso", 35, true, true);
        
        //
        //Subjects insertions
        //
        ArrayList<clsSubject> lstSubject1 = new ArrayList<>();
        lstSubject1.add(new clsTheoricalSubject(4, "Calculo", "www.calculo.com"));
        lstSubject1.add(new clsTheoricalSubject(2, "Filosoficos", "www.filosofia.com"));
        lstSubject1.add(new clsTheoricalSubject(4, "Probabilidades", "www.probabilidades.com"));
        lstSubject1.add(new clsTheoricalSubject(2, "Investigación de Operaciones", "www.io.com"));
        myMetodes.insertSubjects("Letters & Science", lstSubject1);
        
        ArrayList<clsSubject> lstSubject2 = new ArrayList<>();
        lstSubject2.add(new clsPracticalSubject(4, "Sistemas Operativos", "Linux", "Presentaciones"));
        lstSubject2.add(new clsPracticalSubject(4, "Diseño de software", "Windows", "Presentaciones"));
        lstSubject2.add(new clsPracticalSubject(4, "Diseño de Interfaces", "iOS", "Encuestas"));
        lstSubject2.add(new clsPracticalSubject(4, "Estructuras de Datos", "Windows", "Presentaciones"));
        myMetodes.insertSubjects("Computer Engineering", lstSubject2);
        
        //
        //Semester-Subject insertions
        //
        myMetodes.insertSemesterSubject("I", "2013", "Calculo");
        myMetodes.insertSemesterSubject("II", "2013", "Filosoficos");
        myMetodes.insertSemesterSubject("I", "2013", "Probabilidades");
        myMetodes.insertSemesterSubject("II", "2013", "Investigación de Operaciones");
        myMetodes.insertSemesterSubject("I", "2013", "Sistemas Operativos");
        myMetodes.insertSemesterSubject("II", "2013", "Diseño de software");
        myMetodes.insertSemesterSubject("I", "2013", "Diseño de interfaces");
        myMetodes.insertSemesterSubject("II", "2013", "Estructura de Datos");
        
        //
        //Subject-Classroom insertions
        //
        myMetodes.insertSubjectClassroom("I", "2013", "Calculo", "Aula grande");
        myMetodes.insertSubjectClassroom("II", "2013", "Filosoficos", "Pecera");
        myMetodes.insertSubjectClassroom("I", "2013", "Probabilidades", "Aula grande");
        myMetodes.insertSubjectClassroom("II", "2013", "Investigación de Operaciones", "Pecera");
        myMetodes.insertSubjectClassroom("I", "2013", "Sistemas Operativos", "LaboratorioN2");
        myMetodes.insertSubjectClassroom("II", "2013", "Diseño de software", "LaboratorioN1");
        myMetodes.insertSubjectClassroom("I", "2013", "Diseño de interfaces", "Laboratorio MAC");
        myMetodes.insertSubjectClassroom("II", "2013", "Estructura de Datos", "LaboratorioN1");
        
        //
        //Subject
        //
    }
}
