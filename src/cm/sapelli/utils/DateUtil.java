/**
 * 
 */
package cm.sapelli.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author User
 *
 */
public class DateUtil {
	
	/**
	 * Méthode permettant de retourner la date du fichier en paramètre
	 * @param chaine est la chaine de provenance de la date
	 * @return une date
	 */
	public static Date getDate(String chaine){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		if(chaine.equals(""))	chaine = formatter.format(new Date());
		try {
			return (Date) formatter.parse(chaine);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	 * @param dateLettre
	 * @return
	 */
	public static String formaterDate(String dateLettre){
		ArrayList<String> listElt = new ArrayList<String>(0);
		dateLettre += ";";
		int i = 0;
		String text = "";
		while(dateLettre.charAt(i) != ';'){
			if(dateLettre.charAt(i) != ' ')	    text += dateLettre.charAt(i);
			else {
				listElt.add(text);
				text = "";
			}
			i++;
		}
		listElt.add(text);
		switch(listElt.get(1)){
			case "Jan":	   text += "-01";    break;
			case "Feb":	   text += "-02";    break;
			case "Mar":	   text += "-03";    break;
			case "Apr":	   text += "-04";    break;
			case "May":	   text += "-05";    break;
			case "Jun":	   text += "-06";    break;
			case "Jul":	   text += "-07";    break;
			case "Aug":	   text += "-08";    break;
			case "Sep":	   text += "-09";    break;
			case "Oct":	   text += "-10";    break;
			case "Nov":	   text += "-11";    break;
			case "Dec":	   text += "-12";    break;
		}
		text += "-" + listElt.get(2);
		// text += " " + listElt.get(3);
		return text;
	}
}