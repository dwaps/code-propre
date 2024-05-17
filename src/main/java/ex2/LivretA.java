package ex2;

/**
 * Cette classe représente un livret A, un type de compte bancaire.
 */
public class LivretA extends CompteBancaire {

	/** Le taux de rémunération du livret */
	private double tauxRemuneration;

	/**
	 * Constructeur de la classe LivretA.
	 * 
	 * @param type             le type de compte
	 * @param solde            le solde du compte
	 * @param tauxRemuneration le taux de rémunération du livret
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Retourne le taux de rémunération du livret.
	 * 
	 * @return le taux de rémunération du livret
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Modifie le taux de rémunération du livret.
	 * 
	 * @param tauxRemuneration le nouveau taux de rémunération du livret
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
