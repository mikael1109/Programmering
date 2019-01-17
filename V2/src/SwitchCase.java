import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		boolean check = true;
		Scanner input = new Scanner(System.in);
		square();
		System.out.println("Welcome to the labyrinth, Where would you like to go?");
		System.out.println("1 : Up");
		int choice = input.nextInt();
		while(check) {
			if(choice > 0 && choice < 2) {
				check = false;
			}else {
				System.out.println("Please enter an valid number");
				choice = input.nextInt();
			}
		}
		switch(choice) {
		case 1:
			fourExit();
			System.out.println("1 : Left  2 : Up  3 : Right");
			choice = input.nextInt();
			check = true;
			while(check) {
				if(choice > 0 && choice < 4) {
					check = false;
				}else {
					System.out.println("Please enter an valid number");
					choice = input.nextInt();
				}
			}
			switch(choice) {
			case 1:
				System.out.println("The door closes behind you, you are trapped");
				block();
				System.out.println("Restart to continue playing");
				break;
			case 2:
				twoExit();
				System.out.println("1 : Up");
				choice = input.nextInt();
				check = true;
				while(check) {
					if(choice > 0 && choice < 2) {
						check = false;
					}else {
						System.out.println("Please enter an valid number");
						choice = input.nextInt();
					}
				}
				switch(choice) {
				case 1:
					System.out.println("There apears to be a tiger in the room");
					System.out.println("The tiger attacks you and you die~");
					tiger();
					System.out.println("Restart to continue playing");
					break;
				}
				break;
			case 3:
				threeExit();
				System.out.println("1 : Up  2 : Down");
				choice = input.nextInt();
				check = true;
				while(check) {
					if(choice > 0 && choice < 3) {
						check = false;
					}else {
						System.out.println("Please enter an valid number");
						choice = input.nextInt();
					}
				}
				switch(choice) {
				case 1:
					System.out.println("The room is flooded with water and you drown~");
					water();
					System.out.println("Restart to continue playing");
					break;
				case 2:
					twoExitSec();
					System.out.println("1 : Right");
					choice = input.nextInt();
					check = true;
					while(check) {
						if(choice > 0 && choice < 2) {
							check = false;
						}else {
							System.out.println("Please enter an valid number");
							choice = input.nextInt();
						}
					}
					switch(choice) {
					case 1:
						threeExitSec();
						System.out.println("1 : Up  2 : Right");
						choice = input.nextInt();
						check = true;
						while(check) {
							if(choice > 0 && choice < 3) {
								check = false;
							}else {
								System.out.println("Please enter an valid number");
								choice = input.nextInt();
							}
						}
						switch(choice) {
						case 1:
							threeExitTri();
							System.out.println("1 : Up  2 : Right");
							choice = input.nextInt();
							check = true;
							while(check) {
								if(choice > 0 && choice < 3) {
									check = false;
								}else {
									System.out.println("Please enter an valid number");
									choice = input.nextInt();
								}
							}
							switch(choice) {
							case 1:
								System.out.println("There apears to be a tiger in the room");
								System.out.println("The tiger attacks you and you die~");
								tiger();
								System.out.println("Restart to continue playing");
								break;
							case 2:
								threeExitSec();
								System.out.println("1 : Up  2 : Right");
								choice = input.nextInt();
								check = true;
								while(check) {
									if(choice > 0 && choice < 3) {
										check = false;
									}else {
										System.out.println("Please enter an valid number");
										choice = input.nextInt();
									}
								}
								switch(choice) {
								case 1:
									twoExit();
									System.out.println("1 : Up");
									choice = input.nextInt();
									check = true;
									while(check) {
										if(choice > 0 && choice < 2) {
											check = false;
										}else {
											System.out.println("Please enter an valid number");
											choice = input.nextInt();
										}
									}
									switch(choice) {
									case 1:
										trophy();
										System.out.println("You completed the labyrinth. Congratulation!");
										break;
									}
									break;
								case 2:
									System.out.println("The door closes behind you, you are trapped");
									block();
									System.out.println("Restart to continue playing");
									break;
								}
								break;
							}
							break;
						case 2:
							System.out.println("The room is flooded with water and you drown~");
							water();
							System.out.println("Restart to continue playing");
							break;
						}
					}
					break;
				}
				break;
			}
		}
	}
	
	public static void square() {
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
		System.out.println();
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
	
	public static void twoExit() 
	{
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
				if(y == 0 || y == 21) {
					System.out.print("|");
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
	
	public static void twoExitSec() 
	{
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
					if(i != 3 && i != 4 || y == 0) {
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
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void threeExitSec() 
	{
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
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void threeExitTri(){
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
					if(i != 3 && i != 4 || y == 0) {
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
	
	public static void tiger() {
		System.out.println("     (^\\-==-/^)");
		System.out.println("     >\\ == //<");
		System.out.println("    :== q''p ==:     _");
		System.out.println("     .__ qp __.    .' )");
		System.out.println("      / ^--^ \\    /\\.'");
		System.out.println("     /_`    / )  '\\/");
		System.out.println("     (  )  \\  |-'-/");
		System.out.println("     \\^^,   |-|--'");
		System.out.println("    ( `'    |_| )");
		System.out.println("     \\-     |-|/");
		System.out.println("    (( )^---( ))");
	}
	
	public static void trophy() {
		for(int i = 0; i <= 13; i++) {
			System.out.println();
		}
		System.out.println("        ___________");
		System.out.println("       '._==_==_=_.'");
		System.out.println("       .-\\:      /-.");
		System.out.println("      | (|:.     |) |");
		System.out.println("       '-|:.     |-'");
		System.out.println("         \\::.    /");
		System.out.println("          '::. .'");
		System.out.println("            ) (");
		System.out.println("          _.' '._");
		System.out.println("         `-------`");
	}
}
