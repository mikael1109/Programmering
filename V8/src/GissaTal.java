import java.util.Scanner;

public class GissaTal {

	static int tal = 0;
	static int guess = 0;
	static int count = 0;
	static int range = 0;
	static boolean exit = false;
	static boolean gissat = false;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		range();
		do {
			guess();
			countRank();
			restart();
		} while (!exit);

	}

	public static void range() {
		System.out.println("Hur mycket ska du gissa mellan 1 - ?");
		range = sc.nextInt();
		tal = (int) (Math.random() * range) + 1;
		System.out.println("Gissa p� ett tal mellan 1 till " + range + " f� fan");
	}

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

	public static void restart() {
		System.out.println("Vill du k�ra igen. 1: Ja  2: Nej");
		guess = sc.nextInt();
		do {
			if (guess == 1) {
				gissat = false;
				range();
			} else if (guess == 2) {
				exit = true;
				System.out.println("Aja ha det g�tt f�r fan");
			} else {
				System.out.println("Ogiltlig nummer 1: Ja  2: Nej");
				guess = sc.nextInt();
			}
		}while((guess != 1 && guess != 2));
	}

}
