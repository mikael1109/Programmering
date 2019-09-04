import java.util.ArrayList;

public class Uppgift1 {

	/**
	 * Skapar en arraylista och lägger till 9 tal mellan 1 och 15 i arraylistan och
	 * kallar sedan på summerare med arraylistan
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> talLista = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			talLista.add((int) (Math.random() * 15) + 1);
		}
		System.out.println(talLista.toString());
		System.out.println(summerare(talLista));

	}

	/**
	 * Går igenom listan med en for loop och plussar på alla tal i den i sum
	 * 
	 * @param lista
	 *            Int Arraylistan man vill summera
	 * @return skickar tillbaka sum med summan av arraylistan
	 */
	public static int summerare(ArrayList<Integer> lista) {
		int sum = 0;
		for (int i = 0; i < lista.size(); i++) {
			sum += lista.get(i);
		}
		return sum;
	}

}
