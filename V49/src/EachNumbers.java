import java.util.Arrays;

public class EachNumbers {

	public static void main(String[] args) {
		System.out.println("Det finns så här många av varje nummer, i ordning från 0 - 9 " + Arrays.toString(eNumbers()));
	}
	
	
	public static int[] eNumbers () {
		int[] list = new int[10];
		
        for(int i = 0; i < List.numbers.length; i++)
        {
            list[List.numbers[i]]++;
        }

        return list;
		}
}
