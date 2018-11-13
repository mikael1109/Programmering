import java.util.Scanner;
public class Uppgift1 {

	public static void main(String[] args) 
	{
		int tal = 0;
		int nyttal = 0;
		boolean exit = false;
		System.out.println("Skriv in några tal och skriv sen in 0 för att skriva ut summan av talet");
		Scanner scan = new Scanner(System.in); // Startar scanner
		nyttal = 1;
		while(!exit) { // Kollar så att exit är false
			if(nyttal != 0) { //Kollar så att nyttal inte är 0
				nyttal = scan.nextInt(); // Sätter nyttal till senaste int
				tal = tal + nyttal; // Plussar på nya talet.
			}else {
				System.out.println(tal); //Skriver ut talet
				exit = true; // Sätter exit till true
			}
		}
	}
	
}
