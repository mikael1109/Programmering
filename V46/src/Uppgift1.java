import java.util.Scanner;
public class Uppgift1 {

	public static void main(String[] args) 
	{
		int tal = 0;
		int nyttal = 0;
		boolean exit = false;
		System.out.println("Skriv in n�gra tal och skriv sen in 0 f�r att skriva ut summan av talet");
		Scanner scan = new Scanner(System.in); // Startar scanner
		nyttal = 1;
		while(!exit) { // Kollar s� att exit �r false
			if(nyttal != 0) { //Kollar s� att nyttal inte �r 0
				nyttal = scan.nextInt(); // S�tter nyttal till senaste int
				tal = tal + nyttal; // Plussar p� nya talet.
			}else {
				System.out.println(tal); //Skriver ut talet
				exit = true; // S�tter exit till true
			}
		}
	}
	
}
