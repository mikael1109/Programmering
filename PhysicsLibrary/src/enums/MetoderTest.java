package enums;

public class MetoderTest {

	public static void main(String[] args) 
	{
		System.out.println("80 dm^3 järn väger " + MetoderLibrary.volumeToMass(SolidTable.IRON, 80));
		System.out.println("Tomas hinner " + MetoderLibrary.svtDistance(2.8, 60));

	}

}
