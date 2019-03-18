import java.util.Scanner;
import java.util.ArrayList;
public class SecureDoors {
	
	static int maxCount = 0;
	static int count = 0;
	static Scanner input = new Scanner(System.in);
	static boolean exit = false;
	static ArrayList<String> nameList = new ArrayList<>();
	public static void main(String[] args) 
	{
		start();
		inputCheck();
	}
	
	public static void start() {
		while(maxCount < 1 || maxCount > 1000) {
		maxCount = input.nextInt();
		}
	}
	
	public static void inputCheck() {
		while(!exit) {
			String[] nameInput = input.nextLine().split(" ");
			if (nameInput[0].equals("entry") && nameList.contains(nameInput[1])){
				System.out.println(nameInput[1] + " entered (ANOMALY)");
				count++;
			}else if(nameInput[0].equals("exit") && !nameList.contains(nameInput[1])) {
				System.out.println(nameInput[1] + " exited (ANOMALY)");
				count++;
			}else if(nameInput[0].equals("entry")) {
				nameList.add(nameInput[1]);
				System.out.println(nameInput[1] + " entered");
				count++;
			}else if(nameInput[0].equals("exit")) {
				nameList.remove(nameInput[1]);
				System.out.println(nameInput[1] + " exited");
				count++;
			}
			
			if(count == maxCount) {
				exit = true;
			}
		}
	}

}
