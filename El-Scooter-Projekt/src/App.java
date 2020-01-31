import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	
	public static String activeRead = "";

	public static void main(String[] args) throws NumberFormatException, InterruptedException, IOException {
		Helmet helmet = new Helmet();
		Scooter scooter = new Scooter();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (helmet.sensors.sensorsActive && helmet.sensors.sensorsConnected) {
			if (br.ready()) {
				activeRead = br.readLine();
				if (checkDouble(activeRead)) {
					helmet.rangeUpdate(Double.parseDouble(activeRead));
				}else if(!checkDouble(activeRead)){
					if(activeRead.toUpperCase().equals("LOCK")) {
						scooter.lock(helmet);
					}else if(activeRead.toUpperCase().equals("UNLOCK")) {
						scooter.unlock(helmet);
					}
				}
			}

		}

		
	}

	public static boolean checkDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
