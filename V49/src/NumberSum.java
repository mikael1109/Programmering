
public class NumberSum {

	public static void main(String[] args) {
		System.out.println("Summan av alla j�mna tal �r: " + sum());

	}
	
	/**
	 * Kollar nummer listan och kollar hur m�nga tal �r j�mna och summerar sen dem
	 * @return skickar tillbaka summan av alla j�mna tal
	 */
	public static int sum() {
		int sum = 0;
		for (int i = 0; i < List.numbers.length; i++) {
			if (i%2 == 0) {
				sum = sum + List.numbers[i];
			}
		}
		return sum;
	}

}
