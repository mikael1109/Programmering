import java.util.Scanner;
public class Uppgift5 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Startar scanner
		int steps = 0;
		System.out.println("Hur m�nga trappsteg ska det vara?");
		steps = scan.nextInt();
		for (int i = 0; i < steps; i++) // Start en loop, loopen forts�tter tills "i" = steps l�gger till en p� "i" varje g�ng loopen b�rjar om
		{
			for (int y = 0; y <= i; y++) { // Starar en till loop, loopen h�ller p� tills "y" = "i", L�gger till en p� "y" varje g�ng loopen b�rjar om
				System.out.print("x"); // Skriver ut x, g�r inte ner �n rad
			}
			System.out.println(); // Skriver ut ett blankt steg, g�r ner till n�sta rad
		}

	}

}
