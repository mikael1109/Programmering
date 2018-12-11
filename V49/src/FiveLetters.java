
public class FiveLetters {

	public static void main(String[] args) {
		System.out.println("Det finns " + fiveLetters() + " namn som innehåller 5 bokstäver");
	}
	
	/**
	 * Kollar namn listan och skickar tillbaka alla namn på 5 bokstäver
	 * @return skickar tillbaka alla namn på 5 bokstäver
	 */
	public static int fiveLetters() {
		int counts = 0;
		for (int i = 0; i < List.names.length; i++) {
			if(List.names[i].length() == 5) {
				counts++;
			}
		}
		return counts;
	}

}
