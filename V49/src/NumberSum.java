
public class NumberSum {

	public static void main(String[] args) {
		System.out.println("Summan av alla jämna tal är: " + sum());

	}
	
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
