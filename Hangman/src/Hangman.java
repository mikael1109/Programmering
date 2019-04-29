import java.util.ArrayList;
import java.util.Arrays;

import hangman.HangmanConsoleWindow;

public class Hangman {

	static HangmanConsoleWindow hcw = new HangmanConsoleWindow(); // Skapar en HangmanConsoleWindow
	static String secretWord; // Hemliga ordet
	static char guessChar; // Char gissningen
	static String guessString; // String gissningen
	static int health = 7; // Spelarens liv
	static String[] Words = { "BANANA", "APPLE", "CLOWN", "RABBIT", "HORSE", "HAM", "BUNNY", "ORANGE", "APPLESAUCE",
			"FOOTBALL", "GAMING", "SOCCER", "CAR", "MAJORITY", "SOCIETY", "OPPRESION", "SPEEDWAGON", "FAST", "WAGON",
			"CROISSANT", "WITCH", "TREASURE", "HIDDEN", "PINEAPPLE", "STRENGTH", "ELECTRONIC", "NEGATIVE", "PARTICULAR",
			"POSSESSED", "RAZORBLADE" }; // ord listan
	static ArrayList<Integer> unlockedChars = new ArrayList<Integer>(); // Int lista som representerar bokstäver man har
																		// gissat rätt på
	static ArrayList<String> wrongList = new ArrayList<>(); // Ord som har blivit gissade men inte är rätt.
	static ArrayList<Character> wrongListChar = new ArrayList<>(); // Bokstäver som har blivit gissade men inte är med i
																	// ordet

	/**
	 * Kallar på start funktionen
	 */
	public static void main(String[] args) {
		start();
	}

	/**
	 * Clearar skärmen, Skriver ut ett start meddelande och kollar ifall man vill
	 * välja eget ord eller få ett slumpat. Sätter choice till nästa string och
	 * kollar ifall choiceCheck() är false ifall ja så går den vidare annars
	 * fortsätter den sätta choice till nästa string. Sätter choiceInt till choice
	 * omgjord till en int. Kallar på egetOrd() om choiceInt är 1 och slumpat()
	 * ifall choiceInt är 2.
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
	 * Ber användaren skriva in ett ord, kollar ifall numberCheck() är true annars
	 * så fortsätter den fråga. Kallar sen på hangmanGraphic().
	 */
	public static void egetOrd() {
		hcw.println("Please write your word!");
		do {
			secretWord = hcw.nextString().toUpperCase();
		} while (numberCheck(secretWord));
		hangmanGraphic();
	}

	/**
	 * Skapar en int och sätter den till ett random number mellan 1 och ordlistans
	 * längd, tar sedan bort en från int:en eftersom listan index börjar på 0,
	 * sätter sedan ordet till ordet på ordlistan vid numrets index. Kallar sedan på
	 * hangmanGraphic
	 */
	public static void slumpat() {
		int rNumber = 0;
		rNumber = (int) (Math.random() * Words.length) + 1;
		secretWord = Words[rNumber - 1];
		hangmanGraphic();
	}

	/**
	 * Skapar en string guess, sätter guess till nästa string input ifall stringen
	 * inte har nummer i sig. kollar sen ifall guess är en char eller inte genom att
	 * kalla på charCheck. Sätter guessString till guess ifall det var en string och
	 * guessChar ifall det var en char. Kallar antingen på guessStringCheck eller
	 * guessCharCheck beroende på om det är en char eller inte.
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
	 * Kollar ifall gissning stämmer med ordet ifall den gör det kallar den på
	 * winMenu, så tar den bort ett liv och sen kallar på hangmanGraphic
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
	 * den gör det lägger den plattsen på ordet den finns med på unlockedChars och
	 * plussar på count. ifall count är lika med noll när for loopen är klar så tar
	 * den bort ett liv och kallar på hangmanGraphic annars så kallar den bara den
	 * på hangmanGraphic
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
	 * Kollar ifall s är en char genom att kolla ifall den har mer än 1 bokstav
	 * 
	 * @param s
	 *            Stringen som ska kollas ifall den är en char
	 * 
	 * @return skickar tillbaka true om det är en char
	 */
	public static boolean charCheck(String s) {
		if (s.length() > 1) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Kollar så att stringen s är ett nummer och är antigen 1 och 2.
	 * 
	 * @param s
	 *            stringen som ska kollas
	 * @return skickar tillbaka sant om stringen är antigen 1 eller 2 annars false.
	 */
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

	/**
	 * kollar så att stringen s inte innehåller nåt av arraylisten numbers.
	 * 
	 * @param s
	 *            stringen som ska kollas.
	 * @return skickar tillbaka sant om stringen innehåller nåt av arraylistan
	 *         annars false.
	 */
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

	/**
	 * Börjar med cleara skärmen sätter sedan charCount till 0, skriver sedan ut
	 * hangman gubben beroende på hur mycket liv man har.
	 */
	public static void hangmanGraphic() {
		hcw.clear();
		int charCount = 0;
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
			if (unlockedChars.contains(i)) { // Kollar ifall plattsen på secretWord(i) finns med i unlockedChars, ifall
												// den
												// gör det så skriver den ut char:en vid i och lägger till en på
												// charCount.
				charCount++;
				hcw.print(secretWord.charAt(i) + "");
			} else if (!wrongList.contains(guessString) && guessString != null) { // Kollar ifall inte wrongList
																					// innehåller gissningen och
																					// gissningen inte är tom så lägger
																					// den till gissningen i wrongList.
				wrongList.add(guessString);
				hcw.print("-");
			} else if (!wrongListChar.contains(guessChar) && guessChar != '\0' && !charInWord(guessChar)) { // Kollar så
																											// wrongListChar
																											// inte
																											// innehåller
																											// gissningen(char)
																											// och så
																											// att
																											// gisnningen(char)
																											// inte är
																											// null och
																											// kollar så
																											// att
																											// charInWord()
																											// är false.
				wrongListChar.add(guessChar);
				hcw.print("-");
			} else {
				hcw.print("-");
			}
		}
		if (charCount == secretWord.length()) { // Kolllar ifall charCount är samma som längden av secretWord ifall ja
												// så går kallar den på winMenu och går ut funktionen.
			winMenu();
			return;
		}
		hcw.println();
		hcw.println();
		hcw.println("Lives: " + health); // Skriver ut spelarens liv.
		hcw.println();
		if (wrongList.size() == 0) { // Kollar ifall wrongList är tom, ifall ja så skriver den ut en tom rad annars
										// skriver den ut wrongList.
			hcw.println();
		} else {
			hcw.println(wrongList.toString());
		}
		if (wrongListChar.size() == 0) { // Kollar ifall wrongListChar är, ifall ja så skriver den ut en tom rad annars
											// skriver den ut wrongListChar.
			hcw.println();
		} else {
			hcw.println(wrongListChar.toString());
		}
		hcw.println();
		hcw.print("Your guess: ");
		guessChar = '\0'; // Sätter guessChar till null.
		guessString = null; // Sätter guessString till null.
		guess(); // Kallar på guess()
	}

	/**
	 * Kollar ifall char c finns med i secretWord.
	 * 
	 * @param c
	 *            char:en som ska kollas.
	 * @return skickar tillbaka true ifall c finns med i ordet annars false.
	 */
	public static boolean charInWord(char c) {
		for (int i = 0; i < secretWord.length(); i++) {
			if (c == secretWord.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Clearar fönstret, skriver ut hangman gubbens sista nivå och förlöst
	 * meddelandet och kallar sen på restartCheck().
	 */
	public static void loseMenu() {
		hcw.clear();
		hang8();
		hcw.println("You lost, maybe try harder next time");
		hcw.println("The word was: " + secretWord);
		restartCheck();
	}

	/**
	 * Clearar fönstret, skriver ut vinst meddelande beronde på hur många liv
	 * spelaren har kvar och kallar sen på restartCheck().
	 */
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

	/**
	 * Frågar ifall spelaren vill spela igen, sätter choice till nästa string,
	 * kollar ifall choiceCheck() är false ifall ja så fortsätter den annars
	 * fortsätter den sätta choice till nästa string. Sätter choiceInt till choice
	 * omgjord till int. ifall choiceInt är 1 så startar den ett nytt spell annars
	 * stänger den av programmet.
	 */
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
		hcw.println(" _|_  /´L");
		hcw.println("|   |");
	}

}
