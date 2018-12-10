
public class TomCount {

	public static void main(String[] args) {
		System.out.println("Det finns " + tomCount() + " Toms i names");

	}
	
	public static int tomCount() {
		int nameCount = 0;
		for (int i = 0; i < List.names.length; i++) {
			if (List.names[i].equals("Tom")) {
				nameCount++;
			}
		}
		return nameCount;
	}

}
