package ex3.entities;

import ex3.enums.ComportementAnimal;
import ex3.enums.TypeAnimal;

public class Aquarium extends Zone {
  @Override
  public double calculerKgsNourritureParJour() {
    return animaux.size() * 0.2;
  }

  public void addAnimal(String nomAnimal) {
    super.addAnimal(new Animal(nomAnimal, TypeAnimal.POISSON, ComportementAnimal.HERBIVORE));
  }
}