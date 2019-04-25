import java.util.ArrayList;
import java.util.Arrays;

import hangman.HangmanConsoleWindow;

public class Hangman {

	static HangmanConsoleWindow hcw = new HangmanConsoleWindow(); // Kallar p� HangmanConsoleWindow
	static String secretWord; // Hemliga ordet
	static char guessChar; // Char gissningen
	static String guessString; // String gissningen
	static int health = 7; // Spelarens liv
	static String[] Words = { "BANANA", "APPLE", "CLOWN", "RABBIT", "HORSE", "HAM", "BUNNY", "ORANGE", "APPLESAUCE",
			"FOOTBALL", "GAMING", "SOCCER", "CAR", "MAJORITY", "SOCIETY", "OPPRESION", "SPEEDWAGON", "FAST", "WAGON",
			"CROISSANT", "WITCH", "TREASURE", "HIDDEN", "PINEAPPLE", "STRENGTH", "ELECTRONIC", "NEGATIVE", "PARTICULAR",
			"POSSESSED", "RAZORBLADE" }; // ord listan
	static ArrayList<Integer> unlockedChars = new ArrayList<Integer>(); // Int lista som representerar bokst�ver man har
																		// l�st upp
	static ArrayList<String> wrongList = new ArrayList<>(); // Ord som har blivit gissade men inte �r r�tt.
	static ArrayList<Character> wrongListChar = new ArrayList<>(); // Bokst�ver som har blivit gissade men inte �r med i
																	// ordet

	/**
	 * Kallar p� start funktionen
	 */
	public static void main(String[] args) {
		start();
	}

	/**
	 * Clearar sk�rmen, Skriver ut ett start meddelande och kollar ifall man vill
	 * v�lja eget ord eller f� ett slumpat. Clearar sk�rmen efter.
	 */
	public static void start() {
		hcw.clear();
		String choice = "";
		int choiceInt = 0;
		hcw.println("Welcome to Hangman!");
		hcw.println("Do you want to choose a word");
		hcw.println("or get a random one?");
		hcw.println("1: choose / 2: random");
		do {
			choice = hcw.nextString();
		} while (!choiceCheck(choice));
		choiceInt = Integer.parseInt(choice);
		hcw.clear();
		if (choiceInt == 1) {
			egetOrd();
		} else if (choiceInt == 2) {
			slumpat();
		}

	}

	/**
	 * Ber anv�ndaren skriva in ett ord, l�ter inte anv�ndaren inte skriva ett ord
	 * med nummer eller speciella tecken.
	 */
	public static void egetOrd() {
		hcw.println("Please write your word!");
		do {
			secretWord = hcw.nextString().toUpperCase();
		} while (numberCheck(secretWord));
		hangmanGraphic();
	}

	/**
	 * Skapar en int och s�tter den till ett random number mellan 1 och ordlistans
	 * l�ngd, tar sedan bort en fr�n int:en eftersom listan index b�rjar p� 0,
	 * s�tter sedan ordet till ordet p� ordlistan vid numrets index. Kallar sedan p�
	 * hangmanGraphic
	 */
	public static void slumpat() {
		int rNumber = 0;
		rNumber = (int) (Math.random() * Words.length) + 1;
		secretWord = Words[rNumber - 1];
		hangmanGraphic();
	}

	/**
	 * Skapar en string guess, s�tter guess till n�sta string input ifall stringen
	 * inte har nummer i sig. kollar sen ifall guess �r en char eller inte genom att
	 * kalla p� charCheck. S�tter guessString till guess ifall det var en string och
	 * guessChar ifall det var en char. Kallar antingen p� guessStringCheck eller
	 * guessCharCheck beroende p� om det �r en char eller inte.
	 */
	public static void guess() {
		String guess = "";
		do {
			guess = hcw.nextString();
		} while (numberCheck(guess));
		if (!charCheck(guess)) {
			guessString = guess.toUpperCase();
			guessStringCheck();
		} else if (charCheck(guess)) {
			guessChar = Character.toUpperCase(guess.charAt(0));
			guessCharCheck();
		}
	}

	/**
	 * Kollar ifall gissning st�mmer med ordet ifall den g�r det kallar den p�
	 * winMenu, s� tar den bort ett liv och sen kallar p� hangmanGraphic
	 */
	public static void guessStringCheck() {
		if (guessString.equals(secretWord)) {
			winMenu();
		} else if (!guessString.equals(secretWord)) {
			health = health - 1;
			hangmanGraphic();
		}
	}

	/**
	 * Skapar en int count och kollar ifall char gissningen finns med i ordet ifall
	 * den g�r det l�gger den plattsen p� ordet den finns med p� unlockedChars
	 * plussar p� count. ifall count �r lika med noll n�r for loopen �r klar s� tar
	 * den bort ett liv och kallar p� hangmanGraphic annars s� kallar den bara den
	 * p� hangmanGraphic
	 */
	public static void guessCharCheck() {
		int count = 0;
		for (int i = 0; i < secretWord.length(); i++) {
			if (guessChar == secretWord.charAt(i)) {
				unlockedChars.add(i);
				count++;
			}
		}
		if (count == 0) {
			health = health - 1;
			hangmanGraphic();
		} else {
			hangmanGraphic();
		}
	}

	/**
	 * Kollar ifall s �r en char genom att kolla ifall den har mer �n 1 bokstav
	 * 
	 * @param s Stringen som ska kollas ifall den �r en char
	 * 
	 * @return skickar tillbaka true om det �r en char
	 */
	public static boolean charCheck(String s) {
		if (s.length() > 1) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean choiceCheck(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			hcw.println("Write either 1 or 2");
			return false;
		}
		if (Integer.parseInt(s) == 1 || Integer.parseInt(s) == 2) {
			return true;
		} else {
			hcw.println("Write either 1 or 2");
			return false;
		}
	}

	public static boolean numberCheck(String s) {
		ArrayList<Character> numbers = new ArrayList<Character>(
				Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.', ';', ':'));
		for (int i = 0; i < s.length(); i++) {
			if (numbers.contains(s.charAt(i))) {
				hcw.println("Don't use numbers, commas, dots");
				hcw.println("or semicolons in your word/guess.");
				return true;
			}
		}
		return false;
	}

	public static void hangmanGraphic() {
		int charCount = 0;
		hcw.clear();
		if (health == 7) {
			hang1();
		} else if (health == 6) {
			hang2();
		} else if (health == 5) {
			hang3();
		} else if (health == 4) {
			hang4();
		} else if (health == 3) {
			hang5();
		} else if (health == 2) {
			hang6();
		} else if (health == 1) {
			hang7();
		} else if (health == 0) {
			loseMenu();
			return;
		}
		hcw.println();
		hcw.println();
		for (int i = 0; i < secretWord.length(); i++) {
			if (unlockedChars.contains(i)) {
				charCount++;
				hcw.print(secretWord.charAt(i) + "");
			} else if (!wrongList.contains(guessString) && guessString != null) {
				wrongList.add(guessString);
				hcw.print("-");
			} else if (!wrongListChar.contains(guessChar) && guessChar != '\0' && !charInWord(guessChar)) {
				wrongListChar.add(guessChar);
				hcw.print("-");
			} else {
				hcw.print("-");
			}
		}
		if (charCount == secretWord.length()) {
			winMenu();
			return;
		}
		hcw.println();
		hcw.println();
		hcw.println("Lives: " + health);
		hcw.println();
		if (wrongList.size() == 0) {
			hcw.println();
		} else {
			hcw.println(wrongList.toString());
		}
		if (wrongListChar.size() == 0) {
			hcw.println();
		} else {
			hcw.println(wrongListChar.toString());
		}
		hcw.println();
		hcw.print("Your guess: ");
		guessChar = '\0';
		guessString = null;
		guess();
	}

	public static boolean charInWord(char c) {
		for (int i = 0; i < secretWord.length(); i++) {
			if (c == secretWord.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	public static void loseMenu() {
		hcw.clear();
		hang8();
		hcw.println("You lost, maybe try harder next time");
		hcw.println("The word was: " + secretWord);
		restartCheck();
	}

	public static void winMenu() {
		hcw.clear();
		hcw.println("Congratulations you won");
		if (health == 7) {
			hcw.println("You didn't lose any lives");
		} else if (health == 6) {
			hcw.println("You only lost 1 life");
		} else {
			hcw.println("You only lost " + (7 - health) + " lives");
		}
		hcw.println("The word was: " + secretWord);
		restartCheck();
	}

	public static void restartCheck() {
		hcw.println();
		hcw.println("Do you want to play again?");
		hcw.println("1 : Yes / 2 : No");
		String choice = "";
		int choiceInt = 0;
		do {
			choice = hcw.nextString();
		} while (!choiceCheck(choice));
		choiceInt = Integer.parseInt(choice);
		if (choiceInt == 1) {
			health = 7;
			secretWord = "";
			unlockedChars.clear();
			wrongList.clear();
			wrongListChar.clear();
			guessChar = '\0';
			guessString = null;
			start();
		} else {
			hcw.exit();
		}
	}

	public static void hang1() {
		hcw.println();
		hcw.println();
		hcw.println();
		hcw.println();
		hcw.println();
	}

	public static void hang2() {
		hcw.println();
		hcw.println();
		hcw.println();
		hcw.println(" ___ ");
		hcw.println("|   |");
	}

	public static void hang3() {
		hcw.println("  / ");
		hcw.println("  | ");
		hcw.println("  | ");
		hcw.println(" _|_ ");
		hcw.println("|   |");
	}

	public static void hang4() {
		hcw.println("  /----- ");
		hcw.println("  | ");
		hcw.println("  | ");
		hcw.println(" _|_ ");
		hcw.println("|   |");
	}

	public static void hang5() {
		hcw.println("  /----- ");
		hcw.println("  |    O");
		hcw.println("  | ");
		hcw.println(" _|_ ");
		hcw.println("|   |");
	}

	public static void hang6() {
		hcw.println("  /----- ");
		hcw.println("  |    O");
		hcw.println("  |    |");
		hcw.println(" _|_ ");
		hcw.println("|   |");
	}

	public static void hang7() {
		hcw.println("  /----- ");
		hcw.println("  |    O");
		hcw.println("  |   /|>");
		hcw.println(" _|_ ");
		hcw.println("|   |");
	}

	public static void hang8() {
		hcw.println("  /----- ");
		hcw.println("  |    O");
		hcw.println("  |   /|>");
		hcw.println(" _|_  /�L");
		hcw.println("|   |");
	}

}
