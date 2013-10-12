/**
 * Classes Package
 */
package pkgClasses;

/**
 * @author Steven Rojas <stvrjs.k12@gmail.com>
 * @version 1.0 (current version number of program)
 * @since 2013-09-21 (the version of the package this class was first added to)
 */
public abstract class clsSubject {

    /**
     * Subject's name
     *
     * @uml.property name="SubjectName"
     */
    private String subjectName;

    /**
     * Getter of the property <tt>SubjectName</tt>
     *
     * @return Returns the subjectName.
     * @uml.property name="SubjectName"
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Setter of the property <tt>SubjectName</tt>
     *
     * @param SubjectName The subjectName to set.
     * @uml.property name="SubjectName"
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    /**
     * Subject's credits
     *
     * @uml.property name="Credits"
     */
    private int credits;

    /**
     * Getter of the property <tt>Credits</tt>
     *
     * @return Returns the credits.
     * @uml.property name="Credits"
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Setter of the property <tt>Credits</tt>
     *
     * @param Credits The credits to set.
     * @uml.property name="Credits"
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
    /**
     * Subject's weekly work time
     *
     * @uml.property name="WeeklyWorkTime"
     */
    private int weeklyWorkTime;

    /**
     * Getter of the property <tt>WeeklyWorkTime</tt>
     *
     * @return Returns the weeklyWorkTime.
     * @uml.property name="WeeklyWorkTime"
     */
    public int getWeeklyWorkTime() {
        return weeklyWorkTime;
    }

    /**
     * Setter of the property <tt>WeeklyWorkTime</tt>
     *
     * @param WeeklyWorkTime The weeklyWorkTime to set.
     * @uml.property name="WeeklyWorkTime"
     */
    public void setWeeklyWorkTime(int weeklyWorkTime) {
        this.weeklyWorkTime = weeklyWorkTime;
    }
    
    /**
     * Subject's schedule
     *
     * @uml.property name="Schedule"
     * @uml.associationEnd multiplicity="(1 1)"
     * inverse="clsSubject:pkgClases.clsSchedule"
     * @uml.association name="has"
     */
    private static clsSchedule schedule;

    /**
     * Getter of the property <tt>Schedule</tt>
     *
     * @return Returns the schedule.
     * @uml.property name="Schedule"
     */
    public clsSchedule getSchedule() {
        return schedule;
    }

    /**
     * Setter of the property <tt>Schedule</tt>
     *
     * @param Schedule The schedule to set.
     * @uml.property name="Schedule"
     */
    public void setSchedule(clsSchedule schedule) {
        this.schedule = schedule;
    }
    /**
     * Subject's classroom
     *
     * @uml.property name="clsClassroom"
     * @uml.associationEnd multiplicity="(1 1)"
     * inverse="clsSubject:pkgClasses.clsClassroom"
     * @uml.association name="in"
     */
    private static clsClassroom classroom;

    /**
     * Getter of the property <tt>clsClassroom</tt>
     *
     * @return Returns the clsClassroom.
     * @uml.property name="clsClassroom"
     */
    public clsClassroom getClsClassroom() {
        return classroom;
    }

    /**
     * Setter of the property <tt>clsClassroom</tt>
     *
     * @param clsClassroom The clsClassroom to set.
     * @uml.property name="clsClassroom"
     */
    public void setClsClassroom(clsClassroom clsClassroom) {
        this.classroom = clsClassroom;
    }

    /**
     * Subject class constructor
     *
     * @param pCredits
     * @param pSubjectName
     * @param pSchool
     */
    public clsSubject(int pCredits, String pSubjectName) {
        credits = pCredits;
        subjectName = pSubjectName;
        weeklyWorkTime = pCredits * 3;
    }
}
