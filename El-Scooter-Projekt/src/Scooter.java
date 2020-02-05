
public class Scooter {
	
	public boolean locked = true;
	
	
	public void unlock(Helmet helmet) {
		if(helmet.inRange) {
			if(locked) {
				locked = false;
				System.out.println("Scooter now unlocked and ready to use");
			}
		}else {
			System.out.println("Put on the helmet to use the scooter");
		}
	}
	
	public void lock() {
		if(!locked) {
			System.out.println("Scooter now locked");
		}
	}

}
