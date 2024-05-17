package ex3.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {
  protected List<Animal> animaux = new ArrayList<>();

  public abstract double calculerKgsNourritureParJour();

  public void addAnimal(Animal animal) {
    animaux.add(animal);
  }

  public void afficherListeAnimaux() {
    for (Animal animal : animaux) {
      System.out.println(animal);
    }
  }

  public int compterAnimaux() {
    return animaux.size();
  }
}
