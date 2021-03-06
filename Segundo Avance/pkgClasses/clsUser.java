/**
 * Classes Package
 */
package pkgClasses;

/**
 * @author      Steven Rojas <stvrjs.k12@gmail.com>
 * @version     1.0                 (current version number of program)
 * @since       2013-09-21          (the version of the package this class was first added to)
 */
public abstract class clsUser {

	/** 
	 * User's ID
	 * @uml.property name="ID"
	 */
	private String id;

	/** 
	 * Getter of the property <tt>ID</tt>
	 * @return  Returns the id.
	 * @uml.property  name="ID"
	 */
	public String getID() {
		return id;
	}

	/** 
	 * Setter of the property <tt>ID</tt>
	 * @param ID  The id to set.
	 * @uml.property  name="ID"
	 */
	public void setID(String id) {
		this.id = id;
	}

	/** 
	 * User's name
	 * @uml.property name="Name"
	 */
	private String name;

	/** 
	 * Getter of the property <tt>Name</tt>
	 * @return  Returns the name.
	 * @uml.property  name="Name"
	 */
	public String getName() {
		return name;
	}

	/** 
	 * Setter of the property <tt>Name</tt>
	 * @param Name  The name to set.
	 * @uml.property  name="Name"
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * User's password
	 * @uml.property name="Password"
	 */
	private String password;

	/** 
	 * Getter of the property <tt>Password</tt>
	 * @return  Returns the password.
	 * @uml.property  name="Password"
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * Setter of the property <tt>Password</tt>
	 * @param Password  The password to set.
	 * @uml.property  name="Password"
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * User class constructor
	 * 
	 * @param pid
	 * @param pName
	 * @param pPassword
	 */
	public clsUser(String pid, String pName, String pPassword){
		id = pid;
		name = pName;
		password = pPassword;
	}

}
