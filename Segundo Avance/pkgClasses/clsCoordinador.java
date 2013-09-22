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
public class clsCoordinador extends clsUser {

	/** 
	 * @uml.property name="lstSemester"
	 * @uml.associationEnd multiplicity="(0 -1)" ordering="true" inverse="clsCoordinador:pkgClasses.clsSemester"
	 * @uml.association name="creates"
	 */
	private ArrayList<clsSemester> lstSemester;

	/**
	 * Getter of the property <tt>lstSemester</tt>
	 * @return  Returns the lstSemester.
	 * @uml.property  name="lstSemester"
	 */
	public ArrayList<clsSemester> getLstSemester() {
		return lstSemester;
	}

	/**
	 * Setter of the property <tt>lstSemester</tt>
	 * @param lstSemester  the lstSemester to set.
	 * @uml.property  name="lstSemester"
	 */
	public void setLstSemester(ArrayList<clsSemester> lstSemester) {
		this.lstSemester = lstSemester;
	}
	
	/**
	 * Coordinator class constructor
	 * 
	 * @param pID
	 * @param pName
	 * @param pPassword
	 */
	public clsCoordinador(String pID, String pName, String pPassword){
		super(pID, pName, pPassword);
	}
}
