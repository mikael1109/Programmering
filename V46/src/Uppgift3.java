import java.util.Scanner;
public class Uppgift3 {

	//Skriv ett program som l�ser in en f�ljd av tal och multiplicerar ihop dem. 
	//Inl�sningen ska avbrytas d� produktens belopp �verstigit
	//100 000 eller d� 10 st tal skrivits in. 
	
	public static void main(String[] args) 
	{
		int count = 0;
		double tal = 1;
		boolean close = false;
		Scanner scan = new Scanner(System.in); // Startar scanner
		System.out.println("Skriv in tal s� multipliceras dem");
		System.out.println("Programet avslutas n�r talet n�r 100 000 eller antalet tal n�r 10");
		while(!close) { //  Startar loopen medans close �r false
			if(tal <= 100000 && count <= 10) // Ifallen talet �r mindre �n 100 000 och count �r mindre �n 10
			{		
				tal = tal * scan.nextDouble(); // G�ngrar talet med talet som nyss skrevs i konsolen
				count++; // L�gger till 1 till counten efter varje g�ng ett tal som skrivs in
				System.out.println(count + " " + tal);
				if(count >= 10) { // Ifall count blir lika med 10
					System.out.println("Du har skrivit 10 tal, talet blev: " + tal);
					close = true; // St�nger loopen
				}
			}else if(tal >= 100000) { // Ifall talet g�r �ver 100 000
				System.out.println("Talet kom �ver 100 000 det blev: " + tal);
				close = true; // St�nger loopen
			}
		}

	}

}
