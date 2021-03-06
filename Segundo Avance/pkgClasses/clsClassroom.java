/**
 * Classes Package
 */
package pkgClasses;

/**
 * @author      Steven Rojas <stvrjs.k12@gmail.com>
 * @version     1.0                 (current version number of program)
 * @since       2013-09-21          (the version of the package this class was first added to)
 */
public abstract class clsClassroom {

	/** 
	 * Classroom's name
	 * @uml.property name="ClassroomName"
	 */
	private String classroomName;

	/** 
	 * Getter of the property <tt>ClassroomName</tt>
	 * @return  Returns the classroomName.
	 * @uml.property  name="ClassroomName"
	 */
	public String getClassroomName() {
		return classroomName;
	}

	/** 
	 * Setter of the property <tt>ClassroomName</tt>
	 * @param ClassroomName  The classroomName to set.
	 * @uml.property  name="ClassroomName"
	 */
	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	/** 
	 * Classroom's number
	 * @uml.property name="ClassroomNumber"
	 */
	private int classroomNumber;

	/** 
	 * Getter of the property <tt>ClassroomNumber</tt>
	 * @return  Returns the classroomNumber.
	 * @uml.property  name="ClassroomNumber"
	 */
	public int getClassroomNumber() {
		return classroomNumber;
	}

	/** 
	 * Classroom's location
	 * @uml.property name="Location"
	 */
	private String location;

	/** 
	 * Getter of the property <tt>Location</tt>
	 * @return  Returns the location.
	 * @uml.property  name="Location"
	 */
	public String getLocation() {
		return location;
	}

	/** 
	 * Setter of the property <tt>Location</tt>
	 * @param Location  The location to set.
	 * @uml.property  name="Location"
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/** 
	 * Setter of the property <tt>ClassroomNumber</tt>
	 * @param ClassroomNumber  The classroomNumber to set.
	 * @uml.property  name="ClassroomNumber"
	 */
	public void setClassroomNumber(int classroomNumber) {
		this.classroomNumber = classroomNumber;
	}

	/** 
	 * Classroom's capacity
	 * @uml.property name="Capacity"
	 */
	private int capacity;

	/** 
	 * Getter of the property <tt>Capacity</tt>
	 * @return  Returns the capacity.
	 * @uml.property  name="Capacity"
	 */
	public int getCapacity() {
		return capacity;
	}

	/** 
	 * Setter of the property <tt>Capacity</tt>
	 * @param Capacity  The capacity to set.
	 * @uml.property  name="Capacity"
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	
	/**
	 * Classroom class constructor
	 * 
	 * @param pCapacity
	 * @param pClassroomName
	 * @param pClassroomNumber
	 * @param pLocation
	 */
	public clsClassroom(int pCapacity, String pClassroomName, int pClassroomNumber, String pLocation){
		capacity = pCapacity;
		classroomName = pClassroomName;
		classroomNumber = pClassroomNumber;
		location = pLocation;
	}

}
