import java.util.Scanner;

public class Helmet {
	
	public boolean sensorsInRange = true;
	
	public Helmet () throws InterruptedException {
		Sensors sensors = new Sensors();
		for (int i = 0; i < sensors.sensorsQuantity; i++) {
			checkRange(sensors.sensorArray.get(i), sensors);
		}
	}
	
	public static void main(String[] args) 
	{

	}
	
	
	public boolean checkRange(Sensor sensor, Sensors sensors) {
		while(sensors.sensorsActive && sensors.sensorsConnected) {
			if(sensor.laserLength > 5) {
				return false;
			}
		}
		return true;	 
	}
	
}
