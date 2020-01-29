import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) throws NumberFormatException, InterruptedException, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		
		Helmet helmet = new Helmet();
		Scooter scooter = new Scooter();
		
		while(helmet.sensors.sensorsActive && helmet.sensors.sensorsConnected) {
		
		if(bReader.ready()) {
			String activeString = bReader.readLine();
			System.out.println(activeString);
			if(!checkDouble(activeString)){
				if(activeString.toUpperCase().equals("LOCK")) {
					scooter.lock(helmet);
				}else if(activeString.toUpperCase().equals("UNLOCK")) {
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
		}catch (NumberFormatException e){
			return false;
		}
	}

}
