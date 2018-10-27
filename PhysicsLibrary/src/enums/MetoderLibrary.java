package enums;

public class MetoderLibrary 
{
	/**
	 * Sparar v�rden f�r Gravitationskonstanten, 
	 * Alm�nna gaskonstanten, lufttrycket vid havsytan,
	 * Ljusets hastighet i vakum och Tyngdaccelerationen f�r Sverige
	 */
	public static double G = 9.8;
	public static double R = 8.3145; 
	public static double p_0 = 1013.25;
	public static double c = 299792458; 
	public static double g_swe = 9.824; 
	
	/**
	 * G�r om fahrenheit till celsius
	 * @param fahrenheit tempratur i fahrenheit
	 * @return skickar tillbaka v�rdet i celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit)  
	{
		fahrenheit = (fahrenheit - 32) / 1.8; 
		return fahrenheit; 
	}
	
	/**
	 * G�r om kelvin till celsius
	 * @param kelvin tempratur i kelvin
	 * @return skickar tillbaka v�rdet i celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		kelvin = kelvin - 273.15;
		return kelvin;
	}
	
	/**
	 * Tar in v�tske densitet och djup och ger v�tsketryck
	 * @param fluid v�tskan man ska f� ut trycket fr�n 
	 * @param deep hur djupt ner man ska ta trycket fr�n
	 * @return skickar tillbaka v�tsketryckets v�rde
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = 0;
		fluidPressure = fluid.density * G * deep;
		return fluidPressure;
	}
	
	/**
	 * Tar in ett djup och skickar ut trycket i vatten
	 * @param deep vilket djup det ska va
	 * @return skickar tillbaka v�tsketrycket 
	 */
	public static double pressureUnderWater(double deep) {
		double pressure = 0;
		pressure = FluidTable.WATER.density * G * deep;
		return pressure;
	}
	
	/**
	 * Tar in massan och hastigheten och skickar ut kinetiskt energi v�rde
	 * @param mass massan p� objektet
	 * @param velocity objektets hastighet
	 * @return skickar tillbaka kinetiska energi v�rdet
	 */
	public static double kineticEnergy(double mass, double velocity) 
	{
		double ke = 0;
		ke = (mass * Math.pow(velocity, 2)) / 2;
		return ke;
	}
	
	/**
	 * Tar in massan och h�jden och skickar ut potensiella energi v�rdet 
	 * @param mass massan p� objektet
	 * @param height h�jden p� objektet
	 * @return skickar tillbaka potensiella energi v�rdet
	 */
	public static double potentialEnergy(double mass, double height) {
		double pe = 0;
		pe = mass * G * height;
		return pe;
	}
	
	/**
	 * Tar in h�jden och skicker ut fallhastighets v�rdet
	 * @param height hur l�ngt den faller
	 * @return skickar tillbaka fallhastighets v�rdet
	 */
	public static double fallSpeed(double height) {
		double fs = 0;
		fs = Math.sqrt(2 * G * height);
		return fs;
	}
	
	/**
	 * Tar in tv� v�rden och skickar ut skillnaden mellan dem
	 * @param first f�rsta v�rdet
	 * @param last andra v�rdet
	 * @return skickar tillbaka skillnaden mellan v�rderna
	 */
	public static double delta(double first, double last) {
		double summa = 0;
		summa = last - first;
		return summa;
	}
	
	/**
	 * G�r om volymen av en v�tska till massan
	 * @param fluid v�tskan
	 * @param volume volym v�rdet f�r v�tskan
	 * @return skickar tillbaka massa f�r v�tskan
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double mass = 0;
		mass = volume * fluid.density;
		return mass;
	}
	
	/**
	 * G�r om volymen av en gas till massan
	 * @param gas gasen
	 * @param volume volym v�rdet f�r gasen
	 * @return skickar tillbaka gasens massa
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		double mass = 0;
		mass = volume * gas.density;
		return mass;
	}
}
