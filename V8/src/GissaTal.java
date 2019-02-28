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
	 * Bestämmer hur mycket du ska gissa mellan, Skriver ut start meddelandet.
	 */
	public static void range() {
		System.out.println("Hur mycket ska du gissa mellan 1 - ?");
		range = sc.nextInt();
		tal = (int) (Math.random() * range) + 1;
		System.out.println("Gissa på ett tal mellan 1 till " + range + " fö fan");
	}

	/**
	 * Låter använderen gissa och kollar om gissning var korrekt, ifall inte så
	 * skriver den repsektive större, mindre eller nära om det var 3 ifrån.
	 */
	public static void guess() {
		while (!gissat) {
			guess = sc.nextInt();
			count++;
			if (tal == guess) {
				System.out.println("Nu fick du allt till det, bra jobbat");
				gissat = true;
			} else if (guess - tal <= 3 && guess - tal >= -3) {
				System.out.println("Nu va det riktigt nära gubben");
			} else if (guess < tal) {
				System.out.println("Talet är fan större brysh");
			} else if (guess > tal) {
				System.out.println("Nu gick du fan över mannen");
			}
		}
	}

	/**
	 * Skriver ut ett meddelande baserat på hur många gånger man har gissat sen
	 * återställer count till 0
	 */
	public static void countRank() {
		if (count <= 5) {
			System.out.println("Du gissade: " + count + " gånger, de va la okej");
		} else if (count >= 12) {
			System.out.println("Lilla gubben nu tog det allt " + count + " försök, de va ju inte så jävla bra.");
		} else {
			System.out.println("Du gissade: " + count + " gånger, fan va sämst");
		}
		count = 0;
	}

	/**
	 * Kollar om användaren vill köra igen, ifall ja så startar den en ny runda
	 * (range() ) annars skriver den ut ett meddelande och stänger av programmet.
	 */
	public static void restart() {
		System.out.println("Vill du köra igen. ja/nej");
		restart = sc.next();
		do {
			if (restart.equals("ja")) {
				gissat = false;
				range();
			} else if (restart.equals("nej")) {
				exit = true;
				System.out.println("Aja ha det gött för fan");
			} else {
				System.out.println("Ogiltlig svar; ja/nej");
				restart = sc.next();
			}
		} while (gissat && !exit);
	}

}
