
public class mlNumbers {

	public static void main(String[] args) {
		System.out.println("Det finns flest av " + mlNumbers()[1] + ", " + mlNumbers()[0] + "st och minst av " + mlNumbers()[3] + ", " + mlNumbers()[2] + "st");

	}
	
	/**
	 * Kollar nummer listan och ser vilket nummer som förekommer mest respektive minst
	 * @return skickar tillbaka vilket nummer som förekommer mest och minst
	 */
	public static int[] mlNumbers () {
		int[] list = new int[10];
		int[] ml = new int[4];

        int max = 0;
        int ma = 0;
        int min = 0;
        int mi = 0;

        for(int i = 0; i < List.numbers.length; i++)
        {
            list[List.numbers[i]]++;
        }

        for (int i = 0; i < list.length; i++)
        {
            if(list[i] > max) {
            	max = list[i];
            	ma = i;
            }
        }
        min = max;
        for (int i = 0; i < list.length; i++) 
        {
        	if(list[i] < min) {
        		min = list[i];
        		mi = i;
        	}
        }
        
        ml[0] = max;
        ml[1] = ma;
        ml[2] = min;
        ml[3]= mi;
        return ml;
		}
}



