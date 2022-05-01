/**
 * 
 */
package cm.sapelli.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Franck
 *
 */
public class FileUtil {
	/**
	 * Méthode permettant de lire toutes les dates contenus dans le fichier
	 */
	// 
	public static ArrayList<String> readAllDate(String monfichier) {
		ArrayList<String> chaine = new ArrayList<String>(0);
		try {
			BufferedReader fichier = new BufferedReader(new FileReader(monfichier));
			// int i = 0;
			String ligne ;
			// Tantqu'il y a du texte sur une ligne
			while ((ligne = fichier.readLine()) != null)	chaine.add(ligne);
			fichier.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return chaine;
	}

	/**
	 * Méthode permettant de lire tous les mots contenus dans le fichier
	 */
	public static String readLastDate(String monfichier) {
		ArrayList<String> chaine = new ArrayList<String>(0);
		String ligne  = "";
		try {
			BufferedReader fichier = new BufferedReader(new FileReader(monfichier));
			// Tantqu'il y a du texte sur une ligne
			while ((ligne = fichier.readLine()) != null)	chaine.add(ligne);
			if(chaine.size() > 0)    ligne = chaine.get(chaine.size()-1);
			fichier.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ligne;
	}

	/**
	 * Méthode permettant d'écrire une date dans le fichier
	 * @param monfichier
	 * @param newDate
	 */
	public static void writeLastDate(String monfichier, String newDate) {
		String texte = "";		
		ArrayList<String> listeLigne = readAllDate(monfichier);
		int i = 0;
		while(listeLigne.size() > i)	texte += listeLigne.get(i++) + "\n";
		texte += newDate;
		try {
            // Instanciation de l'objet
			BufferedWriter out = new BufferedWriter(new FileWriter(new File(monfichier)));
            try {
                 // Utilisation de l'objet
                 out.write(texte);
            } finally {
                 // Libération de la ressource exploitée par l'objet
                 out.close();
            }
       } catch (IOException e) {
            e.printStackTrace();
       }
	}
	
	/**
	 * 
	 * @param chaine
	 * @return
	 */
	public static String traiterChaine(String chaine) {
		if(chaine.contains("'")) {
			chaine += ";";
			int i = 0;
			String text = "";
			while(chaine.charAt(i) != ';'){
				if(chaine.charAt(i) != '\'')	text += chaine.charAt(i);
				else	text += chaine.charAt(i) + "'";
				i++;
			}
			return text;
		}
		return chaine;
	}
}