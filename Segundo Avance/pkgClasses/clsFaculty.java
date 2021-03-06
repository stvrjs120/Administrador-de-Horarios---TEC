/**
 * Classes Package
 */
package pkgClasses;

/**
 * @author      Steven Rojas <stvrjs.k12@gmail.com>
 * @version     1.0                 (current version number of program)
 * @since       2013-09-21          (the version of the package this class was first added to)
 */
public class clsFaculty {

	/** 
	 * Faculty's name
	 * @uml.property name="FacultyName"
	 */
	private String facultyName;

	/** 
	 * Getter of the property <tt>FacultyName</tt>
	 * @return  Returns the facultyName.
	 * @uml.property  name="FacultyName"
	 */
	public String getFacultyName() {
		return facultyName;
	}

	/** 
	 * Setter of the property <tt>FacultyName</tt>
	 * @param FacultyName  The facultyName to set.
	 * @uml.property  name="FacultyName"
	 */
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	
	/**
	 * Faculty class constructor
	 * 
	 * @param pFacultyName
	 */
	public clsFaculty(String pFacultyName){
		facultyName = pFacultyName;
	}

}
