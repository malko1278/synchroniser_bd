/**
 * 
 */
package cm.sapelli.connect.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import cm.sapelli.connect.db.ConnectDBMySQL;

/**
 * @author User
 *
 */
public class ConnectedToMySQL {
	static Connection connexion = null;
	
	public ConnectedToMySQL(){
		super();
	}
	
	public static void driverConnect(){
		/* Chargement du driver JDBC pour MySQL */
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connexion effective au driver de MySQL !");
		} catch (ClassNotFoundException e) {
			// G�rer les �ventuelles erreurs ici
			System.out.println("Echec de la connexion du driver !");
			e.printStackTrace();
		}
	}
	
	public static Connection getInstance(){
		driverConnect();
		if(connexion == null){
			try {
				// Connexion � la base de donn�es
				connexion = (Connection) DriverManager.getConnection(ConnectDBMySQL.getURL(),  
																	 ConnectDBMySQL.getUTILISATEUR(), 
																	 ConnectDBMySQL.getPASSWORD());
				System.out.println("Connexion � la base de donn�es dans MySQL �tablie !");
			} catch (SQLException e) {
				System.out.println("Echec de la connexion � la base de MySQL dans Oracle !");
			}
		}
		return connexion;
	}
	
	public static void endConnexion() {
		try {
			connexion.close();
			System.out.println("Fermeture de la connexion � la base de donn�es dans MySQL !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Echec de la ferm�ture de la connexion � la base de donn�es dans MySQL !");
		}
	}
}