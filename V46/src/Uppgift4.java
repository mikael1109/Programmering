
public class Uppgift4 {

	public static void main(String[] args) 
	{
		int tal = 0;
		for(int i = 0; i <= 10000; i++) { // Startar loopen, forsätter tills i blir 10000. i lägger en gång i taget
			if (i%7 == 0) { // Ifall i modulos 7 = 0, ifall inget finns kvar när tar ut delar med 7
				tal = tal + i; // Plussar på talet som kan delas med sju 
				System.out.println(i);
			}
		}
		System.out.println("Summan av alla tal som är delbara med 7 blir: " + tal);
	}

}
