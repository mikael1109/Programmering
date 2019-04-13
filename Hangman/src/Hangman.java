import java.util.ArrayList;
import java.util.Arrays;

import hangman.HangmanConsoleWindow;

public class Hangman {

	static HangmanConsoleWindow hcw = new HangmanConsoleWindow();
	static String secretWord;
	static char guessChar;
	static String guessString;
	static int health = 7;
	static String[] Words = {"BANANA", "APPLE", "CLOWN", "RABBIT", "HORSE", "HAM", "BUNNY", "ORANGE", "APPLESAUCE","SOCKERBALL"};
	static ArrayList<Integer> unlockedChars = new ArrayList<Integer>();
	static ArrayList<String> wrongList = new ArrayList<>();
	static ArrayList<Character> wrongListChar = new ArrayList<>();
	
	public static void main(String[] args) {
		start();
	}
	
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
		}while(!choiceCheck(choice));
		choiceInt = Integer.parseInt(choice);
		hcw.clear();
		if(choiceInt == 1) {
			egetOrd();
		}else if(choiceInt == 2){
			slumpat();
		}
		
	}
	
	public static void egetOrd() {
		hcw.println("Please write your word!");
		do {
		secretWord = hcw.nextString().toUpperCase();
		}while(numberCheck(secretWord));
		hangmanGraphic();
	}
	
	public static void slumpat() {
		int rNumber = 0;
		rNumber = (int) (Math.random() * Words.length) + 1;
		secretWord = Words[rNumber - 1];
		hangmanGraphic();
	}
	
	public static void guess() {
		String guess = "";
		guess = hcw.nextString();
		if(!charCheck(guess)) {
			guessString = guess.toUpperCase();
			guessStringCheck();
		}else if(charCheck(guess)) {
			guessChar = Character.toUpperCase(guess.charAt(0));
			guessCharCheck();
		}
	}
	
	public static void guessStringCheck() {
		if(guessString.equals(secretWord)) {
			winMenu();
		}else if(!guessString.equals(secretWord)){
			health = health - 1;
			hangmanGraphic();
		}
	}
	
	public static void guessCharCheck() {
		int count = 0;
		for (int i = 0; i < secretWord.length(); i++) {
			if (guessChar == secretWord.charAt(i)) {
				unlockedChars.add(i);
				count++;
			}
		}
		if(count == 0) {
			health = health - 1;
			hangmanGraphic();
		}else {
			hangmanGraphic();
		}
	}
	
	public static boolean charCheck(String s) {
		if (s.length() > 1) {
			return false;
		}else{
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
		if(Integer.parseInt(s) == 1 || Integer.parseInt(s) == 2) {
			return true;
		}else {
			hcw.println("Write either 1 or 2");
			return false;
		}
	}
	
	public static boolean numberCheck(String s) {
		ArrayList<Character> numbers = new ArrayList<Character>(Arrays.asList('1','2','3','4','5','6','7','8','9','0',',','.',';',':'));
		for(int i = 0; i < s.length(); i++) {
			if(numbers.contains(s.charAt(i))){
				hcw.println("Don't use numbers, commas, dots");
				hcw.println("or semicolons in your word.");
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
		}else if(health == 6) {
			hang2();
		}else if(health == 5) {
			hang3();
		}else if(health == 4) {
			hang4();
		}else if(health == 3) {
			hang5();
		}else if(health == 2) {
			hang6();
		}else if(health == 1) {
			hang7();
		}else if(health == 0) {
			loseMenu();
			return;
		}
		hcw.println(); hcw.println();
		for (int i = 0; i < secretWord.length(); i++) {
			if(unlockedChars.contains(i)) {
				charCount++;
				hcw.print(secretWord.charAt(i) + "");
			}else if(!wrongList.contains(guessString) && guessString != null){
				wrongList.add(guessString);
				hcw.print("-");
			}else if(!wrongListChar.contains(guessChar) && guessChar != '\0' && !charInWord(guessChar)){
				wrongListChar.add(guessChar);
				hcw.print("-");
			}else{
				hcw.print("-");
			}
		}
		if(charCount == secretWord.length()) {
			winMenu();
			return;
		}
		hcw.println();
		hcw.println();	
		hcw.println("Lives: " + health);
		hcw.println();
		if(wrongList.size() == 0) {
			hcw.println();
		}else {
			hcw.println(wrongList.toString());
		}
		if(wrongListChar.size() == 0) {
			hcw.println();
		}else {
			hcw.println(wrongListChar.toString());
		}
		hcw.println();
		hcw.print("Your guess: ");
		guessChar = '\0';
		guessString = null;
		guess();
	}
	
	public static boolean charInWord(char c) {
		for(int i = 0; i < secretWord.length(); i++) {
			if(c == secretWord.charAt(i)) {
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
	
	public static void winMenu(){
		hcw.clear();
		hcw.println("Congratulations you won");
		if(health == 7) {
			hcw.println("You didn't lose any lives");
		}else if (health == 6){
			hcw.println("You only lost 1 life");
		}else {
			hcw.println("You only lost " + (7 - health) + " lives");
		}
		hcw.println("The word was: " + secretWord);
		restartCheck();
	}
	
	public static void restartCheck(){
		hcw.println();
		hcw.println("Do you want to play again?");
		hcw.println("1 : Yes / 2 : No");
		String choice = "";
		int choiceInt = 0;
		do {
			choice = hcw.nextString();
		}while(!choiceCheck(choice));
		choiceInt = Integer.parseInt(choice);
		if(choiceInt == 1) {
			health = 7;
			secretWord = "";
			unlockedChars.clear();
			wrongList.clear();
			wrongListChar.clear();
			guessChar = '\0';
			guessString = "";
			start();
		}else {
			hcw.exit();
		}
	}
	
	public static void hang1(){
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
