import java.util.Scanner;
public class Uppgift3 {

	//Skriv ett program som läser in en följd av tal och multiplicerar ihop dem. 
	//Inläsningen ska avbrytas då produktens belopp överstigit
	//100 000 eller då 10 st tal skrivits in. 
	
	public static void main(String[] args) 
	{
		int count = 0;
		double tal = 1;
		boolean close = false;
		Scanner scan = new Scanner(System.in); // Startar scanner
		System.out.println("Skriv in tal så multipliceras dem");
		System.out.println("Programet avslutas när talet når 100 000 eller antalet tal når 10");
		while(!close) { //  Startar loopen medans close är false
			if(tal <= 100000 && count <= 10) // Ifallen talet är mindre än 100 000 och count är mindre än 10
			{		
				tal = tal * scan.nextDouble(); // Gångrar talet med talet som nyss skrevs i konsolen
				count++; // Lägger till 1 till counten efter varje gång ett tal som skrivs in
				System.out.println(count + " " + tal);
				if(count >= 10) { // Ifall count blir lika med 10
					System.out.println("Du har skrivit 10 tal, talet blev: " + tal);
					close = true; // Stänger loopen
				}
			}else if(tal >= 100000) { // Ifall talet går över 100 000
				System.out.println("Talet kom över 100 000 det blev: " + tal);
				close = true; // Stänger loopen
			}
		}

	}

}
