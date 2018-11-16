public class Uppgift5 {

	//Skapa ett program som med hjälp av loopar skriver ut följande mönster:
	//x
	//xx
	//xxx
	//xxxx
	public static void main(String[] args) 
	{
		for (int i = 0; i < 4; i++) // Loopar tills alla steps är utskrivna
		{
			for (int y = 0; y <= i; y++) { // Loopar tills alla x är utskrivna
				System.out.print("x"); // Skriver ut x
			}
			System.out.println(); // Skriver ut ett blankt steg, går ner till nästa rad
		}

	}

}
