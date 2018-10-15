import java.util.Scanner;
public class IntCount {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		char c;
		String str;
		System.out.println("Skriv ett ord sedan en bokstav");
		str = scan.nextLine();
		c = scan.nextLine().charAt(0);
		System.out.println("Bokstaven förekommer " + count(str, c) + " gång(er) i ordet");

	}
	
	public static int count(String str, char c) 
	{
		int counter = 0;
		for (int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == c)
				counter++;
		}
		return counter;
	}

}
