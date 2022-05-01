/**
 * 
 */
package cm.sapelli.utils;

import cm.sapelli.dao.table_bd.ASSURE_VOLONTAIREDAO;
import cm.sapelli.dao.table_bd.JASSUREDAO;
import cm.sapelli.dao.table_bd.JEMPLOYEURDAO;
import cm.sapelli.model.db.DataBaseObject;

/**
 * @author User
 *
 */
public class DataBaseObjetUtil {

	/**
	 * 
	 */
	public DataBaseObjetUtil() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param jAssureOracle
	 * @param jEmployeurOracle
	 * @param cheminFichier
	 * @param assureVolontaireDao
	 */
	@SuppressWarnings("unused")
	public static void chargerAssureVolontaire(JASSUREDAO jAssureOracle, JEMPLOYEURDAO jEmployeurOracle, 
											   String cheminFichier, ASSURE_VOLONTAIREDAO assureVolontaireDao) {
		// TODO Auto-generated method stub
		String dateFichier = FileUtil.readLastDate(cheminFichier);
		String chaineDate = jAssureOracle.getDate("");
		DataBaseObject dbNew = null, dbFormer = null;
		// Récupération des objets de jassure de Oracle
		dbNew = new DataBaseObject(jAssureOracle, jEmployeurOracle, RequeteUtil.getNewAssure(dateFichier), 
				                   RequeteUtil.getNewEmployeurs(dateFichier), "");
		dbFormer = new DataBaseObject(jAssureOracle, jEmployeurOracle, RequeteUtil.getFormerAssure(dateFichier), 
									  RequeteUtil.getFormerEmployeurs(dateFichier), "");
		System.out.println("Début de l'enrégistrement des données de Oracle dans MySQL.");
		if(dbNew != null)	dbNew.insererNewData(assureVolontaireDao);
		else   System.out.println("Aucune nouvelle données à insérer !!!");
		if(dbFormer != null)	dbFormer.updateFormerData(assureVolontaireDao);
		else   System.out.println("Aucune données à mettre à jour !!!");
		// Méthode permettant d'enregistrer la date de synchronisation des données dans un fichier
		FileUtil.writeLastDate(cheminFichier, chaineDate);
		System.out.println("Fin de la sauvegarde des assurés et des employeurs de Oracle dans MySQL.");
		String str = chaineDate.substring(0, 10) + " à " + chaineDate.substring(11, chaineDate.length()) + 
				     " ::   Nombre d'assurés crés == " + StatisticUtil.getNombreCreationAss();
		str += "\n                           Nombre d'assurés mise-à-jour == " + StatisticUtil.getNombreUpdateAss();
		str += "\n                           Nombre d'employeurs crés == " + StatisticUtil.getNombreCreationEmp();
		str += "\n                           Nombre d'employeurs mise-à-jour == " + StatisticUtil.getNombreUpdateEmp();
		str += ";\n\n";
		FileUtil.writeLastDate("doc/fichier_statistiques.txt", str);
		str += "Exécution de la synchronisation des bases de données du :\n" + str;
		// MailUtil.sendEmail(serveurSTMP, portSTMP, from, to, sujet, message);
		// MailUtil.sendEmail("smtp.gmail.com", 465, "de@gm.com", "ae@rmail.com", "invitation", "mon message");
		// MailUtil.sendEmail("eric.ndjeng@cnps.cm", "invitation", "mon message");  martial.mayana@cnps.cm
		MailUtil.sendEmail("armel.abena@cnps.cm", "Synchronisation des bases de données", str);
	}
}