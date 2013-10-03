/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prjunisch;

import java.util.ArrayList;
import pkgClasses.clsEquipment;
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
        myMetodes.insertSemester("I", "2013");
        myMetodes.insertSemester("II", "2013");
        
        myMetodes.insertFaculty("Computer Engineering");
        myMetodes.insertFaculty("Letters & Science");
        
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
        
        
    }
}
