
public class LitenStor {

	public static void main(String[] args) {
		System.out.println(smallest(5,9));
	}
	
	public static int smallest(int uno, int dos) {
		if(uno > dos) {
			return dos;
		}else if(dos > uno) {
			return uno;
		}else {
			System.out.println("Samma nummer");
			return 0;
		}
	}

}
