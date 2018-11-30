
public class Metoder {

	public static void main(String[] args) 
	{
		System.out.println(volume(10));
		System.out.println(reverse("Hejsan"));
		System.out.println(count("Yoyoyo boys", 'o'));
		System.out.println(sjorovare("hej jag heter mikael"));

	}
	
	/**
	 * Tar in radien av ett klot och r�knar ut volymen
	 * @param radius radien av klotet
	 * @return volymen
	 */
	public static double volume(double radius) {
		double vol;
		vol = (4 * Math.PI * Math.pow(radius, 3)) / 3;
		return vol;
	}
	
	/**
	 * Tar in en text och skriver ut den bakl�nges
	 * @param str texten
	 * @return texten bakl�nges
	 */
	public static String reverse(String str) 
	{
	    String r = "";
	    for (int i=str.length()-1; i>=0; i--)
	      r = r + str.charAt(i);
	    return r;
	}
	
	/**
	 * Tar in en text och kollar hur m�nga av en viss bokstav �r med i den
	 * @param str texten
	 * @param c bokstaven
	 * @return hur m�nga g�nger bokstaven kom upp
	 */
	public static int count(String str, char c) 
	{
		int counter = 0;
		for (int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == c)
				counter++;
		}
		return counter;
	}
	
	/**
	 * Tar in en text och skriver ut den i sj�r�varspr�k
	 * @param str texten
	 * @return texten i sj�r�varspr�k
	 */
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
