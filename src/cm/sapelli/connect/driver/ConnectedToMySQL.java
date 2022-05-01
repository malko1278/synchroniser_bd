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
			// Gérer les éventuelles erreurs ici
			System.out.println("Echec de la connexion du driver !");
			e.printStackTrace();
		}
	}
	
	public static Connection getInstance(){
		driverConnect();
		if(connexion == null){
			try {
				// Connexion à la base de données
				connexion = (Connection) DriverManager.getConnection(ConnectDBMySQL.getURL(),  
																	 ConnectDBMySQL.getUTILISATEUR(), 
																	 ConnectDBMySQL.getPASSWORD());
				System.out.println("Connexion à la base de données dans MySQL établie !");
			} catch (SQLException e) {
				System.out.println("Echec de la connexion à la base de MySQL dans Oracle !");
			}
		}
		return connexion;
	}
	
	public static void endConnexion() {
		try {
			connexion.close();
			System.out.println("Fermeture de la connexion à la base de données dans MySQL !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Echec de la ferméture de la connexion à la base de données dans MySQL !");
		}
	}
}