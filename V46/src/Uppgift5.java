import java.util.Scanner;
public class Uppgift5 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Startar scanner
		int steps = 0;
		System.out.println("Hur m�nga trappsteg ska det vara?");
		steps = scan.nextInt();
		for (int i = 0; i < steps; i++) // Loopar tills alla steps �r utskrivna
		{
			for (int y = 0; y <= i; y++) { // Loopar tills alla x �r utskrivna
				System.out.print("x"); // Skriver ut x
			}
			System.out.println(); // Skriver ut ett blankt steg, g�r ner till n�sta rad
		}

	}

}
