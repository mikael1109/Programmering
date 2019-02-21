import java.util.Scanner;

public class GissaTal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tal = 0;
		int guess = 0;
		int count = 0;
		int range = 0;
		boolean exit = false;
		boolean gissat = false;
		System.out.println("Hur mycket ska du gissa mellan 1 - ?");
		range = sc.nextInt();
		tal = (int) (Math.random() * range) + 1;
		System.out.println("Gissa på ett tal mellan 1 till " + range + " fö fan");
		do {
			while (!gissat) {
				guess = sc.nextInt();
				count++;
				if (tal == guess) {
					System.out.println("Nu fick du allt till det, bra jobbat");
					gissat = true;
				} else if (guess - tal <= 5 && guess - tal >= -5) {
					System.out.println("Nu va det riktigt nära gubben");
				} else if (guess < tal) {
					System.out.println("Talet är fan större brysh");
				} else if (guess > tal) {
					System.out.println("Nu gick du fan över mannen");
				}
			}
			if (count <= 5) {
				System.out.println("Du gissade: " + count + " gånger, de va la okej");
			} else if (count >= 12) {
				System.out.println("Lilla gubben nu tog det allt " + count + " försök, de va ju inte så jävla bra.");
			} else {
				System.out.println("Du gissade: " + count + " gånger, fan va sämst");
			}
			count = 0;
			System.out.println("Vill du köra igen. 1: Ja  2: Nej");
			guess = sc.nextInt();
			if (guess == 1) {
				gissat = false;
				System.out.println("Hur mycket ska du gissa mellan?");
				range = sc.nextInt();
				tal = (int) (Math.random() * range) + 1;
				System.out.println("Gissa på ett tal mellan 1 till " + range + " fö fan");
			} else if (guess == 2) {
				exit = true;
				System.out.println("Aja ha det gött för fan");
			}
		} while (!exit);

	}

}
