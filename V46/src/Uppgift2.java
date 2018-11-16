import java.util.Scanner;
public class Uppgift2 {

	//Skapa ett program som läser in textrader
	//från konsolen och avslutas när texten EXIT skrivs in.
	
	public static void main(String[] args) 
	{
		boolean close = false;
		String exit = "EXIT";
		String line = "";
		Scanner scan = new Scanner(System.in); // Startar scanner
		while(!close) // Loopar medans close är false
		{
			line = scan.nextLine(); // Sätter line till senaste scanner line'n
			if (line.equals(exit)) { // Ifall line = exit stringen
				close = true; // Sätter close till true, stänger loopen
			}
		}
	}

}
