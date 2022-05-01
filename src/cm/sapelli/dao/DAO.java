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
	 * M�thode de cr�ation
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean create(T obj, String end);
	
	/**
	 * M�thode pour effacer
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean delete(T obj, String end);
	
	/**
 	 * M�thode de mise � jour
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean update(T obj, String end);
	
	/**
	 * M�thode de recherche des informations
	 * @param id
	 * @return T
	 */
	public abstract T find(String id, String end);
	
	/**
	 * M�thode de recherche des informations
	 * @param id
	 * @return 
	 */
	public abstract boolean findExist(String id, String end);
	
	/**
	 * M�thode de r�cup�ration de toute
	 * @return ArrayList<T>
	 */
	public abstract ArrayList<T> findAlls(String end);
	
	/**
	 * M�thode de r�cup�ration de toute
	 * @return ArrayList<T>
	 */
	public abstract ArrayList<T> findAlls();
	
	/**
	 * M�thode de recherche les informations � partir d'une date
	 * @param requete
	 * @param date
	 * @param end
	 * @return
	 */
	public abstract ArrayList<T> findByDate(String requete, String end, boolean ancien);
	
	/**
	 * M�thode de recherche les informations � partir d'une date
	 * @param date
	 * @param end2 
	 * @return ArrayList<T>
	 */
	public abstract ArrayList<T> findByDate(String date, String end);
	
	/**
	 * M�thode de recherche les informations � partir d'une date
	 * @param date
	 * @return ArrayList<T>
	 */
	public abstract ArrayList<T> findByDate(String date);
	
	/**
	 * M�thode de recherche les informations � partir d'une d'objet
	 * @param objet
	 * @return T
	 */
	public abstract T findByObjet(T objet, String end);
	
	/**
	 * M�thode de recherche les informations � partir d'une liste d'objet
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
	 * M�thode de recherche les informations � partir d'une date
	 * @param date
	 * @return String
	 */
	public abstract String getDate(String date);
}