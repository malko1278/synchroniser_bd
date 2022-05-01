/**
 * 
 */
package cm.sapelli.model;

/**
 * @author User
 */
public class JEMPLOYEUR {
	private String NUM_EMPLOYEUR;
	private String RAISON_SOCIALE;
	private String CODE_CENTRE;
	private String TEL;
	private String DATE_IMMAT;
	private String DATE_DERN_MODIF;
	private boolean ANCIEN;
	/**
	 * 
	 */
	public JEMPLOYEUR() {
		super();
		// TODO Auto-generated constructor stub
		this.NUM_EMPLOYEUR = "";
		this.RAISON_SOCIALE = "";
		this.TEL = "";
		this.DATE_IMMAT = "";
		this.CODE_CENTRE = "";
		this.DATE_DERN_MODIF = "";
		this.ANCIEN = false;
	}
	
	/**
	 * @param nUM_EMPLOYEUR
	 * @param rAISON_SOCIALE
	 * @param cODE_CENTRE
	 * @param tEL
	 * @param dATE_IMMAT
	 * @param dATE_DERN_MODIF
	 */
	public JEMPLOYEUR(String nUM_EMPLOYEUR, String rAISON_SOCIALE, String cODE_CENTRE, String tEL, String dATE_IMMAT,
					  String dATE_DERN_MODIF, boolean aNCIEN) {
		super();
		NUM_EMPLOYEUR = nUM_EMPLOYEUR;
		this.RAISON_SOCIALE = rAISON_SOCIALE;
		this.CODE_CENTRE = cODE_CENTRE;
		this.TEL = tEL;
		this.DATE_IMMAT = dATE_IMMAT;
		this.DATE_DERN_MODIF = dATE_DERN_MODIF;
		this.ANCIEN = aNCIEN;
	}

	/**
	 * @return the nUM_EMPLOYEUR
	 */
	public String getNUM_EMPLOYEUR() {
		return NUM_EMPLOYEUR;
	}

	/**
	 * @param nUM_EMPLOYEUR the nUM_EMPLOYEUR to set
	 */
	public void setNUM_EMPLOYEUR(String nUM_EMPLOYEUR) {
		NUM_EMPLOYEUR = nUM_EMPLOYEUR;
	}

	/**
	 * @return the rAISON_SOCIALE
	 */
	public String getRAISON_SOCIALE() {
		return RAISON_SOCIALE;
	}

	/**
	 * @param rAISON_SOCIALE the rAISON_SOCIALE to set
	 */
	public void setRAISON_SOCIALE(String rAISON_SOCIALE) {
		RAISON_SOCIALE = rAISON_SOCIALE;
	}

	/**
	 * @return the cODE_CENTRE
	 */
	public String getCODE_CENTRE() {
		return CODE_CENTRE;
	}

	/**
	 * @param cODE_CENTRE the cODE_CENTRE to set
	 */
	public void setCODE_CENTRE(String cODE_CENTRE) {
		CODE_CENTRE = cODE_CENTRE;
	}

	/**
	 * @return the tEL
	 */
	public String getTEL() {
		return TEL;
	}

	/**
	 * @param tEL the tEL to set
	 */
	public void setTEL(String tEL) {
		TEL = tEL;
	}

	/**
	 * @return the dATE_IMMAT
	 */
	public String getDATE_IMMAT() {
		return DATE_IMMAT;
	}

	/**
	 * @param dATE_IMMAT the dATE_IMMAT to set
	 */
	public void setDATE_IMMAT(String dATE_IMMAT) {
		DATE_IMMAT = dATE_IMMAT;
	}

	/**
	 * @return the dATE_DERN_MODIF
	 */
	public String getDATE_DERN_MODIF() {
		return DATE_DERN_MODIF;
	}

	/**
	 * @param dATE_DERN_MODIF the dATE_DERN_MODIF to set
	 */
	public void setDATE_DERN_MODIF(String dATE_DERN_MODIF) {
		DATE_DERN_MODIF = dATE_DERN_MODIF;
	}

	/**
	 * @return the aNCIEN
	 */
	public boolean isANCIEN() {
		return ANCIEN;
	}

	/**
	 * @param aNCIEN the aNCIEN to set
	 */
	public void setANCIEN(boolean aNCIEN) {
		ANCIEN = aNCIEN;
	}
}