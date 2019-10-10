
public class functions {
	
	public String activeNumb = "";
	public int prevNumb;
	public int activeFunc;
	
	public void functions(){
		actNumb(0);
		clear();
	}
	
	public void clear() {
		activeNumb = "";
	}
	
	public void actNumb(int i) {
		activeNumb += Integer.toString(i);
	}
	
	public void addNumb() {
		activeFunc = 1;
	}

}
