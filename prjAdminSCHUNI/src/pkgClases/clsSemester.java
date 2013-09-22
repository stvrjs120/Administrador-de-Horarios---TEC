/**
 * Classes Package
 */
package pkgClases;

/**
 * @author      Steven Rojas <stvrjs.k12@gmail.com>
 * @version     1.0                 (current version number of program)
 * @since       2013-09-21          (the version of the package this class was first added to)
 */
public class clsSemester {

	/** 
	 * Semester's number
	 * @uml.property name="SemesterNumber"
	 */
	private int semesterNumber;

	/** 
	 * Getter of the property <tt>SemesterNumber</tt>
	 * @return  Returns the semesterNumber.
	 * @uml.property  name="SemesterNumber"
	 */
	public int getSemesterNumber() {
		return semesterNumber;
	}

	/** 
	 * Setter of the property <tt>SemesterNumber</tt>
	 * @param SemesterNumber  The semesterNumber to set.
	 * @uml.property  name="SemesterNumber"
	 */
	public void setSemesterNumber(int semesterNumber) {
		this.semesterNumber = semesterNumber;
	}
	
	/**
	 * Semester class constructor
	 * 
	 * @param pSemesterNumber
	 */
	public clsSemester(int pSemesterNumber){
		semesterNumber = pSemesterNumber;
	}

}
