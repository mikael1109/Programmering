import java.util.Scanner;
import java.util.ArrayList;

public class Sensors {
	
	public boolean sensorsActive = true;
	int sensorsQuantity = 4;
	int startCount = 1;
	
	public void Sensors() throws InterruptedException{
		ArrayList<Sensor> sensorArray = new ArrayList<Sensor>();
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
	}
	
	
	public void checkConnection(Sensor[] sensors){
		
	}
	
	
	public boolean sensorStarted(Sensor sensor) throws InterruptedException {
		if(sensor.active) {
			startTimer(sensor, startCount);
			startCount++;
			return true;
		}else {
			return false;	
		}
		
	}
	
	public void startTimer(Sensor sensor, int count) throws InterruptedException {
		synchronized (sensor) {
			sensor.wait(1000);
			System.out.println("Sensor" + count + " has started");
		}
	}

	
}
