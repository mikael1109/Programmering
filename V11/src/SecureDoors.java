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
	 * Sätter maxcount alltså hur många inputs man ska ha
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
				nameList.add(nameInput[1]); // Lägger till namnet i arraylisten
				System.out.println(nameInput[1] + " entered");
				count++;
			}else if(nameInput[0].equals("exit")) {
				nameList.remove(nameInput[1]); // Tar bort namnet från arraylisten
				System.out.println(nameInput[1] + " exited");
				count++; // Plussar på en på count varje gång en entry eller exit görs
			}
			
			if(count == maxCount) {
				exit = true; // stänger av programmet när maxcount = count
			}
		}
	}

}
