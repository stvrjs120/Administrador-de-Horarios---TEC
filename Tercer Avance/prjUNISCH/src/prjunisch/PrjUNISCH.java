/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prjunisch;

import java.util.ArrayList;
import pkgClasses.*;
import pkgMetodes.clsMetodes;

/**
 *
 * @author StvRjs.K12
 */
public class PrjUNISCH {
    
    public static clsMetodes myMetodes = new clsMetodes();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

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
        ArrayList<clsEquipment> tempEquipment = new ArrayList<>();
        tempEquipment.add(new clsEquipment(25, "Computadoras"));
        tempEquipment.add(new clsEquipment(1, "Proyector"));
        myMetodes.insertClassroom(24, "Laboratorio", 1, "Atrás del comedor", tempEquipment);
        
        tempEquipment.clear();
        tempEquipment.add(new clsEquipment(25, "Computadoras"));
        tempEquipment.add(new clsEquipment(1, "Proyector"));
        myMetodes.insertClassroom(24, "Laboratorio", 2, "Atrás del comedor", tempEquipment);
        
        tempEquipment.clear();
        tempEquipment.add(new clsEquipment(25, "Computadoras"));
        tempEquipment.add(new clsEquipment(1, "Proyector"));
        myMetodes.insertClassroom(24, "Laboratorio MAC", 3, "A la par de las oficinas de la carrera de computación", tempEquipment);
        
        myMetodes.insertClassroom("Pecera", 1, "Primer piso", 24, true, true);
        myMetodes.insertClassroom("Aula de inglés", 2, "Segundo piso", 27, true, true);
        myMetodes.insertClassroom("Aula grande", 3, "Segundo piso", 35, true, true);
        
        //
        //Subjects insertions
        //
        ArrayList<clsSubject> lstSubject = new ArrayList<>();
        lstSubject.add(new clsTheoricalSubject(4, "Calculo", "www.calculo.com"));
        lstSubject.add(new clsTheoricalSubject(2, "Filosoficos", "www.filosofia.com"));
        lstSubject.add(new clsTheoricalSubject(4, "Probabilidades", "www.probabilidades.com"));
        lstSubject.add(new clsTheoricalSubject(2, "Investigación de Operaciones", "www.io.com"));
        myMetodes.insertSubjects("Letters & Science", lstSubject);
        
        lstSubject.clear();
        lstSubject.add(new clsPracticalSubject(4, "Sistemas Operativos", "Linux", "Presentaciones"));
        lstSubject.add(new clsPracticalSubject(4, "Diseño de software", "Windows", "Presentaciones"));
        lstSubject.add(new clsPracticalSubject(4, "Diseño de Interfaces", "iOS", "Encuestas"));
        lstSubject.add(new clsPracticalSubject(4, "Estructuras de Datos", "Windows", "Presentaciones"));
        myMetodes.insertSubjects("Computer Engineering", lstSubject);
        
        //
        //Subject-classroom insertions
        //
        
    }
}
