import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Helmet {

	boolean[] localRangeList = new boolean[4];
	public boolean sensorsInRange = true;
	Sensors sensors = new Sensors();
	boolean inRange = false;
	boolean rangeCheck = false;
	int sensorCount = 0;

	public Helmet() throws InterruptedException, NumberFormatException, IOException {
		
	}
	
	public void rangeUpdate(double d) {
		changeRange(d);
		checkRange();
	}


	public void checkRange() {
		Sensor activeSensor;
		do {
		activeSensor = sensors.sensorArray.get(sensorCount);
		if (activeSensor.laserLength <= 5) {
			sysRange(true);
		} else {
			sysRange(false);
		}
		sensorCount++;
		}while(sensorCount != 4);
		
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
		if(range) {
			localRangeList[sensorCount] = true;
		}else if(!range) {
			localRangeList[sensorCount] = false;
		}
		
		if(allRangeCheck(localRangeList) && !rangeCheck) {
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
	
	public boolean allRangeCheck(boolean[] list) {
		for(int i = 0; i < list.length; i++) {
			if(!list[i]) {
				return false;
			}
		}
		return true;
	}

}
