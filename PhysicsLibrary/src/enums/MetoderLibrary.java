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
	
	/**
	 * Gör om volymen av ett fast objekt till dess massa
	 * @param solid fasta objektet
	 * @param volume volym värdet för fasta objektet
	 * @return skickar tillbaka fasta objektets massa
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		double mass = 0;
		mass = volume * solid.density;
		return mass;
	}
	
	/**
	 * Tar in sträckan och tiden och räknar ut medelhastigheten
	 * @param distance sträckan
	 * @param time tiden
	 * @return skickar tillbaka medelhastigheten
	 */
	public static double svtVelocity(double distance, double time) {
		double svt = 0;
		svt = distance / time;
		return svt;
	}
	
	/**
	 * Tar in hastigheten och tiden och räknar ut sträckan
	 * @param velocity hastigheten
	 * @param time tiden
	 * @return skickar tillbaka sträckan
	 */
	public static double svtDistance(double velocity, double time) {
		double svt = 0;
		svt = velocity * time;
		return svt;
	}
	
	/**
	 * Tar in sträckan och hastigheten och räknar ut tiden
	 * @param distance sträckan
	 * @param velocity hastighetn
	 * @return skickar tillbaka tiden
	 */
	public static double svtTime(double distance, double velocity) {
		double svt = 0;
		svt = distance / velocity;
		return svt;
	}
	
	/**
	 * Tar in kraften och sträckan och räknar ut arbetet
	 * @param force kraften
	 * @param distance sträckan 
	 * @return skickar tillbaka arbetet
	 */
	public static double work(double force, double distance) {
		double work = 0;
		work = force * distance;
		return work;
	}
	
	/**
	 * Tar in arbetet och tiden och räknar ut effekten
	 * @param work arbetet
	 * @param time tiden
	 * @return skickar tillbaka effekten
	 */
	public static double power(double work, double time) {
		double power = 0;
		power = work / time;
		return power;
	}
	
	/**
	 * Tar in ett material, dess massa och en temperatur skillnad och 
	 * räknar ut hur mycket energi som behövs för att värma materialet
	 * en viss mängd grader (så mycket temperatur skillnaden är) 
	 * @param solid Materialet
	 * @param mass Massan
	 * @param deltaT Temepratur skillnaden
	 * @return skickar tillbaka hur mycket energi som behövdes för att värma upp materialet.
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double heat = 0;
		heat = solid.heatCapacity * mass * deltaT;
		return heat;
	}
	
	public static double heat(FluidTable fluid, double volume, double deltaT) {
		double heat = 0;
		double mass = 0;
		mass = volume * fluid.density;
		heat = fluid.heatCapacity * mass * deltaT;
		return heat;
	}
	
	public static double heat(GasTable gas, double volume, double deltaT) {
		double heat = 0;
		double mass = 0;
		mass = volume * gas.density;
		heat = gas.heatCapacity * mass * deltaT;
		return heat;
	}
	
	public static double velocityToHeight(double velocity) {
		velocity = velocity / 2;
		return velocity;
	}
}
