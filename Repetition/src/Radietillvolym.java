import java.util.Scanner;

public class Radietillvolym {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double radie;
		System.out.println("Skriv in en radie f�r en sf�r");
		radie = sc.nextInt();
		radie = (4 * Math.PI * Math.pow(radie, 3)) / 3;
		System.out.println("Volymen �r: " + radie);
	}
}
