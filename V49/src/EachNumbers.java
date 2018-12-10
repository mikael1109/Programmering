import java.util.Arrays;

public class EachNumbers {

	public static void main(String[] args) {
		System.out.println("Det finns så här många av varje nummer, i ordning från 0 - 9 " + Arrays.toString(eNumbers()));
	}
	
	
	public static int[] eNumbers () {
		int[] list = new int[10];

        int max = 0;
        int maxNumber = 0;

        int min = 0;
        int minNumber = 0;

        for(int i = 0; i < List.numbers.length; i++)
        {
            list[List.numbers[i]]++;
        }

        for (int i = 0; i < list.length; i++)
        {
            if(i == 0)
            {
                min = list[i];
                continue;
            }

            if(list[i] > max)
            {
                max = list[i];
                maxNumber = i;
            }

            if(list[i] <= min)
            {
                min = list[i - 1];
                minNumber = i;
            }
            
        }
        return list;
		}
}
