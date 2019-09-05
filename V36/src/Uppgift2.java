
public class Uppgift2 {

	static int count = 0; // en int som anv�nds f�r att se om hela ordet �r "bakv�nt"
	static String temp = ""; // en tempor�r string f�r att placera in char i omv�nd ordning

	/**
	 * Skapar en string som blir ordet som ska vara bakv�nt och kallar p� reverse
	 * metoden
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String ord = "Hejsan";
		System.out.println(reverse(ord));

	}

	/**
	 * Placerar ut charen l�ngst bak i string l�ngst fram i temp och kollar sedan
	 * ifall count �r lika med l�ngden p� stringen och d� �r ordet bakv�nt och
	 * returnar ordet
	 * 
	 * @param s ordet som ska reversas
	 * @return skickar tillbaka omv�nda stringen
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
