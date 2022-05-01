/**
 * 
 */
package cm.sapelli.utils;

/**
 * @author User
 *
 */
public class RequeteUtil {
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String getNewAssure(String date) {
		if(!date.equals("")) 
			// Récupération dans la bd de tous les assurés dont la date de création est postérieure à la date en paramètre
			return "SELECT NUM_ASSU, TRIM(NOM_ASSU)||' '||TRIM(PRENOM_ASSU) NOM_ASSU, CODE_CENTRE_ASSU, TEL_ASSU, " + 
		     	   "TO_CHAR(DATE_NAISS_ASSU, 'YYYY-MM-DD HH24:MI:SS') DATE_NAISS_ASSU, TO_CHAR(DATE_CREA_ASSU, " + 
		     	   "'YYYY-MM-DD HH24:MI:SS') DATE_CREA_ASSU, TO_CHAR(DATE_DERN_MODIF_ASSU, 'YYYY-MM-DD HH24:MI:SS') " + 
		     	   "DATE_DERN_MODIF_ASSU FROM jassure WHERE DATE_CREA_ASSU >= TO_DATE('" + date + "', 'YYYY-MM-DD HH24:MI:SS')" +
		     	   " AND NOM_ASSU is not null";
		else   return "";
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String getFormerAssure(String date) {
		if(!date.equals("")) 
			// Récupération dans la bd  dont la date de dernière modification est également postérieure à la date en paramètre
			return "SELECT NUM_ASSU, TRIM(NOM_ASSU)||' '||TRIM(PRENOM_ASSU) NOM_ASSU, CODE_CENTRE_ASSU, TEL_ASSU, " + 
			   	   "TO_CHAR(DATE_NAISS_ASSU, 'YYYY-MM-DD HH24:MI:SS') DATE_NAISS_ASSU, TO_CHAR(DATE_CREA_ASSU, " + 
			   	   "'YYYY-MM-DD HH24:MI:SS') DATE_CREA_ASSU, TO_CHAR(DATE_DERN_MODIF_ASSU, 'YYYY-MM-DD HH24:MI:SS') " + 
			   	   "DATE_DERN_MODIF_ASSU FROM jassure WHERE DATE_CREA_ASSU < TO_DATE('" + date + "', " + 
			   	   "'YYYY-MM-DD HH24:MI:SS') AND DATE_DERN_MODIF_ASSU >= TO_DATE('" + date + 
			   	   "', 'YYYY-MM-DD HH24:MI:SS') AND NOM_ASSU is not null";
		else   return "";
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String getNewEmployeurs(String date) {
		if(!date.equals("")) 
			// Récupération dans la bd de tous les assurés dont la date de création est postérieure à la date en paramètre
			return "SELECT NUM_EMPLOYEUR, RAISON_SOCIALE, CODE_CENTRE, TEL, TO_CHAR(DATE_IMMAT, 'YYYY-MM-DD HH24:MI:SS')" + 
			   	   " DATE_IMMAT, TO_CHAR(DATE_DERN_MODIF, 'YYYY-MM-DD HH24:MI:SS') DATE_DERN_MODIF FROM jemployeur WHERE " + 
			   	   "DATE_IMMAT >= TO_DATE('" + date + "', 'YYYY-MM-DD HH24:MI:SS') AND RAISON_SOCIALE is not null";
		else   return "";
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String getFormerEmployeurs(String date) {
		if(!date.equals("")) 
			// Récupération dans la bd  dont la date de dernière modification est également postérieure à la date en paramètre
			return "SELECT NUM_EMPLOYEUR, RAISON_SOCIALE, CODE_CENTRE, TEL, TO_CHAR(DATE_IMMAT, 'YYYY-MM-DD HH24:MI:SS')" + 
	   	   		   " DATE_IMMAT, TO_CHAR(DATE_DERN_MODIF, 'YYYY-MM-DD HH24:MI:SS') DATE_DERN_MODIF FROM jemployeur WHERE" + 
			   	   " DATE_IMMAT < TO_DATE('" + date + "', 'YYYY-MM-DD HH24:MI:SS') AND DATE_DERN_MODIF >= TO_DATE('" + date + 
			       "', 'YYYY-MM-DD HH24:MI:SS') AND RAISON_SOCIALE is not null";
		else   return "";
	}
}