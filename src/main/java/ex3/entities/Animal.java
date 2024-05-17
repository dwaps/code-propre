package ex3.entities;

import ex3.enums.ComportementAnimal;
import ex3.enums.TypeAnimal;

class Animal {
  private String nom;
  private TypeAnimal type;
  private ComportementAnimal comportement;

  public Animal(String nom, TypeAnimal type, ComportementAnimal comportement) {
    this.nom = nom;
    this.type = type;
    this.comportement = comportement;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public TypeAnimal getType() {
    return type;
  }

  public void setType(TypeAnimal type) {
    this.type = type;
  }

  public ComportementAnimal getComportement() {
    return comportement;
  }

  public void setComportement(ComportementAnimal comportement) {
    this.comportement = comportement;
  }

  @Override
  public String toString() {
    return new StringBuilder("---")
        .append("\nNOM: " + nom)
        .append("\nTYPE: " + type)
        .append("\nCOMPORTEMENT: " + comportement)
        .toString();
  }
}