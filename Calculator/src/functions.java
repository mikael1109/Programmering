public class functions {

	public String activeNumb = "";
	public String numb = "";
	public double sum;

	/**
	 * sätter activeNumb och numb till ett tomt värde
	 */
	public void clear() {
		activeNumb = "";
		numb = "";
	}

	/**
	 * plussar på en siffra eller en punkt i stringen activeNumb
	 * 
	 * @param c
	 *            siffran eller punkten
	 */
	public void actNumb(char c) {
		activeNumb += c;
	}

	/**
	 * ifall activeNumb är tom gör den ingenting annars så plussar activeNumb och
	 * ett pluss tecken och sätter activeNumb till ett tomt värde
	 */
	public void addNumb() {
		if (activeNumb.equals("")) {

		} else {
			numb += (activeNumb + "+");
			activeNumb = "";
		}
	}

	/**
	 * Fungerar samma som addNumb fast med minus
	 */
	public void minus() {
		if (activeNumb.equals("")) {

		} else {
			numb += (activeNumb + "-");
			activeNumb = "";
		}
	}

	/**
	 * Fungerar samma som addNumb fast med gånger
	 */
	public void multiply() {
		if (activeNumb.equals("")) {

		} else {
			numb += (activeNumb + "x");
			activeNumb = "";
		}
	}

	/**
	 * Fungerar samma som addNumb fast med delat med
	 */
	public void divide() {
		if (activeNumb.equals("")) {

		} else {
			numb += (activeNumb + "/");
			activeNumb = "";
		}
	}

	/**
	 * Kollar först hur många operatorer det finns i numb sen ifall count är 0 som
	 * den är vid första talet sätter den firstNumb till till första talet och
	 * sätter sum till firstNumb. Efter detta sätts prevFunc till i så nästa varv
	 * har man värdet på förra operatorn sen så går den mellan operatorna och
	 * använder lämpliga operatorer tills count är lika maxCount och då går den från
	 * prevFunc till slutet på numb.
	 */
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
				if (count > 0 || count != maxCount) {
					String aNumb = "";
					for (int y = prevFunc; y < i; y++) {
						if (c[y] == 'x' || c[y] == '+' || c[y] == '/' || c[y] == '-') {

						} else {
							aNumb += c[y];
						}
					}
					if (c[prevFunc] == '+') {
						sum += Double.parseDouble(aNumb);
					} else if (c[prevFunc] == 'x') {
						sum *= Double.parseDouble(aNumb);
					} else if (c[prevFunc] == '/') {
						sum = sum / Double.parseDouble(aNumb);
					} else if (c[prevFunc] == '-') {
						sum -= Double.parseDouble(aNumb);
					}
				}
				count++;
				prevFunc = i;
				if (count == maxCount) {
					String aNumb = "";
					for (int y = prevFunc; y < c.length; y++) {
						if (c[y] == 'x' || c[y] == '+' || c[y] == '/' || c[y] == '-') {

						} else {
							aNumb += c[y];
						}
					}
					if (c[prevFunc] == '+') {
						sum += Double.parseDouble(aNumb);
					} else if (c[prevFunc] == 'x') {
						sum *= Double.parseDouble(aNumb);
					} else if (c[prevFunc] == '/') {
						sum = sum / Double.parseDouble(aNumb);
					} else if (c[prevFunc] == '-') {
						sum -= Double.parseDouble(aNumb);
					}
				}
			}
		}
		if (sum % 1 == 0) {
			activeNumb = Integer.toString((int) sum);
		} else {
			activeNumb = Double.toString(sum);
		}
	}

}
