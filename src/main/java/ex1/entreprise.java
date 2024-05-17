package ex1;

import java.util.Date;

/**
 * Cette classe représente une entreprise.
 */
public class Entreprise {

	/** Le numéro SIRET de l'entreprise */
	private int siret;
	/** Le nom de l'entreprise */
	private String nom;
	/** L'adresse de l'entreprise */
	private String adresse;
	/** La date de création de l'entreprise */
	private Date dateCreation;

	/** Le capital maximum de l'entreprise */
	public static final int CAPITAL_MAX = 3_000_000;

	/**
	 * Affiche le statut de l'entreprise.
	 */
	public void afficherStatut() {
	}

	/**
	 * Constructeur de la classe Entreprise.
	 * 
	 * @param siret        le numéro SIRET de l'entreprise
	 * @param nom          le nom de l'entreprise
	 * @param adresse      l'adresse de l'entreprise
	 * @param dateCreation la date de création de l'entreprise
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/**
	 * Retourne le numéro SIRET de l'entreprise.
	 * 
	 * @return le numéro SIRET de l'entreprise
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Modifie le numéro SIRET de l'entreprise.
	 * 
	 * @param siret le nouveau numéro SIRET de l'entreprise
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Retourne le nom de l'entreprise.
	 * 
	 * @return le nom de l'entreprise
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Modifie le nom de l'entreprise.
	 * 
	 * @param nom le nouveau nom de l'entreprise
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Retourne l'adresse de l'entreprise.
	 * 
	 * @return l'adresse de l'entreprise
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Modifie l'adresse de l'entreprise.
	 * 
	 * @param adresse la nouvelle adresse de l'entreprise
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Retourne la date de création de l'entreprise.
	 * 
	 * @return la date de création de l'entreprise
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Modifie la date de création de l'entreprise.
	 * 
	 * @param dateCreation la nouvelle date de création de l'entreprise
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * Retourne le capital maximum de l'entreprise.
	 * 
	 * @return le capital maximum de l'entreprise
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}

}
