/**
 * 
 */
package cm.sapelli;

import cm.sapelli.dao.DAOFactory;
import cm.sapelli.dao.table_bd.ASSURE_VOLONTAIREDAO;
import cm.sapelli.dao.table_bd.JASSUREDAO;
import cm.sapelli.dao.table_bd.JEMPLOYEURDAO;
import cm.sapelli.utils.DataBaseObjetUtil;

/**
 * @author User
 *
 */
public class MainClass {
	public static DAOFactory daoFactory = null;
	private JASSUREDAO jAssureDao = null;
	private JEMPLOYEURDAO jEmployeurDao = null;
	private ASSURE_VOLONTAIREDAO assureVolontaireDao = null;
	/**
	 * COnstructeur par défaut de la classe
	 */
	public MainClass() {
		// Initailisation de la variable qui permettra de se connecter à la bd Oracle
		DAOFactory daoFactory = new DAOFactory();
		// récupération de la dernière date de mise-à-jour sur la BD Oracle
		String cheminFichier = "doc/date_update_oracle.txt";
		// On récupère un objet "DAO<JASSURE>" faisant le lien entre la base Oracle et nos objets
		jAssureDao = daoFactory.getJASSUREDAO();
		// On récupère un objet "DAO<JEMPLOYEUR>" faisant le lien entre la base Oracle et nos objets
		jEmployeurDao = daoFactory.getJEMPLOYEURDAO();
		// On récupère un objet "DAO<JEMPLOYEUR>" faisant le lien entre la base Oracle et nos objets
		assureVolontaireDao = daoFactory.getASSURE_VOLONTAIREDAO();
		if((jAssureDao != null) && (jEmployeurDao != null) && (assureVolontaireDao != null)){
			System.out.println("Début de l'approvisionnement de la table assure_volontaire située dans MySQL.");
			// Action permettant de mettre les informations dans la table jassure_volontaire
			DataBaseObjetUtil.chargerAssureVolontaire(jAssureDao, jEmployeurDao, cheminFichier, assureVolontaireDao);
			System.out.println("Fin du traitement de récupération des données contenu dans Oracle.");
		} else	System.out.println("Il existe au moins une connexion à une base de données non établie.");
		// Fermeture de la connexion à Oracle
		daoFactory.endConnectOracle();
		// Fermeture de la connexion à MySQL
		daoFactory.endConnectMySQL();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}
}