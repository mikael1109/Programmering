import java.util.ArrayList;
import java.util.Arrays;

public class Box{

	public Object[] list;
	
	public <T> Box (T... obj) {
		list = new Object[obj.length];
		for(int i = 0; i < obj.length; i++) {
			list[i] = obj[i];
		}
	}
	
	public static void main(String[] args) {
		String hej = "hej";
		int i = 9;
		Box box1 = new Box(i);
		Box box2 = new Box(hej);
		System.out.println(Arrays.toString(box1.list));
		System.out.println(Arrays.toString(box2.list));
		comp(box1, box2);
		
	}
	
	public static void comp(Box box1, Box box2) {
		for(int i = 0; i < box1.list.length; i++) {
			if(box1.list[i] instanceof String) {
				for(int y = 0; y < box2.list.length; y++) {
					if(box2.list[y] instanceof String) {
						System.out.println("Båda boxarna innehåller String");
					}
				}
			}else if(box1.list[i] instanceof Integer) {
				for(int y = 0; y < box2.list.length; y++) {
					if(box2.list[y] instanceof Integer) {
						System.out.println("Båda boxarna innehåller Integer");
					}
				}
			}else if(box1.list[i] instanceof Character) {
				for(int y = 0; y < box2.list.length; y++) {
					if(box2.list[y] instanceof Character) {
						System.out.println("Båda boxarna innehåller Character");
					}
				}
			}else {
				System.out.println("Inga av boxarna innehåller samma datatyp");
			}
		}
	}

}
