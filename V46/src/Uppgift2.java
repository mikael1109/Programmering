import java.util.Scanner;
public class Uppgift2 {

	public static void main(String[] args) 
	{
		boolean close = false;
		String exit = "EXIT";
		String line = "";
		Scanner scan = new Scanner(System.in); // Startar scanner
		while(!close) // Loopar medans close �r false
		{
			line = scan.nextLine(); // S�tter line till senaste scanner line'n
			if (line.equals(exit)) { // Ifall line = exit stringen
				close = true; // S�tter close till true, st�nger loopen
			}
		}
	}

}
