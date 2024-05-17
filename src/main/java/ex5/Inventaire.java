package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets"));
		caisses.add(new Caisse("Moyens objets"));
		caisses.add(new Caisse("Grands objets"));
	}

	public void addItem(Item item) {
		for (Caisse caisse : caisses) {
			if (caisse.accepte(item)) {
				caisse.getItems().add(item);
				break;
			}
		}
	}

	public int taille() {
		int total = 0;
		for (Caisse caisse : caisses) {
			total += caisse.getItems().size();
		}
		return total;
	}
}
