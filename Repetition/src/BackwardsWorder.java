import java.util.ArrayList;
import java.util.Scanner;

public class BackwardsWorder {

	public static void main(String[] args) {
		String ord;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ordLista = new ArrayList<>();
		System.out.println("Skriv tre ord");
		for(int i = 0; i < 3; i++) {
			ord = sc.nextLine();
			ordLista.add(ord);
		}
		for (int i = 2; i >= 0; i--) {
			System.out.print(ordLista.get(i) + " ");
		}

	}

}
