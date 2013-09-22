/**
 * Classes Package
 */
package pkgClasses;

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
	 * Subject's weekly work time
	 * @uml.property  name="WeeklyWorkTime"
	 */
	private int weeklyWorkTime;

	/**
	 * Getter of the property <tt>WeeklyWorkTime</tt>
	 * @return  Returns the weeklyWorkTime.
	 * @uml.property  name="WeeklyWorkTime"
	 */
	public int getWeeklyWorkTime() {
		return weeklyWorkTime;
	}

	/**
	 * Setter of the property <tt>WeeklyWorkTime</tt>
	 * @param WeeklyWorkTime  The weeklyWorkTime to set.
	 * @uml.property  name="WeeklyWorkTime"
	 */
	public void setWeeklyWorkTime(int weeklyWorkTime) {
		this.weeklyWorkTime = weeklyWorkTime;
	}
	
	/** 
	 * Subject's school
	 * @uml.property name="School"
	 */
	private String school = "Computer Engineering";

	/** 
	 * Getter of the property <tt>School</tt>
	 * @return  Returns the school.
	 * @uml.property  name="School"
	 */
	public String getSchool() {
		return school;
	}

	/** 
	 * Setter of the property <tt>School</tt>
	 * @param School  The school to set.
	 * @uml.property  name="School"
	 */
	public void setSchool(String school) {
		this.school = school;
	}

		
		/** 
		 * Subject class constructor
		 * @param pCredits
		 * @param pSubjectName
		 * @param pSchool
		 */
		public clsSubject(int pCredits, String pSubjectName){
			credits = pCredits;
			subjectName = pSubjectName;
			weeklyWorkTime = pCredits * 3;
		}
}
