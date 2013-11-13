package tierpopulation;

public class Switch {

	public static int tageImMonat(int monat) {

		int tage;

		switch (monat) {
		case 4:
		case 6:
		case 9:
		case 11:
			tage = 30;
			break;
		case 2:
			tage = 28;
			break;
		default:
			tage = 31;
			break;
		}
		return tage;
	}
	
	public static void main(String[] args) {
		System.out.print(tageImMonat(11));
	}

}
