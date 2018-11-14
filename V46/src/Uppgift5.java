import java.util.Scanner;
public class Uppgift5 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Startar scanner
		int steps = 0;
		System.out.println("Hur många trappsteg ska det vara?");
		steps = scan.nextInt();
		for (int i = 0; i < steps; i++) // Start en loop, loopen fortsätter tills "i" = steps lägger till en på "i" varje gång loopen börjar om
		{
			for (int y = 0; y <= i; y++) { // Starar en till loop, loopen håller på tills "y" = "i", Lägger till en på "y" varje gång loopen börjar om
				System.out.print("x"); // Skriver ut x, går inte ner än rad
			}
			System.out.println(); // Skriver ut ett blankt steg, går ner till nästa rad
		}

	}

}
