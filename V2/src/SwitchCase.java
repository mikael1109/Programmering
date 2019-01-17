import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Square();
		System.out.println("Welcome to the labyrinth, Where would you like to go?");
		System.out.println("1 : Forward");
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		int choice = input.nextInt();

		String genre;

		switch(choice) {
		case 1:
			fourExit();
			System.out.println("1 : Left  2 : Forward  3 : Right");
			choice = input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("The door closes behind you, you are trapped");
				block();
				System.out.println("Restart to continue playing");
				break;
			case 3:
				threeExit();
				System.out.println("1 : Forward  2 : Downward");
				choice = input.nextInt();
				switch(choice) {
				case 1:
					System.out.println("The room is flooded with water and you drown~");
					water();
					System.out.println("Restart to continue playing");
				}
			}
		}
	}
	
	public static void Square() {
		for(int i = 0; i <= 21; i++) {
			if(i < 8 || i > 12) {
				System.out.print("-");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
		for(int i = 0; i <= 7; i++) {
			for(int y = 0; y <= 21; y++) {
				if (y == 0 || y == 21) {
					System.out.print("|");
				}else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		for(int i = 0; i <= 21; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println();
	}
	
	public static void fourExit() {
		for(int i = 0; i <= 21; i++) {
			if(i < 8 || i > 12) {
				System.out.print("-");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
		for(int i = 0; i <= 7; i++) {
			for(int y = 0; y <= 21; y++) {
				if (y == 0 || y == 21 ) {
					if(i != 3 && i != 4) {
						System.out.print("|");
					}else {
						System.out.print(" ");
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 0; i <= 21; i++) {
			if(i < 8 || i > 12) {
				System.out.print("-");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
		}
	
	public static void block() {
		System.out.println();
		for(int i = 0; i <= 21; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 0; i <= 7; i++) {
			for(int y = 0; y <= 21; y++) {
				if(y == 0 || y == 21) {
					System.out.print("|");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 0; i <= 21; i++) {
			System.out.print("-");
		}
	}
	
	public static void threeExit() {
		for(int i = 0; i <= 21; i++) {
			if(i < 8 || i > 12) {
				System.out.print("-");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
		for(int i = 0; i <= 7; i++) {
			for(int y = 0; y <= 21; y++) {
				if (y == 0 || y == 21 ) {
					if(i != 3 && i != 4 || y == 21) {
						System.out.print("|");
					}else {
						System.out.print(" ");
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 0; i <= 21; i++) {
			if(i < 8 || i > 12) {
				System.out.print("-");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	public static void water() {
		System.out.println("----------------------");
		System.out.println("|             ~      |");
		System.out.println("|   ~                |");
		System.out.println("|                    |");
		System.out.println("|          ~         |");
		System.out.println("|                 ~  |");
		System.out.println("|  ~                 |");
		System.out.println("|                    |");
		System.out.println("|     ~          ~   |");
		System.out.println("----------------------");
	}
}
