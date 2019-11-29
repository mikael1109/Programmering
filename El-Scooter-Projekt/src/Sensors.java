import java.util.Scanner;
import java.util.ArrayList;

public class Sensors {
	
	ArrayList<Sensor> sensorArray = new ArrayList<Sensor>();
	public boolean sensorsActive = true;
	public boolean sensorConnected = true;
	int sensorsQuantity = 4;
	int sensorCount = 1;
	
	public Sensors() throws InterruptedException{
		for (int i = 0; i < sensorsQuantity; i++) {
			sensorArray.add(new Sensor());
		}
		for(int i = 0; i < sensorArray.size(); i++) {
			if(!sensorStarted(sensorArray.get(i))) {
				sensorsActive = false;
			}
		}
		if(sensorsActive) {
			System.out.println("All sensors started");
		}
		sensorCount = 1;
		for (int i = 0; i < sensorArray.size(); i++) {
			if(!checkConnection(sensorArray.get(i))) {
				sensorConnected = false;
			}
		}
		if(sensorConnected) {
			System.out.println("All sensors connected");
		}
	}
	
	
	public boolean checkConnection(Sensor sensor) throws InterruptedException{
		if(sensor.isConnected) {
			connectTimer(sensor, sensorCount);
			sensorCount++;
			return true;
		}else {
			return false;
		}
	}
	
	public void connectTimer(Sensor sensor, int count) throws InterruptedException {
		synchronized (sensor) {
			sensor.wait(2000);
			System.out.println(sensor + "(Sensor" + count + ")" + " has connected");
		}
	}
	
	
	public boolean sensorStarted(Sensor sensor) throws InterruptedException {
		if(sensor.active) {
			startTimer(sensor, sensorCount);
			sensorCount++;
			return true;
		}else {
			return false;	
		}
		
	}
	
	public void startTimer(Sensor sensor, int count) throws InterruptedException {
		synchronized (sensor) {
			sensor.wait(1000);
			System.out.println(sensor + "(Sensor" + count + ")" + " has started");
		}
	}

	
}
