/**
 * 
 */
package cm.sapelli.model;

/**
 * @author User
 *
 */
public class ASSURE_VOLONTAIRE {
	private String NUM_ASSU;
	private String NOM_PRENOM_ASSU;
	private String CODE_CENTRE;
	private String TEL_ASSU;

	/**
	 * 
	 */
	public ASSURE_VOLONTAIRE() {
		super();
		// TODO Auto-generated constructor stub
		this.NUM_ASSU = "";
		this.NOM_PRENOM_ASSU = "";
		this.CODE_CENTRE = "";
		this.TEL_ASSU = "";
	}

	/**
	 * 
	 * @param nUM_ASSU
	 * @param nOM_PRENOM_ASSU
	 * @param cODE_CENTRE
	 * @param tEL_ASSU
	 */
	public ASSURE_VOLONTAIRE(String nUM_ASSU, String nOM_PRENOM_ASSU, String cODE_CENTRE, String tEL_ASSU) {
		super();
		this.NUM_ASSU = nUM_ASSU;
		this.NOM_PRENOM_ASSU = nOM_PRENOM_ASSU;
		this.CODE_CENTRE = cODE_CENTRE;
		this.TEL_ASSU = tEL_ASSU;
	}

	/**
	 * @return the nUM_ASSU
	 */
	public String getNUM_ASSU() {
		return NUM_ASSU;
	}

	/**
	 * @param nUM_ASSU the nUM_ASSU to set
	 */
	public void setNUM_ASSU(String nUM_ASSU) {
		NUM_ASSU = nUM_ASSU;
	}

	/**
	 * @return the nOM_PRENOM_ASSU
	 */
	public String getNOM_PRENOM_ASSU() {
		return NOM_PRENOM_ASSU;
	}

	/**
	 * @param nOM_PRENOM_ASSU the nOM_PRENOM_ASSU to set
	 */
	public void setNOM_PRENOM_ASSU(String nOM_PRENOM_ASSU) {
		NOM_PRENOM_ASSU = nOM_PRENOM_ASSU;
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
	 * @return the tEL_ASSU
	 */
	public String getTEL_ASSU() {
		return TEL_ASSU;
	}

	/**
	 * @param tEL_ASSU the tEL_ASSU to set
	 */
	public void setTEL_ASSU(String tEL_ASSU) {
		TEL_ASSU = tEL_ASSU;
	}
}