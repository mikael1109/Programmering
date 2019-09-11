import java.util.ArrayList;
import java.util.Arrays;

public class Box {

	public Object[] list; // Listan för objekten som kommer lagras i klassen

	/**
	 * Skapar en array för klassen och lägger in alla objekt i den
	 * 
	 * @param obj
	 *            objekten som ska lagras i klassen
	 */
	public <T> Box(T... obj) {
		list = new Object[obj.length];
		for (int i = 0; i < obj.length; i++) {
			list[i] = obj[i];
		}
	}

	/**
	 * Skapar boxarna med olika värden lagrade i den och kallar sedan på comp med
	 * boxarna
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String hej = "hej";
		int i = 9;
		long l = 20009944;
		float f = 294;
		double d = 0.93;
		Box box1 = new Box(i, l, f, d);
		Box box2 = new Box(hej, 'c', 9, f, l);
		comp(box1, box2);

	}

	/**
	 * Skapar en int count och kollar ifall boxarna innehåller samma datatyp ifall
	 * de har de lägger de på en på count och skriver ut ett meddelande ifall count
	 * 0 i slutet av for loopen så skriver den att boxarna inte hade samma datatyper
	 * 
	 * @param box1 första boxen som ska jämföras
	 * @param box2 andra boxen som ska jämföras
	 */
	public static void comp(Box box1, Box box2) {
		int count = 0;
		for (int i = 0; i < box1.list.length; i++) {
			for (int y = 0; y < box2.list.length; y++) {
				if (box1.list[i] instanceof String && box2.list[y] instanceof String) {
					System.out.println("Båda boxarna innehåller String");
					count++;
				} else if (box1.list[i] instanceof Integer && box2.list[y] instanceof Integer) {
					System.out.println("Båda boxarna innehåller Integer");
					count++;
				} else if (box1.list[i] instanceof Character && box2.list[y] instanceof Character) {
					System.out.println("Båda boxarna innehåller Character");
					count++;
				} else if (box1.list[i] instanceof Long && box2.list[y] instanceof Long) {
					System.out.println("Båda boxarna innehåller Long");
					count++;
				} else if (box1.list[i] instanceof Float && box2.list[y] instanceof Float) {
					System.out.println("Båda boxarna innehåller Float");
					count++;
				} else if (box1.list[i] instanceof Double && box2.list[y] instanceof Double) {
					System.out.println("Båda boxarna innehåller Double");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("Inga av boxarna innehåller samma datatyp");
		}
	}

}
