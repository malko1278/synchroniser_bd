/**
 * 
 */
package cm.sapelli.utils;

/**
 * @author User
 *
 */
public class StatisticUtil {
	private static int nombreCreationAss = 0;
	private static int nombreUpdateAss = 0;
	private static int nombreCreationEmp = 0;
	private static int nombreUpdateEmp = 0;
	
	/**
	 * @return the nombreCreation
	 */
	public static int getNombreCreationAss() {
		return nombreCreationAss;
	}
	/**
	 * @param nombreCreation the nombreCreation to set
	 */
	public static void setNombreCreationAss(int nombreCreation) {
		StatisticUtil.nombreCreationAss = nombreCreation;
	}
	/**
	 * @return the nombreCreation incrémenté
	 */
	public static int incrementNombreCreationAss() {
		return nombreCreationAss++;
	}
	/**
	 * @return the nombreCreation décrémenté
	 */
	public static int decrementNombreCreationAss() {
		return nombreCreationAss--;
	}
	/**
	 * @return the nombreUpdate
	 */
	public static int getNombreUpdateAss() {
		return nombreUpdateAss;
	}
	/**
	 * @param nombreUpdate the nombreUpdate to set
	 */
	public static void setNombreUpdateAss(int nombreUpdate) {
		StatisticUtil.nombreUpdateAss = nombreUpdate;
	}
	/**
	 * @return the nombreUpdate incrémenté
	 */
	public static int incrementNombreUpdateAss() {
		return nombreUpdateAss++;
	}
	/**
	 * @return the nombreUpdate décrémenté
	 */
	public static int decrementNombreUpdateAss() {
		return nombreUpdateAss--;
	}
	/**
	 * @return the nombreCreationEmp
	 */
	public static int getNombreCreationEmp() {
		return nombreCreationEmp;
	}
	/**
	 * @param nombreCreationEmp the nombreCreationEmp to set
	 */
	public static void setNombreCreationEmp(int nombreCreationEmp) {
		StatisticUtil.nombreCreationEmp = nombreCreationEmp;
	}
	/**
	 * @return the nombreCreation incrémenté
	 */
	public static int incrementNombreCreationEmp() {
		return nombreCreationEmp++;
	}
	/**
	 * @return the nombreCreation décrémenté
	 */
	public static int decrementNombreCreationEmp() {
		return nombreCreationEmp--;
	}
	/**
	 * @return the nombreUpdateEmp
	 */
	public static int getNombreUpdateEmp() {
		return nombreUpdateEmp;
	}
	/**
	 * @param nombreUpdateEmp the nombreUpdateEmp to set
	 */
	public static void setNombreUpdateEmp(int nombreUpdateEmp) {
		StatisticUtil.nombreUpdateEmp = nombreUpdateEmp;
	}
	/**
	 * @return the nombreUpdate incrémenté
	 */
	public static int incrementNombreUpdateEmp() {
		return nombreUpdateEmp++;
	}
	/**
	 * @return the nombreUpdate décrémenté
	 */
	public static int decrementNombreUpdateEmp() {
		return nombreUpdateEmp--;
	}
}