import java.util.Scanner;
public class Uppgift5 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Startar scanner
		int steps = 0;
		System.out.println("Hur många trappsteg ska det vara?");
		steps = scan.nextInt();
		for (int i = 0; i < steps; i++) // Loopar tills alla steps är utskrivna
		{
			for (int y = 0; y <= i; y++) { // Loopar tills alla x är utskrivna
				System.out.print("x"); // Skriver ut x
			}
			System.out.println(); // Skriver ut ett blankt steg, går ner till nästa rad
		}

	}

}
