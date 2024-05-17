package ex3.entities;

import ex3.enums.ComportementAnimal;
import ex3.enums.TypeAnimal;

public class ZoneCarnivore extends Zone {

	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 10;
	}

	public void addAnimal(String nomAnimal) {
		super.addAnimal(new Animal(nomAnimal, TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE));
	}
}