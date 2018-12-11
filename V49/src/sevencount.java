
public class sevencount {

	public static void main(String[] args) 
	{
		System.out.println("Det finns " + sevenCount() + " sjuor i numbers");
	}
	
	/**
	 * Kollar nummer listan och tittar hur många gånger 7 förekommer
	 * @return skickar tillbaka hur många gånger 7 förekommer
	 */
	public static int sevenCount() {
		int count = 0;
		for (int i = 0; i < List.numbers.length; i++) {
			if (List.numbers[i] == 7) {
				count++;
			}
		}
		return count;
	}

}
