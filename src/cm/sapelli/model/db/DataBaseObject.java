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
		// Si la requete de récupérations des assurés est parfaitement constituée
		if(!reketOne.equals("")) {
			// System.out.println(reketOne);
			this.listeJASSURE = jASSUREDao.findByDate(reketOne, end, false);
			// System.out.println("Le nombre d'assurés 1 == " + this.listeJASSURE.size());
		} else	System.out.println("Date de récupération des assurés inconnue !!!");
		// Si la requete de récupérations des employeurs est parfaitement constituée
		if(!reketTwo.equals("")) {
			// System.out.println(reketTwo);
			this.listeJEMPLOYEUR = jEMPLOYEURDao.findByDate(reketTwo, end, false);
			// System.out.println("Le nombre d'employeurs 1 == " + this.listeJEMPLOYEUR.size());
		} else	System.out.println("Date de récupération des employeurs inconnue !!!");
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
  		System.out.println("Insertion des nouveaux assurés de Oracle dans MySQL.");
		for(int i = 0; i < this.listeJASSURE.size(); i++) {
			try{
				// Action permettant d'enregistrer une nouvelle ligne de la table des assurés volontaire
				assureVolontaire.createAssureVolontaire(this.listeJASSURE.get(i));
				continue;
			} catch(Exception exp) {
				exp.getMessage();
		  		System.out.println("Echec de la création de ce nouvel assuré de Oracle dans MySQL.");
			}
		}
  		System.out.println("Fin de l'insertion des nouveaux assurés de Oracle dans MySQL.");
  		System.out.println("Insertion des nouveaux employeurs de Oracle dans MySQL.");
		for(int j = 0; j < this.listeJEMPLOYEUR.size(); j++) {
			try{
				// Action permettant d'enregistrer une nouvelle ligne de la table des assurés volontaire
				assureVolontaire.createAssureVolontaire(this.listeJEMPLOYEUR.get(j));
				continue;
			} catch(Exception exp) {
				exp.getMessage();
		  		System.out.println("Echec de la création de ce nouvel employeur de Oracle dans MySQL.");
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
  		System.out.println("Mise-à-jour des assurés volontaires par les assurés de Oracle qui concorde.");
		for(int i = 0; i < this.listeJASSURE.size(); i++) {
			try{
		  		// Mise à jour d'un assuré volontaire avec cet assuré
				assureVolontaire.updateAssureVolontaire(this.listeJASSURE.get(i));
				continue;
			} catch(Exception exp) {
				exp.getMessage();
		  		System.out.println("Echec de la mise à jour d'un assuré volontaire situé dans MySQL avec cet assuré.");
			}
		}
  		System.out.println("Fin de la mise à jour des assurés volontaires.");
  		System.out.println("Mise-à-jour des assurés volontaires par les employeurs de Oracle qui concorde.");
		for(int j = 0; j < this.listeJEMPLOYEUR.size(); j++) {
			try{
		  		// Mise à jour d'un assuré volontaire avec cet employeur
				assureVolontaire.updateAssureVolontaire(this.listeJEMPLOYEUR.get(j));
				continue;
			} catch(Exception exp) {
				exp.getMessage();
		  		System.out.println("Echec de la mise à jour d'un assuré volontaire situé dans MySQL avec cet employeur.");
			}
		}
  		System.out.println("Fin de la mise à jour de ces assurés volontaires.");
	}
}