import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helmet {

	public boolean sensorsInRange = true;
	Sensors sensors = new Sensors();
	boolean inRange = false;
	boolean rangeCheck = false;
	int sensorCount = 0;

	boolean sensor1 = false;
	boolean sensor2 = false;
	boolean sensor3 = false;
	boolean sensor4 = false;

	public Helmet() throws InterruptedException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (sensors.sensorsActive && sensors.sensorsConnected) {
			checkRange();
			if (br.ready()) {
				String activeString = br.readLine();
				if(checkDouble(activeString)) {
					changeRange(Double.parseDouble(activeString));
				}
			}
		}
	}
	
	public boolean checkDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}catch (NumberFormatException e){
			return false;
		}
	}

	public void checkRange() {
		Sensor activeSensor;
		activeSensor = sensors.sensorArray.get(sensorCount);
		if (activeSensor.laserLength <= 5) {
			sysRange(true);
		} else {
			sysRange(false);
		}
		sensorCount++;
		if (sensorCount == 4) {
			sensorCount = 0;
		}

	}

	public void changeRange(double newRange) {
		for (int i = 0; i < sensors.sensorsQuantity; i++) {
			sensors.sensorArray.get(i).laserLength = newRange;
			System.out.println(sensors.sensorArray.get(i).toString() + "'s range is now: "
					+ sensors.sensorArray.get(i).laserLength);
		}
	}

	public void sysRange(boolean range) {
		if (sensorCount == 0 && range) {
			sensor1 = true;
		} else if (sensorCount == 0 && !range) {
			sensor1 = false;
		}

		if (sensorCount == 1 && range) {
			sensor2 = true;
		} else if (sensorCount == 1 && !range) {
			sensor2 = false;
		}

		if (sensorCount == 2 && range) {
			sensor3 = true;
		} else if (sensorCount == 2 && !range) {
			sensor3 = false;
		}

		if (sensorCount == 3 && range) {
			sensor4 = true;
		} else if (sensorCount == 3 && !range) {
			sensor4 = false;
		}

		if (sensor1 && sensor2 && sensor3 && sensor4 && !rangeCheck) {
			System.out.println("All sensors in range");
			rangeCheck = true;
			inRange = true;
		}
		if (!rangeCheck && !range) {
			inRange = false;
		}
		if (rangeCheck && !range) {
			System.out.println("All sensors no longer in range");
			inRange = false;
			rangeCheck = false;
		}

	}

}
