/**
 * Classes Package
 */
package pkgClasses;

/**
 * @author Steven Rojas <stvrjs.k12@gmail.com>
 * @version 1.0 (current version number of program)
 * @since 2013-09-21 (the version of the package this class was first added to)
 */
public class clsTeoricalClassroom extends clsClassroom {

    /**
     * Classroom has aircoditioner?
     *
     * @uml.property name="AirConditioner"
     */
    private boolean airConditioner = false;

    /**
     * Getter of the property <tt>AirConditioner</tt>
     *
     * @return Returns the airConditioner.
     * @uml.property name="AirConditioner"
     */
    public boolean isAirConditioner() {
        return airConditioner;
    }

    /**
     * Setter of the property <tt>AirConditioner</tt>
     *
     * @param AirConditioner The airConditioner to set.
     * @uml.property name="AirConditioner"
     */
    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }
    /**
     * Classroom has multimedia?
     *
     * @uml.property name="Multimedia"
     */
    private boolean multimedia = false;

    /**
     * Getter of the property <tt>Multimedia</tt>
     *
     * @return Returns the multimedia.
     * @uml.property name="Multimedia"
     */
    public boolean isMultimedia() {
        return multimedia;
    }

    /**
     * Setter of the property <tt>Multimedia</tt>
     *
     * @param Multimedia The multimedia to set.
     * @uml.property name="Multimedia"
     */
    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }

    /**
     * TeoricalClassroom class constructor
     *
     * @param pClassroomName Teorical Classroom's name
     * @param pClassroomNumber Teorical Classroom's number
     * @param pLocation Teorical Classroom's location
     * @param pCapacity Teorical Classroom's capacity
     * @param pAirConditioner Teorical Classroom's air conditioner
     * @param pMultimedia Teorical Classroom's multimedia
     */
    public clsTeoricalClassroom(String pClassroomName, int pClassroomNumber, String pLocation, int pCapacity, boolean pAirConditioner, boolean pMultimedia) {
        super(pCapacity, pClassroomName, pClassroomNumber, pLocation);
        airConditioner = pAirConditioner;
        multimedia = pMultimedia;
    }
}
