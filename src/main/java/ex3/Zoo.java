package ex3;

import ex3.entities.Aquarium;
import ex3.entities.FermeReptile;
import ex3.entities.SavaneAfricaine;
import ex3.entities.ZoneCarnivore;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;

	public Zoo(String nom) {
		this.nom = nom;
		savaneAfricaine = new SavaneAfricaine();
		zoneCarnivore = new ZoneCarnivore();
		fermeReptile = new FermeReptile();
		aquarium = new Aquarium();
	}

	public void addMammifereHerbivore(String nomAnimal) {
		savaneAfricaine.addAnimal(nomAnimal);
	}

	public void addMammifereCarnivore(String nomAnimal) {
		zoneCarnivore.addAnimal(nomAnimal);
	}

	public void addSerpent(String nomAnimal) {
		fermeReptile.addAnimal(nomAnimal);
	}

	public void addPoisson(String nomAnimal) {
		aquarium.addAnimal(nomAnimal);
	}

	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}