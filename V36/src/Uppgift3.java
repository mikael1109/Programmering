import java.util.Arrays;

public class Uppgift3 {

	/**
	 * Kallar på array metoden med flera olika objekt
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "hej";
		int tal = 5;
		char c = 't';
		System.out.println(Arrays.toString(array(s, tal, c)));

	}
	
	/**
	 * Tar in olika objekt och returnar de som en Array
	 * @param t Objekten som ska läggas in i arrayen
	 * @return Arrayen med objekten
	 */
	public static <T> T[] array(T... t) {
		return t;
	}

}
