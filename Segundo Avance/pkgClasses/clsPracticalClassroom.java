/**
 * Classes Package
 */
package pkgClasses;

import java.util.ArrayList;


/**
 * @author      Steven Rojas <stvrjs.k12@gmail.com>
 * @version     1.0                 (current version number of program)
 * @since       2013-09-21          (the version of the package this class was first added to)
 */
public class clsPracticalClassroom extends clsClassroom {

	/**
	 * @uml.property  name="lstEquipment"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="clsPracticalClassroom:pkgClases.clsEquipment"
	 * @uml.association  name="has"
	 */
	private ArrayList<clsEquipment> lstEquipment;

	/**
	 * Getter of the property <tt>lstEquipment</tt>
	 * @return  Returns the lstEquipment.
	 * @uml.property  name="lstEquipment"
	 */
	public ArrayList<clsEquipment> getLstEquipment() {
		return lstEquipment;
	}

	/**
	 * Returns the element at the specified position in this list.
	 * @param index  index of element to return.
	 * @return  the element at the specified position in this list.
	 * @see java.util.List#get(int)
	 * @uml.property  name="lstEquipment"
	 */
	public clsEquipment getLstEquipment(int i) {
		return (clsEquipment) lstEquipment.get(i);
	}

	/**
	 * Setter of the property <tt>lstEquipment</tt>
	 * @param lstEquipment  the lstEquipment to set.
	 * @uml.property  name="lstEquipment"
	 */
	public void setLstEquipment(ArrayList<clsEquipment> lstEquipment) {
		this.lstEquipment = lstEquipment;
	}
	
	/**
	 * PracticalClassroom class constructor
	 * 
	 * @param pCapacity
	 * @param pClassroomName
	 * @param pClassroomNumber
	 * @param pLocation
	 */
	public clsPracticalClassroom(int pCapacity, String pClassroomName, int pClassroomNumber, String pLocation) {
		super(pCapacity, pClassroomName, pClassroomNumber, pLocation);
	}
}
