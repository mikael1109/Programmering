import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helmet {

	public boolean sensorsInRange = true;
	Sensors sensors = new Sensors();
	boolean inRange = false;
	int sensorCount = 0;

	public Helmet() throws InterruptedException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (sensors.sensorsActive && sensors.sensorsConnected) {
			checkRange();
			if (br.ready()) {
				changeRange(Double.parseDouble(br.readLine()));
			}
		}
	}

	public void checkRange() {
		Sensor activeSensor;
		activeSensor = sensors.sensorArray.get(sensorCount);
		if (activeSensor.laserLength < 5) {
			inRange = true;
			System.out.println(activeSensor.toString() + " in range");
		} else {
			inRange = false;
		}
		sensorCount++;
		if (sensorCount == 4) {
			sensorCount = 0;
		}

	}

	public void changeRange(double newRange) {
		for (int i = 0; i < sensors.sensorsQuantity; i++) {
			sensors.sensorArray.get(i).laserLength = newRange;
			System.out.println(sensors.sensorArray.get(i).laserLength);
		}

	}

}
