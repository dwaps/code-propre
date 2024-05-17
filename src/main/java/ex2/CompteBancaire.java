package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;

	/**
	 * decouvertAutorise : montant de découvert autorisé pour les comptes courants
	 */
	private double decouvertAutorise;

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/** Le type de compte : soit CC=Compte courant, soit LA=Livret A */
	private String type;

	/**
	 * Construit un compte bancaire avec les informations spécifiées.
	 * 
	 * @param type      le type de compte (CC pour compte courant, LA pour livret A)
	 * @param solde     le solde initial du compte
	 * @param decouvert le montant de découvert autorisé pour les comptes courants
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvertAutorise = decouvert;
	}

	/**
	 * Construit un compte de type Livret A avec les informations spécifiées.
	 * 
	 * @param type             le type de compte (LA pour livret A)
	 * @param solde            le solde initial du compte
	 * @param decouvert        le montant de découvert autorisé pour les comptes
	 *                         courants
	 * @param tauxRemuneration le taux de rémunération annuelle du livret A
	 */
	public CompteBancaire(String type, double solde, double decouvert, double tauxRemuneration) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvertAutorise = decouvert;
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Ajoute un montant au solde du compte.
	 * 
	 * @param montant le montant à ajouter au solde
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Débite un montant du solde du compte.
	 * 
	 * Pour les comptes courants (type CC), le montant peut être retiré même s'il ne
	 * reste pas assez d'argent sur le compte, mais le montant de découvert autorisé
	 * ne peut pas être dépassé.
	 * Pour les livrets A (type LA), le montant ne peut pas être retiré si cela
	 * entraîne un solde négatif.
	 * 
	 * @param montant le montant à débiter du solde
	 */
	public void debiterMontant(double montant) {
		if (type.equals("CC")) {
			if (this.solde - montant >= -this.decouvertAutorise) {
				this.solde -= montant;
			}
		} else if (type.equals("LA")) {
			if (this.solde >= montant) {
				this.solde -= montant;
			}
		}
	}

	/**
	 * Applique la rémunération annuelle sur le solde du compte, dans le cas d'un
	 * livret A.
	 * 
	 * Le montant de rémunération est calculé en fonction du solde actuel et du taux
	 * de rémunération annuelle.
	 * 
	 * @see CompteBancaire#tauxRemuneration
	 */
	public void appliquerRemunerationAnnuelle() {
		if (type.equals("LA")) {
			double remuneration = this.solde * this.tauxRemuneration / 100;
			this.solde += remuneration;
		}
	}

	/**
	 * Retourne le solde actuel du compte.
	 * 
	 * @return le solde du compte
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Définit le solde du compte.
	 * 
	 * @param solde le solde à définir pour le compte
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Retourne le montant de découvert autorisé pour les comptes courants.
	 * 
	 * @return le montant de découvert autorisé
	 */
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	/**
	 * Définit le montant de découvert autorisé pour les comptes courants.
	 * 
	 * @param decouvertAutorise le montant de découvert autorisé à définir
	 */
	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	/**
	 * Retourne le taux de rémunération annuelle du livret A.
	 * 
	 * @return le taux de rémunération annuelle du livret A
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Définit le taux de rémunération annuelle du livret A.
	 * 
	 * @param tauxRemuneration le taux de rémunération annuelle à définir pour le
	 *                         livret A
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Retourne le type de compte (CC pour compte courant, LA pour livret A).
	 * 
	 * @return le type de compte
	 */
	public String getType() {
		return type;
	}

	/**
	 * Définit le type de compte (CC pour compte courant, LA pour livret A).
	 * 
	 * @param type le type de compte à définir
	 */
	public void setType(String type) {
		this.type = type;
	}
}
