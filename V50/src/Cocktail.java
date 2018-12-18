import java.util.Arrays;

public class Cocktail {

	public static void main(String[] args) 
	{
		int[] randomNumbers = new int[20];
		
		for (int i = 0; i < randomNumbers.length; i++) 
		{
			randomNumbers[i] = (int) (Math.random() * 20) + 1;
		}
		
		System.out.println(Arrays.toString(randomNumbers));
		System.out.println("Det tog " + cocktail(randomNumbers) + " iterations för att sortera listan");
		System.out.println(Arrays.toString(randomNumbers));
	}
	
	public static int cocktail(int[] numb) 
	{
		int temp = 0;
		int count = 0;
		boolean done = false;
		boolean next = false;
		
		do {
			done = true;
			for (int i = 0; i < numb.length - 1; i++) {
				if(numb[i] > numb[i + 1]) {
					temp = numb[i + 1];
					numb[i + 1] = numb[i];
					numb[i] = temp;
					done = false;
				}
				count++;
				System.out.println(Arrays.toString(numb));
				if(numb.length - 1 == i)
					next = true;
			}
		}while(!done && !next);
		do {
			for (int j = 19; j > 0; j--) {
				if(numb[j] < numb[j - 1]) {
					temp = numb[j];
					numb[j] = numb[j - 1];
					numb[j - 1] = temp;
				}
				count++;
				System.out.println(Arrays.toString(numb));
			}
		}while(!done && next);
		return count;
	}

}
