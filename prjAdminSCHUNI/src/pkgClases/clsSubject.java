/**
 * Classes Package
 */
package pkgClases;

/**
 * @author      Steven Rojas <stvrjs.k12@gmail.com>
 * @version     1.0                 (current version number of program)
 * @since       2013-09-21          (the version of the package this class was first added to)
 */
public abstract class clsSubject {

	/** 
	 * Subject's name
	 * @uml.property name="SubjectName"
	 */
	private String subjectName;

	/** 
	 * Getter of the property <tt>SubjectName</tt>
	 * @return  Returns the subjectName.
	 * @uml.property  name="SubjectName"
	 */
	public String getSubjectName() {
		return subjectName;
	}

	/** 
	 * Setter of the property <tt>SubjectName</tt>
	 * @param SubjectName  The subjectName to set.
	 * @uml.property  name="SubjectName"
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * Subject's credits
	 * @uml.property  name="Credits"
	 */
	private int credits;

	/**
	 * Getter of the property <tt>Credits</tt>
	 * @return  Returns the credits.
	 * @uml.property  name="Credits"
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * Setter of the property <tt>Credits</tt>
	 * @param Credits  The credits to set.
	 * @uml.property  name="Credits"
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	/**
	 * Subject class constructor
	 * 
	 * @param pCredits
	 * @param pSubjectName
	 */
	public clsSubject(int pCredits, String pSubjectName){
		credits = pCredits;
		subjectName = pSubjectName;
	}

}
