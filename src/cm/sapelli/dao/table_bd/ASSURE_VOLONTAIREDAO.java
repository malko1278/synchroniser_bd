/**
 * 
 */
package cm.sapelli.dao.table_bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cm.sapelli.dao.DAO;
import cm.sapelli.model.ASSURE_VOLONTAIRE;
import cm.sapelli.model.JASSURE;
import cm.sapelli.model.JEMPLOYEUR;
import cm.sapelli.utils.FileUtil;
import cm.sapelli.utils.StatisticUtil;

/**
 * @author User
 * @param <T>
 * 
 */
public class ASSURE_VOLONTAIREDAO extends DAO<ASSURE_VOLONTAIRE> {

	public ASSURE_VOLONTAIREDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(ASSURE_VOLONTAIRE obj, String end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ASSURE_VOLONTAIRE obj, String end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ASSURE_VOLONTAIRE obj, String end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ASSURE_VOLONTAIRE find(String id, String end) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean findExist(String id, String end) {
		// TODO Auto-generated method stub
		try {
			String requete = "SELECT NUM_ASSU FROM assure_volontaire WHERE NUM_ASSU = '" + id +"'" + end;
			ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
	                   							            ResultSet.CONCUR_READ_ONLY).executeQuery(requete);
			if(result.next())   return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Echec de la vérification de l'existance !!!");
		}
		return false;
	}

	@Override
	public ArrayList<ASSURE_VOLONTAIRE> findAlls(String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ASSURE_VOLONTAIRE> findAlls() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ASSURE_VOLONTAIRE> findByDate(String requete, String end, boolean ancien) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ASSURE_VOLONTAIRE> findByDate(String date, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ASSURE_VOLONTAIRE> findByDate(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ASSURE_VOLONTAIRE findByObjet(ASSURE_VOLONTAIRE objet, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ASSURE_VOLONTAIRE> findByObjet(ArrayList<ASSURE_VOLONTAIRE> objet, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ASSURE_VOLONTAIRE> findByListJASSURE(ArrayList<JASSURE> objet, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ASSURE_VOLONTAIRE> findByListJASSURE(ArrayList<JASSURE> objet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDate(String end) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public boolean createAssureVolontaire(JASSURE obj) {
		// TODO Auto-generated method stub
		try {
			String nomPrenom = obj.getNOM_ASSU();
			String numero = "";
			if(obj.getTEL_ASSU() != null)	numero = obj.getTEL_ASSU();
			String str = "INSERT INTO assure_volontaire (num_assu, nom_prenom_assu, code_centre, tel_num, type_assu, " + 
			             "date_naiss_assu, date_immass_assu) VALUES ('" + obj.getNUM_ASSU() + "', '" + 
			             FileUtil.traiterChaine(nomPrenom) + "', '" + obj.getCODE_CENTRE_ASSU() + "', '" + numero + 
	                     "', 'AV', '" + obj.getDATE_NAISS_ASSU().substring(0, 10) + "', '" + 
			             obj.getDATE_CREA_ASSU().substring(0, 10) + "');";
  	  		if(this.connect.createStatement().executeUpdate(str) > 0)	StatisticUtil.incrementNombreCreationAss();
			return true;
  	  	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Echec de la Création de l'assuré volontaire");
		}
		return false;
	}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public boolean createAssureVolontaire(JEMPLOYEUR obj) {
		// TODO Auto-generated method stub
		try {
			String numero = "";
			if(obj.getTEL() != null)	numero = obj.getTEL();
			String str = "INSERT INTO assure_volontaire (num_assu, nom_prenom_assu, code_centre, tel_num, type_assu, " + 
			             "date_naiss_assu, date_immass_assu) VALUES ('" + obj.getNUM_EMPLOYEUR() + "', '" + 
			             FileUtil.traiterChaine(obj.getRAISON_SOCIALE()) + "', '" + obj.getCODE_CENTRE() + "', '" + numero + 
			             "', 'EM', '" + obj.getDATE_IMMAT().substring(0, 10) + "', '" + 
			             obj.getDATE_IMMAT().substring(0, 10) + "');";
  	  		if(this.connect.createStatement().executeUpdate(str) > 0)	StatisticUtil.incrementNombreCreationEmp();
			return true;
  	  	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Echec de la Création de l'assuré volontaire");
		}
		return false;
	}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public boolean updateAssureVolontaire(JASSURE obj) {
		// TODO Auto-generated method stub
  	  	try {
			String str = "UPDATE assure_volontaire SET nom_prenom_assu = '" + FileUtil.traiterChaine(obj.getNOM_ASSU()) + 
						 "', code_centre = '" + obj.getCODE_CENTRE_ASSU() + "', tel_num = '" + obj.getTEL_ASSU() + 
						 "' WHERE num_assu = '" + obj.getNUM_ASSU() + "';";
			if(this.connect.createStatement().executeUpdate(str) == 0) {
				this.createAssureVolontaire(obj);
				StatisticUtil.incrementNombreCreationAss();
				return true;
			} else {
				StatisticUtil.incrementNombreUpdateAss();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Echec de la mise à jour");
		}
		return false;
	}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public boolean updateAssureVolontaire(JEMPLOYEUR obj) {
		// TODO Auto-generated method stub
  	  	try {
  	  		String str = "UPDATE assure_volontaire SET nom_prenom_assu = '" + FileUtil.traiterChaine(obj.getRAISON_SOCIALE()) + 
  	  				     "', code_centre = '" + obj.getCODE_CENTRE() + "', tel_num = '" + obj.getTEL() + 
  	  				     "' WHERE num_assu = '" + obj.getNUM_EMPLOYEUR() + "';";
			if(this.connect.createStatement().executeUpdate(str) == 0) {
				this.createAssureVolontaire(obj);
				StatisticUtil.incrementNombreCreationEmp();
				return true;
			} else {
				StatisticUtil.incrementNombreUpdateEmp();
			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Echec de la mise à jour");
		}
		return false;
	}
}