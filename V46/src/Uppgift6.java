import java.util.Scanner;
public class Uppgift6 {

	public static void main(String[] args) 
	{
		int steps = 0;
		int spaces = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hur många steg ska pyramid gå");
		steps = scan.nextInt();
		spaces = steps - 1;
		for(int i = 0; i < steps; i++) {
			for(int y = 0; y < spaces; y++) {
				System.out.print(" ");
			}
			for(int x = 0; x <= i; x++) {
				System.out.print("x ");
			}
			System.out.println();
			spaces--;
		}
	}

}
