package spiel;

import tierpopulation.Terminal;

public class Spiel {
	int punkte = 0;

	public void spielen() {
		punkte = (int) (Math.random() * 10 + 2);
		Terminal.println("Ihre Punket ist :  " + punkte);
		int hitme = Terminal.askInt("Brauchen Sie mehr Karte?=");
		while (hitme == 1) {
			punkte += (int) (Math.random() * 10 + 2);
			Terminal.println("Ihre Punkte ist :  " + punkte);
			if (punkte > 21) {
				Terminal.println("Sie haben verloren!");
				break;
			}
			hitme = Terminal.askInt("Brauchen Sie mehr Karte?=");

		}
		if (hitme == 2) {
			int p = (int) (Math.random() * 7 + 15);
			if (punkte > p) {
				Terminal.println("Sie haben gewonnen!");
				Terminal.println("Ich habe "+p+" punkte!");
			} else if (punkte == p) {
				Terminal.println("Sie haben nicht gewonnen!");
				Terminal.println("Ich habe "+p+" punkte!");
			} else {
				Terminal.println("Sie haben verloren!");
				Terminal.println("Ich habe "+p+" punkte!");
			}
		}

	}

}
