
public class Uppgift4 {

	//Skriv ett program som ber�knar
	//summan av alla tal under 10 000 som �r j�mnt delbara med 7. 
	public static void main(String[] args) 
	{
		int tal = 0;
		for(int i = 0; i <= 10000; i++) { // Loopar tills i n�r 10 000,
			if (i%7 == 0) { // Ifall i modulos 7 = 0, ifall inget finns kvar n�r tar ut delar med 7
				tal = tal + i; // Plussar p� talet som kan delas med sju 
				System.out.println(i);
			}
		}
		System.out.println("Summan av alla tal som �r delbara med 7 blir: " + tal);
	}

}
