
public class eachNames {

	public static void main(String[] args) {
		System.out.println("Det finns så här många unika namn: " + eNames());

	}
	
    public static int eNames() {
        int result = 0;
        int y;
        for(int i = 0; i < List.names.length; i++) {
            for (y = 0; y < List.names.length; y++) {
                if(List.names[i].equals(List.names[y])) 
                {
                    break;
                }
            }
            if (i == y) {
            	result++;
            }
        }

        return result;
    }

}
