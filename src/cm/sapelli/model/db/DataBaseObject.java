/**
 * 
 */
package cm.sapelli.model.db;

import java.util.ArrayList;

import cm.sapelli.dao.DAO;
import cm.sapelli.dao.table_bd.ASSURE_VOLONTAIREDAO;
import cm.sapelli.model.JASSURE;
import cm.sapelli.model.JEMPLOYEUR;

/**
 * @author User
 * 
 */
public class DataBaseObject {
	private ArrayList<JASSURE> listeJASSURE;
	private ArrayList<JEMPLOYEUR> listeJEMPLOYEUR;

	/**
	 * 
	 */
	public DataBaseObject() {
		super();
		// TODO Auto-generated constructor stub
		this.listeJASSURE = new ArrayList<JASSURE>(0);
		this.listeJEMPLOYEUR = new ArrayList<JEMPLOYEUR>(0);
	}

	/**
	 * @param listeJASSURE
	 * @param listeJEMPLOYEUR
	 */
	public DataBaseObject(ArrayList<JASSURE> listeJASSURE, ArrayList<JEMPLOYEUR> listeJEMPLOYEUR) {
		super();
		this.listeJASSURE = listeJASSURE;
		this.listeJEMPLOYEUR = listeJEMPLOYEUR;
	}

	/**
	 * 
	 * @param jASSUREDao
	 * @param jEMPLOYEURDao
	 * @param date
	 * @param end
	 */
	public DataBaseObject(DAO<JASSURE> jASSUREDao, DAO<JEMPLOYEUR> jEMPLOYEURDao, String reketOne, String reketTwo, String end) {
		super();
		// Si la requete de r�cup�rations des assur�s est parfaitement constitu�e
		if(!reketOne.equals("")) {
			// System.out.println(reketOne);
			this.listeJASSURE = jASSUREDao.findByDate(reketOne, end, false);
			// System.out.println("Le nombre d'assur�s 1 == " + this.listeJASSURE.size());
		} else	System.out.println("Date de r�cup�ration des assur�s inconnue !!!");
		// Si la requete de r�cup�rations des employeurs est parfaitement constitu�e
		if(!reketTwo.equals("")) {
			// System.out.println(reketTwo);
			this.listeJEMPLOYEUR = jEMPLOYEURDao.findByDate(reketTwo, end, false);
			// System.out.println("Le nombre d'employeurs 1 == " + this.listeJEMPLOYEUR.size());
		} else	System.out.println("Date de r�cup�ration des employeurs inconnue !!!");
	}

	/**
	 * @return the listeJASSURE
	 */
	public ArrayList<JASSURE> getListeJASSURE() {
		return listeJASSURE;
	}

	/**
	 * @param listeJASSURE the listeJASSURE to set
	 */
	public void setListeJASSURE(ArrayList<JASSURE> listeJASSURE) {
		this.listeJASSURE = listeJASSURE;
	}

	/**
	 * @param listeJASSURE the listeJASSURE to set
	 */
	public void addJASSURE(ArrayList<JASSURE> listeJASSURE) {
		for(int i = 0; i < listeJASSURE.size(); i++)   this.listeJASSURE.add(listeJASSURE.get(i));
	}

	/**
	 * @return the listeJEMPLOYEUR
	 */
	public ArrayList<JEMPLOYEUR> getListeJEMPLOYEUR() {
		return listeJEMPLOYEUR;
	}

	/**
	 * @param listeJEMPLOYEUR the listeJEMPLOYEUR to set
	 */
	public void setListeJEMPLOYEUR(ArrayList<JEMPLOYEUR> listeJEMPLOYEUR) {
		this.listeJEMPLOYEUR = listeJEMPLOYEUR;
	}

	/**
	 * @param listeJEMPLOYEUR the listeJEMPLOYEUR to set
	 */
	public void addJEMPLOYEUR(ArrayList<JEMPLOYEUR> listeJEMPLOYEUR) {
		for(int i = 0; i < listeJEMPLOYEUR.size(); i++)   this.listeJEMPLOYEUR.add(listeJEMPLOYEUR.get(i));
	}
	
	/**
	 * 
	 * @param assureVolontaire
	 */
	public void insererNewData(ASSURE_VOLONTAIREDAO assureVolontaire) {
		// TODO Auto-generated method stub
  		System.out.println("Insertion des nouveaux assur�s de Oracle dans MySQL.");
		for(int i = 0; i < this.listeJASSURE.size(); i++) {
			try{
				// Action permettant d'enregistrer une nouvelle ligne de la table des assur�s volontaire
				assureVolontaire.createAssureVolontaire(this.listeJASSURE.get(i));
				continue;
			} catch(Exception exp) {
				exp.getMessage();
		  		System.out.println("Echec de la cr�ation de ce nouvel assur� de Oracle dans MySQL.");
			}
		}
  		System.out.println("Fin de l'insertion des nouveaux assur�s de Oracle dans MySQL.");
  		System.out.println("Insertion des nouveaux employeurs de Oracle dans MySQL.");
		for(int j = 0; j < this.listeJEMPLOYEUR.size(); j++) {
			try{
				// Action permettant d'enregistrer une nouvelle ligne de la table des assur�s volontaire
				assureVolontaire.createAssureVolontaire(this.listeJEMPLOYEUR.get(j));
				continue;
			} catch(Exception exp) {
				exp.getMessage();
		  		System.out.println("Echec de la cr�ation de ce nouvel employeur de Oracle dans MySQL.");
			}
		}
  		System.out.println("Fin de l'insertion des nouveaux employeurs de Oracle dans MySQL.");
	}
	
	/**
	 * 
	 * @param assureVolontaire
	 */
	public void updateFormerData(ASSURE_VOLONTAIREDAO assureVolontaire) {
		// TODO Auto-generated method stub
  		System.out.println("Mise-�-jour des assur�s volontaires par les assur�s de Oracle qui concorde.");
		for(int i = 0; i < this.listeJASSURE.size(); i++) {
			try{
		  		// Mise � jour d'un assur� volontaire avec cet assur�
				assureVolontaire.updateAssureVolontaire(this.listeJASSURE.get(i));
				continue;
			} catch(Exception exp) {
				exp.getMessage();
		  		System.out.println("Echec de la mise � jour d'un assur� volontaire situ� dans MySQL avec cet assur�.");
			}
		}
  		System.out.println("Fin de la mise � jour des assur�s volontaires.");
  		System.out.println("Mise-�-jour des assur�s volontaires par les employeurs de Oracle qui concorde.");
		for(int j = 0; j < this.listeJEMPLOYEUR.size(); j++) {
			try{
		  		// Mise � jour d'un assur� volontaire avec cet employeur
				assureVolontaire.updateAssureVolontaire(this.listeJEMPLOYEUR.get(j));
				continue;
			} catch(Exception exp) {
				exp.getMessage();
		  		System.out.println("Echec de la mise � jour d'un assur� volontaire situ� dans MySQL avec cet employeur.");
			}
		}
  		System.out.println("Fin de la mise � jour de ces assur�s volontaires.");
	}
}