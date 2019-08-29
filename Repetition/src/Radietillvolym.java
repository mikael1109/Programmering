import java.util.Scanner;

public class Radietillvolym {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double radie;
		System.out.println("Skriv in en radie för en sfär");
		radie = sc.nextInt();
		radie = (4 * Math.PI * Math.pow(radie, 3)) / 3;
		System.out.println("Volymen är: " + radie);
	}
}
