import java.util.Scanner;
import java.util.ArrayList;

public class Sensors {

	ArrayList<Sensor> sensorArray = new ArrayList<Sensor>();
	public boolean sensorsActive = true;
	public boolean sensorsConnected = true;
	int sensorsQuantity = 4;
	int sensorCount = 1;

	public Sensors() throws InterruptedException {
		for (int i = 0; i < sensorsQuantity; i++) {
			sensorArray.add(new Sensor());
		}
		for (int i = 0; i < sensorArray.size(); i++) {
			if (!sensorStarted(sensorArray.get(i))) {
				sensorsActive = false;
			}
		}
		if (sensorsActive) {
			System.out.println("All sensors started");
		}
		sensorCount = 1;
		for (int i = 0; i < sensorArray.size(); i++) {
			if (!checkConnection(sensorArray.get(i))) {
				sensorsConnected = false;
			}
		}
		if (sensorsConnected) {
			System.out.println("All sensors connected");
		}
	}

	public boolean sensorStarted(Sensor sensor) throws InterruptedException {
		startTimer(sensor, sensorCount);
		sensor.laserLength = 40;
		// Start sensor
		if (!sensor.active) {
			System.out.println(sensor + "(Sensor" + sensorCount + ")" + "couldn't start");
			sensorCount++;
			return false;
		} else {
			System.out.println(sensor + "(Sensor" + sensorCount + ")" + "has started");
			sensorCount++;
			return true;
		}

	}

	public boolean checkConnection(Sensor sensor) throws InterruptedException {
		connectTimer(sensor, sensorCount);
		// Connect sensor
		if (!sensor.isConnected) {
			System.out.println(sensor + "(Sensor" + sensorCount + ")" + "couldn't connect");
			sensorCount++;
			return false;
		} else {
			System.out.println(sensor + "(Sensor" + sensorCount + ")" + "has connected");
			sensorCount++;
			return true;
		}
	}

	public void connectTimer(Sensor sensor, int count) throws InterruptedException {
		synchronized (sensor) {
			System.out.println(sensor + "(Sensor" + count + ")" + " is trying to connect");
			sensor.wait(1000);
		}
	}

	public void startTimer(Sensor sensor, int count) throws InterruptedException {
		synchronized (sensor) {
			System.out.println(sensor + "(Sensor" + count + ")" + " is trying to start");
			sensor.wait(1000);
		}
	}

}
