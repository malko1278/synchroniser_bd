/**
 * 
 */
package cm.sapelli.connect.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import cm.sapelli.connect.db.ConnectDBOracle;

/**
 * @author User
 *
 */
public class ConnectedToOracle {
	static Connection connexion = null;

	/**
	 * 
	 */
	public ConnectedToOracle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void driverConnect(){
		/* Chargement du driver JDBC pour Oracle */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			System.out.println("Connexion effective du driver de Oracle !");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// Gérer les éventuelles erreurs ici
			System.out.println("Echec de la connexion du driver sur Oracle !");
			e.printStackTrace();
		}
	}
	
	public static Connection getInstance(){
		driverConnect();
		if(connexion == null){
			try {
				// Connexion à la base de données
				connexion = (Connection) DriverManager.getConnection(ConnectDBOracle.getURL(),  
																	 ConnectDBOracle.getUTILISATEUR(), 
																	 ConnectDBOracle.getPASSWORD());
				System.out.println("Connexion à la base de données dans Oracle établie !");
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERREUR DE CONNEXION ! ", JOptionPane.ERROR_MESSAGE);
				System.out.println("Echec de la connexion à la base de données dans Oracle !");
			}
		}
		return connexion;
	}
	
	public static void endConnexion(){
		try {
			connexion.close();
			System.out.println("Fermeture de la connexion à la base de données Oracle !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Echec de la ferméture de la connexion à la base de données Oracle !");
		}
	}
}