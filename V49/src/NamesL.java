
public class NamesL {

	public static void main(String[] args) 
	{
		System.out.println("Det finns " + namesL() + " namn som b�rjar p� L");
	}
	
	public static int namesL() {
		int counter = 0;
		for (int i = 0; i < List.names.length; i++) {
			if(List.names[i].charAt(0) == 'L') {
				counter++;
			}
		}
		return counter;
	}

}
