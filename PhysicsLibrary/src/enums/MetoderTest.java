package enums;

public class MetoderTest {

	public static void main(String[] args) 
	{
		System.out.println("80 dm^3 järn väger " + MetoderLibrary.volumeToMass(SolidTable.IRON, 80) + "kg");
		System.out.println("Tomas springer " + MetoderLibrary.svtDistance(2.8, 3600) + "m om hans medelhastighet är 2,8m/s och han springer i 60minuter");
		System.out.println(MetoderLibrary.heat(FluidTable.H20, 5, 1) + "J krävs för att värma upp 5 liter vatten per grad");
		System.out.println("Trycket under havsytan på 100m är " + MetoderLibrary.pressureUnderWater(100) + "Pa");
		System.out.println("En boll med hastigheten 50km/h kommer " + MetoderLibrary.velocityToHeight(13.89) + "m upp");
		System.out.println("En bil med massan 740kg som accelerar från 0-100 på 4.4 sekunder har effekten " + car(740, 4.4, 100/3.6) + "W");
		System.out.println("En studsboll som släpps från 10m och nuddar marken " + boll(10) + " gånger");
		System.out.println("Det tar " + MetoderLibrary.heat(SolidTable.GOLD, 2, 10) + "J Att värma 2kg guld 10 grader");
		
	}
	
	public static double car(double mass, double time, double vel) 
	{
		double dist = MetoderLibrary.svtDistance(vel, time);
		double force = vel * mass;
		double work = force * dist;
		double power = work * time;
		return power;
	}
	
	public static int boll(double height) {
		int counter = 0;
		double fallspeed = MetoderLibrary.fallSpeed(height);
		while (height >= 0.5) {
			fallspeed = fallspeed * 0.99;
			height = MetoderLibrary.velocityToHeight(fallspeed);
			counter = counter + 1;
		}
		return counter;
	}

}
