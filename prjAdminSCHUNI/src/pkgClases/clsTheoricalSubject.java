/**
 * Classes Package
 */
package pkgClases;


/**
 * @author      Steven Rojas <stvrjs.k12@gmail.com>
 * @version     1.0                 (current version number of program)
 * @since       2013-09-21          (the version of the package this class was first added to)
 */
public class clsTheoricalSubject extends clsSubject {

	/**
	 * Theorical Subject's website
	 * @uml.property  name="Website"
	 */
	private String website;

	/**
	 * Getter of the property <tt>Website</tt>
	 * @return  Returns the website.
	 * @uml.property  name="Website"
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * Setter of the property <tt>Website</tt>
	 * @param Website  The website to set.
	 * @uml.property  name="Website"
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	
	/**
	 * Theorical class constructor
	 * 
	 * @param pCredits
	 * @param pSubjectName
	 * @param pWebsite
	 */
	public clsTheoricalSubject(int pCredits, String pSubjectName, String pWebsite){
		super(pCredits, pSubjectName);
		website = pWebsite;
	}
}
