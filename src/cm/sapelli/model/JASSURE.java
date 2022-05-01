/**
 * 
 */
package cm.sapelli.model;

/**
 * @author User
 *
 */
public class JASSURE {
	private String NUM_ASSU;
	private String NOM_ASSU;
	private String PRENOM_ASSU;
	private String DATE_NAISS_ASSU;
    private String CODE_CENTRE_ASSU;
    private String TEL_ASSU;
	private String DATE_CREA_ASSU;
	private String DATE_DERN_MODIF_ASSU;
	private boolean ANCIEN;
	/**
	 * 
	 */
	public JASSURE() {
		super();
		// TODO Auto-generated constructor stub
		this.NUM_ASSU = "";
		this.PRENOM_ASSU = "";
		this.DATE_NAISS_ASSU = "";
		this.TEL_ASSU = "";
		this.CODE_CENTRE_ASSU = "";
		this.DATE_CREA_ASSU = "";
		this.DATE_DERN_MODIF_ASSU = "";
		this.ANCIEN = false;
	}
	/**
	 * 
	 * @param nUM_ASSU
	 * @param nOM_ASSU
	 * @param pRENOM_ASSU
	 * @param dATE_NAISS_ASSU
	 * @param cODE_CENTRE_ASSU
	 * @param tEL_ASSU
	 * @param dATE_CREA_ASSU
	 * @param dATE_DERN_MODIF_ASSU
	 * @param aNCIEN
	 */
	public JASSURE(String nUM_ASSU, String nOM_ASSU, String pRENOM_ASSU, String dATE_NAISS_ASSU, String cODE_CENTRE_ASSU, 
				   String tEL_ASSU, String dATE_CREA_ASSU, String dATE_DERN_MODIF_ASSU, boolean aNCIEN) {
		super();
		NUM_ASSU = nUM_ASSU;
		NOM_ASSU = nOM_ASSU;
		PRENOM_ASSU = pRENOM_ASSU;
		DATE_NAISS_ASSU = dATE_NAISS_ASSU;
		CODE_CENTRE_ASSU = cODE_CENTRE_ASSU;
		TEL_ASSU = tEL_ASSU;
		DATE_CREA_ASSU = dATE_CREA_ASSU;
		DATE_DERN_MODIF_ASSU = dATE_DERN_MODIF_ASSU;
		this.ANCIEN = aNCIEN;
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
	 * @return the nOM_ASSU
	 */
	public String getNOM_ASSU() {
		return NOM_ASSU;
	}
	/**
	 * @param nOM_ASSU the nOM_ASSU to set
	 */
	public void setNOM_ASSU(String nOM_ASSU) {
		NOM_ASSU = nOM_ASSU;
	}
	/**
	 * @return the pRENOM_ASSU
	 */
	public String getPRENOM_ASSU() {
		return PRENOM_ASSU;
	}
	/**
	 * @param pRENOM_ASSU the pRENOM_ASSU to set
	 */
	public void setPRENOM_ASSU(String pRENOM_ASSU) {
		PRENOM_ASSU = pRENOM_ASSU;
	}
	/**
	 * @return the dATE_NAISS_ASSU
	 */
	public String getDATE_NAISS_ASSU() {
		return DATE_NAISS_ASSU;
	}
	/**
	 * @param dATE_NAISS_ASSU the dATE_NAISS_ASSU to set
	 */
	public void setDATE_NAISS_ASSU(String dATE_NAISS_ASSU) {
		DATE_NAISS_ASSU = dATE_NAISS_ASSU;
	}
	/**
	 * @return the cODE_CENTRE_ASSU
	 */
	public String getCODE_CENTRE_ASSU() {
		return CODE_CENTRE_ASSU;
	}
	/**
	 * @param cODE_CENTRE_ASSU the cODE_CENTRE_ASSU to set
	 */
	public void setCODE_CENTRE_ASSU(String cODE_CENTRE_ASSU) {
		CODE_CENTRE_ASSU = cODE_CENTRE_ASSU;
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
	/**
	 * @return the dATE_CREA_ASSU
	 */
	public String getDATE_CREA_ASSU() {
		return DATE_CREA_ASSU;
	}
	/**
	 * @param dATE_CREA_ASSU the dATE_CREA_ASSU to set
	 */
	public void setDATE_CREA_ASSU(String dATE_CREA_ASSU) {
		DATE_CREA_ASSU = dATE_CREA_ASSU;
	}
	/**
	 * @return the dATE_DERN_MODIF_ASSU
	 */
	public String getDATE_DERN_MODIF_ASSU() {
		return DATE_DERN_MODIF_ASSU;
	}
	/**
	 * @param dATE_DERN_MODIF_ASSU the dATE_DERN_MODIF_ASSU to set
	 */
	public void setDATE_DERN_MODIF_ASSU(String dATE_DERN_MODIF_ASSU) {
		DATE_DERN_MODIF_ASSU = dATE_DERN_MODIF_ASSU;
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