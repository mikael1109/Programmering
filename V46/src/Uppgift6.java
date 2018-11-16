import java.util.Scanner;
public class Uppgift6 {

	//Skapa ett program som skriver ut en pyramid efter 
	//att anv�ndaren matat in antal rader pyramidens bas ska vara.
	public static void main(String[] args) 
	{
		int steps = 0;
		int spaces = 0;
		Scanner scan = new Scanner(System.in); // Startar scanner
		System.out.println("Hur m�nga steg ska pyramid g�");
		steps = scan.nextInt(); // Steps till det givna antalet 
		spaces = steps - 1; // S�tter spaces till steps och tar bort 1
		for(int i = 0; i < steps; i++) { // Loopar tills alla steps �r utskrivna
			for(int y = 0; y < spaces; y++) { // Loopar tills antalet spaces �r utskrivna
				System.out.print(" "); // Skriver ut en blank ruta
			}
			for(int x = 0; x <= i; x++) { // Loopar tills antalet x �r utskrivna
				System.out.print("x "); // Skriver ett x och en blank ruta
			}
			System.out.println(); // G�r ned till n�sta rad
			spaces--; // Tar bort en fr�n spaces
		}
	}

}
