public class Uppgift5 {

	//Skapa ett program som med hj�lp av loopar skriver ut f�ljande m�nster:
	//x
	//xx
	//xxx
	//xxxx
	public static void main(String[] args) 
	{
		for (int i = 0; i < 4; i++) // Loopar tills alla steps �r utskrivna
		{
			for (int y = 0; y <= i; y++) { // Loopar tills alla x �r utskrivna
				System.out.print("x"); // Skriver ut x
			}
			System.out.println(); // Skriver ut ett blankt steg, g�r ner till n�sta rad
		}

	}

}
