package cm.sapelli.model;

public enum Sexe {
	/**
	 * Homme
	 */
	HOMME("Gar�on"),

	/**
	 * Femme
	 */
	FEMME("Fille");

	private final String label;

	Sexe(String label) {
		this.label = label;
	}
	/**
	 * 
	 * @return
	 */
	public String getLabel() {
		return label;
	}
}