
public class mlNames {

	public static void main(String[] args) 
	{
		System.out.println(mlNames() + " förekommer mest i namn listan");
	}
	
	/**
	 * Kollar namn listan och ser vilket namn förekommer mest
	 * @return skickar tillbaka namnet som förekommer mest
	 */
    private static String mlNames() {
        int mName = 0;
        int big = 0;

        for (int i = 0; i < List.names.length; i++) {
            int cur = 0;

            for (int j = 0; j < List.names.length; j++) {
                if(List.names[i].equals(List.names[j]))
                    cur++;
            }

            if(cur > big) {
                big = cur;
                mName = i;
            }
        }

        return List.names[mName];
    }

}
