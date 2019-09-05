
public class Uppgift2 {

	static int count = 0; // en int som används för att se om hela ordet är "bakvänt"
	static String temp = ""; // en temporär string för att placera in char i omvänd ordning

	/**
	 * Skapar en string som blir ordet som ska vara bakvänt och kallar på reverse
	 * metoden
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String ord = "Hejsan";
		System.out.println(reverse(ord));

	}

	/**
	 * Placerar ut charen längst bak i string längst fram i temp och kollar sedan
	 * ifall count är lika med längden på stringen och då är ordet bakvänt och
	 * returnar ordet
	 * 
	 * @param s ordet som ska reversas
	 * @return skickar tillbaka omvända stringen
	 */
	public static String reverse(String s) {
		temp += s.charAt(s.length() - count - 1);
		count++;
		if (count >= s.length()) {
			return s;
		}
		reverse(s);
		return temp;
	}

}
