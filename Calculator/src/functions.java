public class functions {

	public String activeNumb = "";
	public String numb = "";
	public double sum;

	/**
	 * s�tter activeNumb och numb till ett tomt v�rde
	 */
	public void clear() {
		activeNumb = "";
		numb = "";
	}

	/**
	 * plussar p� en siffra eller en punkt i stringen activeNumb
	 * 
	 * @param c
	 *            siffran eller punkten
	 */
	public void actNumb(char c) {
		activeNumb += c;
	}

	/**
	 * ifall activeNumb �r tom g�r den ingenting annars s� plussar activeNumb och
	 * ett pluss tecken och s�tter activeNumb till ett tomt v�rde
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
	 * Fungerar samma som addNumb fast med g�nger
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
	 * Kollar f�rst hur m�nga operatorer det finns i numb sen ifall count �r 0 som
	 * den �r vid f�rsta talet s�tter den firstNumb till till f�rsta talet och
	 * s�tter sum till firstNumb. Efter detta s�tts prevFunc till i s� n�sta varv
	 * har man v�rdet p� f�rra operatorn sen s� g�r den mellan operatorna och
	 * anv�nder l�mpliga operatorer tills count �r lika maxCount och d� g�r den fr�n
	 * prevFunc till slutet p� numb.
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
