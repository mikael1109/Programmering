
public class FiveLetters {

	public static void main(String[] args) {
		System.out.println("Det finns " + fiveLetters() + " namn som inneh�ller 5 bokst�ver");
	}
	
	/**
	 * Kollar namn listan och skickar tillbaka alla namn p� 5 bokst�ver
	 * @return skickar tillbaka alla namn p� 5 bokst�ver
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
