import java.util.Scanner;

public class GissaTal {

	static int tal = 0;
	static int guess = 0;
	static int count = 0;
	static int range = 0;
	static String restart = "";
	static boolean exit = false;
	static boolean gissat = false;
	static Scanner sc = new Scanner(System.in); // Startar scanner

	public static void main(String[] args) {
		range();
		do {
			guess();
			countRank();
			restart();
		} while (!exit);

	}

	/**
	 * Best�mmer hur mycket du ska gissa mellan, Skriver ut start meddelandet.
	 */
	public static void range() {
		System.out.println("Hur mycket ska du gissa mellan 1 - ?");
		range = sc.nextInt();
		tal = (int) (Math.random() * range) + 1;
		System.out.println("Gissa p� ett tal mellan 1 till " + range + " f� fan");
	}

	/**
	 * L�ter anv�nderen gissa och kollar om gissning var korrekt, ifall inte s�
	 * skriver den repsektive st�rre, mindre eller n�ra om det var 3 ifr�n.
	 */
	public static void guess() {
		while (!gissat) {
			guess = sc.nextInt();
			count++;
			if (tal == guess) {
				System.out.println("Nu fick du allt till det, bra jobbat");
				gissat = true;
			} else if (guess - tal <= 3 && guess - tal >= -3) {
				System.out.println("Nu va det riktigt n�ra gubben");
			} else if (guess < tal) {
				System.out.println("Talet �r fan st�rre brysh");
			} else if (guess > tal) {
				System.out.println("Nu gick du fan �ver mannen");
			}
		}
	}

	/**
	 * Skriver ut ett meddelande baserat p� hur m�nga g�nger man har gissat sen
	 * �terst�ller count till 0
	 */
	public static void countRank() {
		if (count <= 5) {
			System.out.println("Du gissade: " + count + " g�nger, de va la okej");
		} else if (count >= 12) {
			System.out.println("Lilla gubben nu tog det allt " + count + " f�rs�k, de va ju inte s� j�vla bra.");
		} else {
			System.out.println("Du gissade: " + count + " g�nger, fan va s�mst");
		}
		count = 0;
	}

	/**
	 * Kollar om anv�ndaren vill k�ra igen, ifall ja s� startar den en ny runda
	 * (range() ) annars skriver den ut ett meddelande och st�nger av programmet.
	 */
	public static void restart() {
		System.out.println("Vill du k�ra igen. ja/nej");
		restart = sc.next();
		do {
			if (restart.equals("ja")) {
				gissat = false;
				range();
			} else if (restart.equals("nej")) {
				exit = true;
				System.out.println("Aja ha det g�tt f�r fan");
			} else {
				System.out.println("Ogiltlig svar; ja/nej");
				restart = sc.next();
			}
		} while (gissat && !exit);
	}

}
