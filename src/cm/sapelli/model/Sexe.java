package cm.sapelli.model;

public enum Sexe {
	/**
	 * Homme
	 */
	HOMME("Garçon"),

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