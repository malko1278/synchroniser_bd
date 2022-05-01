/**
 * 
 */
package cm.sapelli.dao;

import java.sql.Connection;

import cm.sapelli.connect.driver.ConnectedToMySQL;
import cm.sapelli.connect.driver.ConnectedToOracle;
import cm.sapelli.dao.table_bd.ASSURE_VOLONTAIREDAO;
import cm.sapelli.dao.table_bd.JASSUREDAO;
import cm.sapelli.dao.table_bd.JEMPLOYEURDAO;

/**
 * @author User
 *
 */
public class DAOFactory {
	protected static Connection connOracle = null;
	protected static Connection connMySQL = null;
	/**
	 * 
	 */
	public DAOFactory() {
		// TODO Auto-generated constructor stub
		connOracle = ConnectedToOracle.getInstance();
		connMySQL = ConnectedToMySQL.getInstance();
	}
	
	/**
	 * Retourne un objet JASSURE interagissant avec la BD
	 * @return DAO
	 */
	public JASSUREDAO getJASSUREDAO(){
		return new JASSUREDAO(connOracle);
	}
	
	/**
	 * Retourne un objet JEMPLOYEUR interagissant avec la BD
	 * @return DAO
	 */
	public JEMPLOYEURDAO getJEMPLOYEURDAO(){
		return new JEMPLOYEURDAO(connOracle);
	}
	
	/**
	 * Retourne un objet JEMPLOYEUR interagissant avec la BD
	 * @return DAO
	 */
	public ASSURE_VOLONTAIREDAO getASSURE_VOLONTAIREDAO(){
		return new ASSURE_VOLONTAIREDAO(connMySQL);
	}
	
	public void endConnectMySQL(){
		ConnectedToMySQL.endConnexion();
	}
	
	public void endConnectOracle(){
		ConnectedToOracle.endConnexion();
	}
}