/**
 * Classes Package
 */
package pkgClasses;

/**
 * @author      Steven Rojas <stvrjs.k12@gmail.com>
 * @version     1.0                 (current version number of program)
 * @since       2013-09-21          (the version of the package this class was first added to)
 */
public class clsPracticalSubject extends clsSubject {

	/** 
	 * Practical Subject's support material
	 * @uml.property name="SupportMaterial"
	 */
	private String supportMaterial;

	/** 
	 * Getter of the property <tt>SupportMaterial</tt>
	 * @return  Returns the supportMaterial.
	 * @uml.property  name="SupportMaterial"
	 */
	public String getSupportMaterial() {
		return supportMaterial;
	}

	/** 
	 * Setter of the property <tt>SupportMaterial</tt>
	 * @param SupportMaterial  The supportMaterial to set.
	 * @uml.property  name="SupportMaterial"
	 */
	public void setSupportMaterial(String supportMaterial) {
		this.supportMaterial = supportMaterial;
	}

	/**
	 * Theorical Subject's operative system
	 * @uml.property  name="OperativeSystem"
	 */
	private String operativeSystem;

	/**
	 * Getter of the property <tt>OperativeSystem</tt>
	 * @return  Returns the operativeSystem.
	 * @uml.property  name="OperativeSystem"
	 */
	public String getOperativeSystem() {
		return operativeSystem;
	}

	/**
	 * Setter of the property <tt>OperativeSystem</tt>
	 * @param OperativeSystem  The operativeSystem to set.
	 * @uml.property  name="OperativeSystem"
	 */
	public void setOperativeSystem(String operativeSystem) {
		this.operativeSystem = operativeSystem;
	}
	
	/**
	 * PracticalSubject class constructor;
	 * 
	 * @param pCredits
	 * @param pSubjectName
	 * @param pOperativeSystem
	 * @param pSupportMaterial
	 */
	public clsPracticalSubject(int pCredits, String pSubjectName, String pOperativeSystem, String pSupportMaterial) {
		super(pCredits, pSubjectName);
		operativeSystem = pOperativeSystem;
		supportMaterial = pSupportMaterial;
	}
}
