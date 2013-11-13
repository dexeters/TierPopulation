package tierpopulation;


public class Tierpopulation {
	public static void main(String[] args) {
		double population = 5000;
		double vermehrensquote = 1.1;
		double abschussquote = 0.01;
		double jahre = 5;
		if (vermehrensquote != 1) {
			population = population * Math.pow(vermehrensquote, jahre)
					- abschussquote * (Math.pow(vermehrensquote, jahre) - 1)
					/ (vermehrensquote - 1);
		} else {
			population = population - Math.pow(abschussquote, jahre);
		}
		Terminal.print(population);
		
	}
}
