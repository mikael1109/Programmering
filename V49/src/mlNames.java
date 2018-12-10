
public class mlNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
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
