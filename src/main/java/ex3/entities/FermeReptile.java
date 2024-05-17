package ex3.entities;

import ex3.enums.ComportementAnimal;
import ex3.enums.TypeAnimal;

public class FermeReptile extends Zone {

	public int compterAnimaux() {
		return animaux.size();
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 0.1;
	}

	public void addAnimal(String nomAnimal) {
		super.addAnimal(new Animal(nomAnimal, TypeAnimal.SERPENT, ComportementAnimal.CARNIVORE));
	}
}