package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addMammifereHerbivore("Gazelle");
		zoo.addMammifereHerbivore("Zèbre");
		zoo.addMammifereCarnivore("Lion");
		zoo.addMammifereCarnivore("Panthère");
		zoo.addPoisson("Requin blanc");
		zoo.addPoisson("Truite dorée");
		zoo.addSerpent("Boa constrictor");
		zoo.addSerpent("Python");

		zoo.afficherListeAnimaux();
	}

}
