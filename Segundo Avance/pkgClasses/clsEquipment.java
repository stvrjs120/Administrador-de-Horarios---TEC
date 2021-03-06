/**
 * Classes Package
 */
package pkgClasses;

/**
 * @author      Steven Rojas <stvrjs.k12@gmail.com>
 * @version     1.0                 (current version number of program)
 * @since       2013-09-21          (the version of the package this class was first added to)
 */
public class clsEquipment {

	/** 
	 * Equipment's amount
	 * @uml.property name="Amount"
	 */
	private int amount;

	/** 
	 * Getter of the property <tt>Amount</tt>
	 * @return  Returns the amount.
	 * @uml.property  name="Amount"
	 */
	public int getAmount() {
		return amount;
	}

	/** 
	 * Setter of the property <tt>Amount</tt>
	 * @param Amount  The amount to set.
	 * @uml.property  name="Amount"
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/**
	 * Equipment's name
	 * @uml.property  name="EquipmentName"
	 */
	private String equipmentName;

	/** 
	 * Getter of the property <tt>Equipment</tt>
	 * @return  Returns the equipment.
	 * @uml.property  name="EquipmentName"
	 */
	public String getEquipmentName() {
		return equipmentName;
	}

	/** 
	 * Setter of the property <tt>Equipment</tt>
	 * @param Equipment  The equipment to set.
	 * @uml.property  name="EquipmentName"
	 */
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	
	/** 
	 * Equipment class constructor
	 * 
	 * @param pAmount
	 * @param pEquipment
	 */
	public clsEquipment(int pAmount, String pEquipmentName){
		amount = pAmount;
		equipmentName = pEquipmentName;
	}
}
