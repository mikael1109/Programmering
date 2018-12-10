
public class Drusilla {
	
	public static void main(String[] args) 
	{
		System.out.println("Drusilla finns på platts: " + drusilla());
	}
	
	public static int drusilla() {
		int drusillaPlace = 0;
		for (int i = 0; i < List.names.length; i++) {
			if(List.names[i].equals("Drusilla"))
				drusillaPlace = i;
		}
		return drusillaPlace;
	}

}
