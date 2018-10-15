import java.util.Scanner;
public class StringSjorovare {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv ett ord så skriver jag det i sjörövar språk, kul va!");
		System.out.println(sjorovare(scan.nextLine()));

	}
	
	public static String sjorovare(String str) 
	{
		String klartext = "";
		char kons[] = "bcdfghjklmnpqrstvwxz".toCharArray();
		for (int i = 0; i < str.length(); i++) 
		{
			String add = "";
			for(int y = 0; y < kons.length; y++) {
				if(str.charAt(i) == kons[y]) {
					add = "o" + str.charAt(i);
					break;
				}
			}
			klartext = klartext + str.charAt(i) + add; 
		}
		return klartext;
	}
}
