package enums;

public class MetoderTest {

	public static void main(String[] args) 
	{
		System.out.println("80 dm^3 j�rn v�ger " + MetoderLibrary.volumeToMass(SolidTable.IRON, 80) + "kg");
		System.out.println("Tomas springer " + MetoderLibrary.svtDistance(2.8, 3600) + "m om hans medelhastighet �r 2,8m/s och han springer i 60minuter");
		System.out.println(MetoderLibrary.heat(FluidTable.H20, 5, 1) + "J kr�vs f�r att v�rma upp 5 liter vatten per grad");
		System.out.println("Trycket under havsytan p� 100m �r " + MetoderLibrary.pressureUnderWater(100) + "Pa");
		System.out.println("En boll med hastigheten 50km/h kommer " + MetoderLibrary.velocityToHeight(13.89) + "m upp");

	}

}
