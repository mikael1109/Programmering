package enums;

public class MetoderLibrary 
{
	public static double G = 9.8; //Gravitationskonstant
	public static double R = 8.3145; //Gaskonstant
	public static double p_0 = 1013.25; //Lufttryck vid havsyta
	public static double c = 299792458; //Ljusetshastighet i vakum
	public static double g_swe = 9.824; // Tyngdacceleration Sverige
	
	public static double fahrenheitToCelisius(double fahrenheit) 
	{
		fahrenheit = (fahrenheit - 32) / 1.8;
		return fahrenheit; 
	}
	
	public static double kelvinToCelisius(double kelvin) {
		kelvin = kelvin - 273.15;
		return kelvin;
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = 0;
		fluidPressure = fluid.density * G * deep;
		return fluidPressure;
	}
	
	public static double pressureUnderWater(double deep) {
		double pressure = 0;
		pressure = FluidTable.WATER.density * G * deep;
		return pressure;
	}
	
	public static double kineticEnergy(double mass, double velocity) 
	{
		double ke = 0;
		ke = (mass * Math.pow(velocity, 2)) / 2;
		return ke;
	}
	
	public static double potentialEnergy(double mass, double height) {
		double pe = 0;
		pe = mass * G * height;
		return pe;
	}
}
