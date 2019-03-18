import java.util.Scanner;
import java.util.ArrayList;
public class SecureDoors {
	
	static int maxCount = 0;
	static int count = 0;
	static boolean exit = false;
	static Scanner input = new Scanner(System.in); // Skapar Scanner
	static ArrayList<String> nameList = new ArrayList<>(); // Skapar Arraylisten
	
	public static void main(String[] args) 
	{
		start(); 
		inputCheck();
	}
	
	/**
	 * S�tter maxcount allts� hur m�nga inputs man ska ha
	 */
	public static void start() {
		while(maxCount < 1 || maxCount > 1000) {
		maxCount = input.nextInt();
		}
	}
	
	public static void inputCheck() {
		while(!exit) {
			String[] nameInput = input.nextLine().split(" "); // Splittar stringen vid mellanrummet
			if (nameInput[0].equals("entry") && nameList.contains(nameInput[1])){ // Kollar ifall entry finns med innan och ifall namnet finns i arraylisten
				System.out.println(nameInput[1] + " entered (ANOMALY)");
				count++;
			}else if(nameInput[0].equals("exit") && !nameList.contains(nameInput[1])) { // Kollar ifall exit finns med innan och ifall namnet inte finns med i arraylisten
				System.out.println(nameInput[1] + " exited (ANOMALY)");
				count++;
			}else if(nameInput[0].equals("entry")) { 
				nameList.add(nameInput[1]); // L�gger till namnet i arraylisten
				System.out.println(nameInput[1] + " entered");
				count++;
			}else if(nameInput[0].equals("exit")) {
				nameList.remove(nameInput[1]); // Tar bort namnet fr�n arraylisten
				System.out.println(nameInput[1] + " exited");
				count++; // Plussar p� en p� count varje g�ng en entry eller exit g�rs
			}
			
			if(count == maxCount) {
				exit = true; // st�nger av programmet n�r maxcount = count
			}
		}
	}

}
