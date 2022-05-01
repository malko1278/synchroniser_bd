/**
 * 
 */
package cm.sapelli.dao;

import java.sql.Connection;
import java.util.ArrayList;

import cm.sapelli.model.JASSURE;

/**
 * @author User
 *
 */
public abstract class DAO<T> {
	protected Connection connect = null;
	
	public DAO(Connection conn){
		this.connect = conn;
	}
	/**
	 * Méthode de création
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean create(T obj, String end);
	
	/**
	 * Méthode pour effacer
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean delete(T obj, String end);
	
	/**
 	 * Méthode de mise à jour
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean update(T obj, String end);
	
	/**
	 * Méthode de recherche des informations
	 * @param id
	 * @return T
	 */
	public abstract T find(String id, String end);
	
	/**
	 * Méthode de recherche des informations
	 * @param id
	 * @return 
	 */
	public abstract boolean findExist(String id, String end);
	
	/**
	 * Méthode de récupération de toute
	 * @return ArrayList<T>
	 */
	public abstract ArrayList<T> findAlls(String end);
	
	/**
	 * Méthode de récupération de toute
	 * @return ArrayList<T>
	 */
	public abstract ArrayList<T> findAlls();
	
	/**
	 * Méthode de recherche les informations à partir d'une date
	 * @param requete
	 * @param date
	 * @param end
	 * @return
	 */
	public abstract ArrayList<T> findByDate(String requete, String end, boolean ancien);
	
	/**
	 * Méthode de recherche les informations à partir d'une date
	 * @param date
	 * @param end2 
	 * @return ArrayList<T>
	 */
	public abstract ArrayList<T> findByDate(String date, String end);
	
	/**
	 * Méthode de recherche les informations à partir d'une date
	 * @param date
	 * @return ArrayList<T>
	 */
	public abstract ArrayList<T> findByDate(String date);
	
	/**
	 * Méthode de recherche les informations à partir d'une d'objet
	 * @param objet
	 * @return T
	 */
	public abstract T findByObjet(T objet, String end);
	
	/**
	 * Méthode de recherche les informations à partir d'une liste d'objet
	 * @param objet
	 * @return ArrayList<T>
	 */
	public abstract ArrayList<T> findByObjet(ArrayList<T> objet, String end);
	
	/**
	 * 
	 * @param objet
	 * @param end
	 * @return
	 */
	public abstract ArrayList<T> findByListJASSURE(ArrayList<JASSURE> objet, String end);
	
	/**
	 * 
	 * @param objet
	 * @param end
	 * @return
	 */
	public abstract ArrayList<T> findByListJASSURE(ArrayList<JASSURE> objet);
	
	/**
	 * Méthode de recherche les informations à partir d'une date
	 * @param date
	 * @return String
	 */
	public abstract String getDate(String date);
}