package cm.sapelli.dao.table_bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cm.sapelli.dao.DAO;
import cm.sapelli.model.JASSURE;

public class JASSUREDAO extends DAO<JASSURE> {

	public JASSUREDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean create(JASSURE obj, String end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(JASSURE obj, String end) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean update(JASSURE obj, String end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public JASSURE find(String id, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findExist(String id, String end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<JASSURE> findAlls(String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<JASSURE> findAlls() {
		// TODO Auto-generated method stub
		ArrayList<JASSURE> assures = new ArrayList<JASSURE>();
		return assures;
	}

	@Override
	public ArrayList<JASSURE> findByDate(String requete, String end, boolean ancien) {
		// TODO Auto-generated method stub
		ArrayList<JASSURE> assures = new ArrayList<JASSURE>(0);
		try {
			ResultSet result = this.connect.createStatement().executeQuery(requete);
			while(result.next())
				assures.add(new JASSURE(result.getString("NUM_ASSU"), result.getString("NOM_ASSU"), result.getString("NOM_ASSU"), 
										result.getString("DATE_NAISS_ASSU"), result.getString("CODE_CENTRE_ASSU"), 
										result.getString("TEL_ASSU"), result.getString("DATE_CREA_ASSU"),
										result.getString("DATE_DERN_MODIF_ASSU"), ancien));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if(ancien == true)   System.out.println("Echec de la sélection d'anciens assurés.");
			else   System.out.println("Echec de la sélection des nouveaux assurés.");
		}
		return assures;
	}

	@Override
	public ArrayList<JASSURE> findByDate(String date, String end) {
		// TODO Auto-generated method stub
		ArrayList<JASSURE> assures = new ArrayList<JASSURE>();
		return assures;
	}

	@Override
	public ArrayList<JASSURE> findByDate(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JASSURE findByObjet(JASSURE objet, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<JASSURE> findByObjet(ArrayList<JASSURE> objet, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<JASSURE> findByListJASSURE(ArrayList<JASSURE> objet, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<JASSURE> findByListJASSURE(ArrayList<JASSURE> objet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDate(String end) {
		// TODO Auto-generated method stub
		String date = "", requete = "Select TO_CHAR(SYSDATE, 'yyyy-MM-dd HH24:MI:SS') DATE_SYS FROM DUAL" + end;
		try {
			ResultSet result = this.connect.createStatement().executeQuery(requete);
			if(result.next())	date = result.getString("DATE_SYS");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
}