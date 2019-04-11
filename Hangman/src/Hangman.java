import java.util.ArrayList;
import java.util.Arrays;

import hangman.HangmanConsoleWindow;

public class Hangman {

	static HangmanConsoleWindow hcw = new HangmanConsoleWindow();
	static String SecretWord;
	static char guessChar;
	static String guessString;
	static int Health = 7;
	static String[] Words = {"BANANA", "APPLE", "CLOWN", "RABBIT", "HORSE", "HAM", "BUNNY", "ORANGE", "APPLESAUCE","SOCKERBALL"};
	static ArrayList<Integer> unlockedChars = new ArrayList<Integer>();
	
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
		SecretWord = hcw.nextString().toUpperCase();
		}while(numberCheck(SecretWord));
		hangmanGraphic();
	}
	
	public static void slumpat() {
		int rNumber = 0;
		rNumber = (int) (Math.random() * Words.length);
		SecretWord = Words[rNumber];
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
		if(guessString.equals(SecretWord)) {
			winMenu();
		}else if(!guessString.equals(SecretWord)){
			guessString = "";
			Health = Health - 1;
			hangmanGraphic();
		}
	}
	
	public static void guessCharCheck() {
		int count = 0;
		for (int i = 0; i < SecretWord.length(); i++) {
			if (guessChar == SecretWord.charAt(i)) {
				unlockedChars.add(i);
				count++;
			}
		}
		guessChar = ' ';
		if(count == 0) {
			Health = Health - 1;
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
		if (Health == 7) {
			hang1();
		}else if(Health == 6) {
			hang2();
		}else if(Health == 5) {
			hang3();
		}else if(Health == 4) {
			hang4();
		}else if(Health == 3) {
			hang5();
		}else if(Health == 2) {
			hang6();
		}else if(Health == 1) {
			hang7();
		}else if(Health == 0) {
			loseMenu();
			return;
		}
		hcw.println(); hcw.println();
		for (int i = 0; i < SecretWord.length(); i++) {
			if(unlockedChars.contains(i)) {
				charCount++;
				hcw.print(SecretWord.charAt(i) + "");
			}else {
				hcw.print("-");
			}
		}
		if(charCount == SecretWord.length()) {
			winMenu();
			return;
		}
		hcw.println();
		hcw.println();	
		hcw.println("Lives: " + Health);
		hcw.println();
		hcw.print("Your guess: ");
		guess();
	}
	
	
	public static void loseMenu() {
		hcw.clear();
		hang8();
		hcw.println("You lost, maybe try harder next time");
		restartCheck();
	}
	
	public static void winMenu(){
		hcw.clear();
		hcw.println("Congratulations you won");
		if(Health == 7) {
			hcw.println("You didn't lose any lives");
		}else if (Health == 6){
			hcw.println("You only lost 1 life");
		}else {
			hcw.println("You only lost " + (7 - Health) + " lives");
		}
		hcw.println("The word was: " + SecretWord);
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
			Health = 7;
			SecretWord = "";
			unlockedChars.clear();
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
		hcw.println("  | ");
		hcw.println("  | ");
		hcw.println("  | ");
		hcw.println(" _|_ ");
		hcw.println("|   |");
	}
	
	public static void hang4() {
		hcw.println("  |----- ");
		hcw.println("  | ");
		hcw.println("  | ");
		hcw.println(" _|_ ");
		hcw.println("|   |");
	}
	
	public static void hang5() {
		hcw.println("  |----- ");
		hcw.println("  |    O");
		hcw.println("  | ");
		hcw.println(" _|_ ");
		hcw.println("|   |");
	}
	
	public static void hang6() {
		hcw.println("  |----- ");
		hcw.println("  |    O");
		hcw.println("  |    |");
		hcw.println(" _|_ ");
		hcw.println("|   |");
	}
	
	public static void hang7() {
		hcw.println("  |----- ");
		hcw.println("  |    O");
		hcw.println("  |   /|>");
		hcw.println(" _|_ ");
		hcw.println("|   |");
	}
	
	public static void hang8() {
		hcw.println("  |----- ");
		hcw.println("  |    O");
		hcw.println("  |   /|>");
		hcw.println(" _|_  /´L");
		hcw.println("|   |");
	}

}
