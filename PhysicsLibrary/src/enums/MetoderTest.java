package enums;

public class MetoderTest {

	public static void main(String[] args) 
	{
		System.out.println("80 dm^3 järn väger " + MetoderLibrary.volumeToMass(SolidTable.IRON, 80) + "kg");
		System.out.println("Tomas springer " + MetoderLibrary.svtDistance(2.8, 3600) + "m om hans medelhastighet är 2,8m/s och han springer i 60minuter");
		System.out.println(MetoderLibrary.heat(FluidTable.H20, 5, 1) + "J krävs för att värma upp 5 liter vatten per grad");
		System.out.println("Trycket under havsytan på 100m är " + MetoderLibrary.pressureUnderWater(100) + "Pa");
		System.out.println("En boll med hastigheten 50km/h kommer " + MetoderLibrary.velocityToHeight(13.89) + "m upp");

	}

}
