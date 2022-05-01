/**
 * 
 */
package cm.sapelli.connect.db;

/**
 * @author User
 *
 */
public class ConnectDBMySQL {
	/* Connexion à la base de données */
	protected static String URL = "jdbc:mysql://localhost:3306/synchro";
	protected static String UTILISATEUR = "root";
	protected static String PASSWORD = "";
	
	/*protected static String URL = "jdbc:mysql://192.168.10.63:3306/exchange";
	protected static String UTILISATEUR = "root";
	protected static String PASSWORD = "!Root!Cnps";*/
	/**
	 * 
	 */
	public ConnectDBMySQL() {
		super();
		// TODO Auto-generated constructor stub
		URL = "jdbc:mysql://localhost:3306/synchro";
		UTILISATEUR = "root";
		PASSWORD = "";
	}
	/**
	 * @return the uRL
	 */
	public static String getURL() {
		return URL;
	}
	/**
	 * @return the uTILISATEUR
	 */
	public static String getUTILISATEUR() {
		return UTILISATEUR;
	}
	/**
	 * @return the pASSWORD
	 */
	public static String getPASSWORD() {
		return PASSWORD;
	}
}