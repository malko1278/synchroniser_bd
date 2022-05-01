/**
 * 
 */
package cm.sapelli.connect.db;

/**
 * @author User
 * 
 */
public class ConnectDBOracle {
	/* Connexion à la base de données */
	// protected static String URL = "jdbc:oracle:thin:@localhost:1521:synchro";
	/*protected static String URL = "jdbc:oracle:thin:@192.168.3.8:1521:apex";
	protected static String UTILISATEUR = "jsap";
	protected static String PASSWORD = "jsap2013";*/

	protected static String URL = "jdbc:oracle:thin:@192.168.10.205:1521:PROD";
	protected static String UTILISATEUR = "sed";
	protected static String PASSWORD = "Sed!2015";
	/**
	 * 
	 */
	public ConnectDBOracle() {
		super();
		// TODO Auto-generated constructor stub
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