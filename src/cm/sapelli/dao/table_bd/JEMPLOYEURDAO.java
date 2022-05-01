/**
 * 
 */
package cm.sapelli.dao.table_bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cm.sapelli.dao.DAO;
import cm.sapelli.model.JASSURE;
import cm.sapelli.model.JEMPLOYEUR;

/**
 * @author User
 *
 */
public class JEMPLOYEURDAO extends DAO<JEMPLOYEUR> {

	public JEMPLOYEURDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean create(JEMPLOYEUR obj, String end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(JEMPLOYEUR obj, String end) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean update(JEMPLOYEUR obj, String end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public JEMPLOYEUR find(String id, String end) {
		// TODO Auto-generated method stub
		JEMPLOYEUR employeur = null;
		return employeur;
	}

	@Override
	public boolean findExist(String id, String end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<JEMPLOYEUR> findAlls(String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<JEMPLOYEUR> findAlls() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<JEMPLOYEUR> findByDate(String date, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<JEMPLOYEUR> findByDate(String requete, String end, boolean ancien) {
		// TODO Auto-generated method stub
		ArrayList<JEMPLOYEUR> employeurs = new ArrayList<JEMPLOYEUR>(0);
		try {
			ResultSet result = this.connect.createStatement().executeQuery(requete);
			while(result.next())
				employeurs.add(new JEMPLOYEUR(result.getString("NUM_EMPLOYEUR"), result.getString("RAISON_SOCIALE"), 
											  result.getString("CODE_CENTRE"), result.getString("TEL"), 
											  result.getString("DATE_IMMAT"), result.getString("DATE_DERN_MODIF"), ancien));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if(ancien == true)   System.out.println("Echec de la sélection d'anciens employeurs.");
			else   System.out.println("Echec de la sélection des nouveaux employeurs.");
		}
		return employeurs;
	}

	@Override
	public ArrayList<JEMPLOYEUR> findByDate(String date) {
		// TODO Auto-generated method stub
		ArrayList<JEMPLOYEUR> employeurs = new ArrayList<JEMPLOYEUR>(0);
		return employeurs;
	}

	public ArrayList<JEMPLOYEUR> findByListJASSURE(ArrayList<JASSURE> assures, String end) {
		// TODO Auto-generated method stub
		ArrayList<JEMPLOYEUR> employeurs = new ArrayList<JEMPLOYEUR>(0);
		return employeurs;
	}

	@Override
	public ArrayList<JEMPLOYEUR> findByListJASSURE(ArrayList<JASSURE> assures) {
		// TODO Auto-generated method stub
		ArrayList<JEMPLOYEUR> employeurs = new ArrayList<JEMPLOYEUR>(0);
		return employeurs;
	}

	@Override
	public JEMPLOYEUR findByObjet(JEMPLOYEUR objet, String end) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public ArrayList<JEMPLOYEUR> findByObjet(ArrayList<JEMPLOYEUR> objet, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDate(String end) {
		// TODO Auto-generated method stub
		return null;
	}
}