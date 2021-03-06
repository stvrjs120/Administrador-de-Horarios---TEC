/**
 * Classes Package
 */
package pkgClasses;

/**
 * @author Steven Rojas <stvrjs.k12@gmail.com>
 * @version 1.0 (current version number of program)
 * @since 2013-09-21 (the version of the package this class was first added to)
 */
public class clsSchedule {

    /**
     * Schedule's day
     *
     * @uml.property name="Day"
     */
    private String day;

    /**
     * Getter of the property <tt>Day</tt>
     *
     * @return Returns the day.
     * @uml.property name="Day"
     */
    public String getDay() {
        return day;
    }

    /**
     * Setter of the property <tt>Day</tt>
     *
     * @param Day The day to set.
     * @uml.property name="Day"
     */
    public void setDay(String day) {
        this.day = day;
    }
    /**
     * Schedule starting at [date]
     *
     * @uml.property name="StarSchedule"
     */
    private String starSchedule;

    /**
     * Getter of the property <tt>StarSchedule</tt>
     *
     * @return Returns the starSchedule.
     * @uml.property name="StarSchedule"
     */
    public String getStarSchedule() {
        return starSchedule;
    }

    /**
     * Setter of the property <tt>StarSchedule</tt>
     *
     * @param StarSchedule The starSchedule to set.
     * @uml.property name="StarSchedule"
     */
    public void setStarSchedule(String starSchedule) {
        this.starSchedule = starSchedule;
    }
    /**
     * Schedule ending at [date]
     *
     * @uml.property name="endSchedule"
     */
    private String endSchedule;

    /**
     * Getter of the property <tt>endSchedule</tt>
     *
     * @return Returns the endSchedule.
     * @uml.property name="endSchedule"
     */
    public String getEndSchedule() {
        return endSchedule;
    }

    /**
     * Setter of the property <tt>endSchedule</tt>
     *
     * @param endSchedule The endSchedule to set.
     * @uml.property name="endSchedule"
     */
    public void setEndSchedule(String endSchedule) {
        this.endSchedule = endSchedule;
    }

    /**
     * Schedule class constructor
     *
     * @param pDay Schedule's day
     * @param pStartSchedule Schedule's start at
     * @param pEndSchedule Schedule's end at
     */
    public clsSchedule(String pDay, String pStartSchedule, String pEndSchedule) {
        day = pDay;
        starSchedule = pStartSchedule;
        endSchedule = pEndSchedule;
    }
}
