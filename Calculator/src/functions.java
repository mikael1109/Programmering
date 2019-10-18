public class functions {

	public String activeNumb = "";
	public String numb = "";
	public double sum;
	
	public static void main(String[] args) {
		
	}

	public void clear() {
		activeNumb = "";
		numb = "";
	}

	public void actNumb(char c) {
		activeNumb += c;
	}

	public void addNumb() {
		if (activeNumb.equals("")) {

		} else {
			numb += (activeNumb + "+");
			activeNumb = "";
		}
	}
	
	public void minus() {
		if (activeNumb.equals("")) {

		} else {
			numb += (activeNumb + "-");
			activeNumb = "";
		}
	}

	public void multiply() {
		if (activeNumb.equals("")) {

		} else {
			numb += (activeNumb + "x");
			activeNumb = "";
		}
	}
	public void divide() {
		if (activeNumb.equals("")) {

		} else {
			numb += (activeNumb + "/");
			activeNumb = "";
		}
	}

	public void execute() {
		int count = 0;
		int maxCount = 0;
		int prevFunc = 0;
		numb += activeNumb;
		char[] c = numb.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'x' || c[i] == '+' || c[i] == '/' || c[i] == '-') {
				maxCount++;
			}
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '+' || c[i] == 'x' || c[i] == '/' || c[i] == '-') {
				if (count == 0) {
					String firstNumb = "";
					for (int y = 0; y < i; y++) {
						if (c[y] == 'x' || c[y] == '+' || c[y] == '/' || c[y] == '-') {

						} else {
							firstNumb += c[y];
						}
					}
					sum = Double.parseDouble(firstNumb);
				}
				if(count > 0 || count != maxCount){
					String aNumb = "";
					for (int y = prevFunc; y < i; y++) {
						if (c[y] == 'x' || c[y] == '+' || c[y] == '/' || c[y] == '-') {

						} else {
							aNumb += c[y];
						}
					}
					if(c[prevFunc] == '+') {
						sum += Double.parseDouble(aNumb);
					}else if(c[prevFunc] == 'x') {
						sum *= Double.parseDouble(aNumb);
					}else if(c[prevFunc] == '/') {
						sum = sum/Double.parseDouble(aNumb);
					}else if(c[prevFunc] == '-') {
						sum -= Double.parseDouble(aNumb);
					}
				}
				count++;
				prevFunc = i;
				if(count == maxCount) {
					String aNumb = "";
					for (int y = prevFunc; y < c.length; y++) {
						if (c[y] == 'x' || c[y] == '+' || c[y] == '/' || c[y] == '-') {

						} else {
							aNumb += c[y];
						}
					}
					if(c[prevFunc] == '+') {
						sum += Double.parseDouble(aNumb);
					}else if(c[prevFunc] == 'x') {
						sum *= Double.parseDouble(aNumb);
					}else if(c[prevFunc] == '/') {
						sum = sum/Double.parseDouble(aNumb);
					}else if(c[prevFunc] == '-') {
						sum -= Double.parseDouble(aNumb);
					}
					if(sum % 1 == 0) {
						activeNumb = Integer.toString((int) sum);
					}else {
						activeNumb = Double.toString(sum);
					}
				}
			}
		}
	}

}
