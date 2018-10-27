package enums;

public class MetoderLibrary 
{
	/**
	 * Sparar värden för Gravitationskonstanten, 
	 * Almänna gaskonstanten, lufttrycket vid havsytan,
	 * Ljusets hastighet i vakum och Tyngdaccelerationen för Sverige
	 */
	public static double G = 9.8;
	public static double R = 8.3145; 
	public static double p_0 = 1013.25;
	public static double c = 299792458; 
	public static double g_swe = 9.824; 
	
	/**
	 * Gör om fahrenheit till celsius
	 * @param fahrenheit tempratur i fahrenheit
	 * @return skickar tillbaka värdet i celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit)  
	{
		fahrenheit = (fahrenheit - 32) / 1.8; 
		return fahrenheit; 
	}
	
	/**
	 * Gör om kelvin till celsius
	 * @param kelvin tempratur i kelvin
	 * @return skickar tillbaka värdet i celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		kelvin = kelvin - 273.15;
		return kelvin;
	}
	
	/**
	 * Tar in vätske densitet och djup och ger vätsketryck
	 * @param fluid vätskan man ska få ut trycket från 
	 * @param deep hur djupt ner man ska ta trycket från
	 * @return skickar tillbaka vätsketryckets värde
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = 0;
		fluidPressure = fluid.density * G * deep;
		return fluidPressure;
	}
	
	/**
	 * Tar in ett djup och skickar ut trycket i vatten
	 * @param deep vilket djup det ska va
	 * @return skickar tillbaka vätsketrycket 
	 */
	public static double pressureUnderWater(double deep) {
		double pressure = 0;
		pressure = FluidTable.WATER.density * G * deep;
		return pressure;
	}
	
	/**
	 * Tar in massan och hastigheten och skickar ut kinetiskt energi värde
	 * @param mass massan på objektet
	 * @param velocity objektets hastighet
	 * @return skickar tillbaka kinetiska energi värdet
	 */
	public static double kineticEnergy(double mass, double velocity) 
	{
		double ke = 0;
		ke = (mass * Math.pow(velocity, 2)) / 2;
		return ke;
	}
	
	/**
	 * Tar in massan och höjden och skickar ut potensiella energi värdet 
	 * @param mass massan på objektet
	 * @param height höjden på objektet
	 * @return skickar tillbaka potensiella energi värdet
	 */
	public static double potentialEnergy(double mass, double height) {
		double pe = 0;
		pe = mass * G * height;
		return pe;
	}
	
	/**
	 * Tar in höjden och skicker ut fallhastighets värdet
	 * @param height hur långt den faller
	 * @return skickar tillbaka fallhastighets värdet
	 */
	public static double fallSpeed(double height) {
		double fs = 0;
		fs = Math.sqrt(2 * G * height);
		return fs;
	}
	
	/**
	 * Tar in två värden och skickar ut skillnaden mellan dem
	 * @param first första värdet
	 * @param last andra värdet
	 * @return skickar tillbaka skillnaden mellan värderna
	 */
	public static double delta(double first, double last) {
		double summa = 0;
		summa = last - first;
		return summa;
	}
	
	/**
	 * Gör om volymen av en vätska till massan
	 * @param fluid vätskan
	 * @param volume volym värdet för vätskan
	 * @return skickar tillbaka massa för vätskan
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double mass = 0;
		mass = volume * fluid.density;
		return mass;
	}
	
	/**
	 * Gör om volymen av en gas till massan
	 * @param gas gasen
	 * @param volume volym värdet för gasen
	 * @return skickar tillbaka gasens massa
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		double mass = 0;
		mass = volume * gas.density;
		return mass;
	}
}
