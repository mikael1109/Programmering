import java.util.Scanner;
public class Uppgift6 {

	//Skapa ett program som skriver ut en pyramid efter 
	//att användaren matat in antal rader pyramidens bas ska vara.
	public static void main(String[] args) 
	{
		int steps = 0;
		int spaces = 0;
		Scanner scan = new Scanner(System.in); // Startar scanner
		System.out.println("Hur många steg ska pyramid gå");
		steps = scan.nextInt(); // Steps till det givna antalet 
		spaces = steps - 1; // Sätter spaces till steps och tar bort 1
		for(int i = 0; i < steps; i++) { // Loopar tills alla steps är utskrivna
			for(int y = 0; y < spaces; y++) { // Loopar tills antalet spaces är utskrivna
				System.out.print(" "); // Skriver ut en blank ruta
			}
			for(int x = 0; x <= i; x++) { // Loopar tills antalet x är utskrivna
				System.out.print("x "); // Skriver ett x och en blank ruta
			}
			System.out.println(); // Går ned till nästa rad
			spaces--; // Tar bort en från spaces
		}
	}

}
