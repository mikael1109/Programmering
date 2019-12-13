import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helmet {

	public boolean sensorsInRange = true;
	Sensors sensors = new Sensors();
	boolean inRange = false;
	boolean rangeCheck = false;
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
			sysRange(true, activeSensor);
		} else {
			sysRange(false, activeSensor);
		}
		sensorCount++;
		if (sensorCount == 4) {
			sensorCount = 0;
		}

	}

	public void changeRange(double newRange) {
		for (int i = 0; i < sensors.sensorsQuantity; i++) {
			sensors.sensorArray.get(i).laserLength = newRange;
			System.out.println(sensors.sensorArray.get(i).toString() + "'s range is now: " + sensors.sensorArray.get(i).laserLength);
		}
	}
	
	public void sysRange(boolean range, Sensor sensor) {
		if(range && !rangeCheck) {
			System.out.println("Sensors in range");
			rangeCheck = true;
			inRange = true;
		}else if(!range && !rangeCheck) {
			inRange = false;
		}else if(!range && rangeCheck) {
			System.out.println("Sensors no longer in range");
			inRange = false;
			rangeCheck = false;
		}
	}

}
