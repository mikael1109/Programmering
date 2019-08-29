
public class ArraySummerare {

	public static void main(String[] args) {
		
		int[] Nummer = { 4, 3, 9, 7 };
		int sum = 0;
		for(int i = 0; i < Nummer.length; i++) {
			sum += Nummer[i];
		}
		System.out.println(sum);
	}

}