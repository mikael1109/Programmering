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
	 * @param deep (m) hur djupt ner man m�ter trycket fr�n
	 * @return (Pa) skickar tillbaka v�tsketryckets v�rde
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = 0;
		fluidPressure = fluid.density * G * deep;
		return fluidPressure;
	}
	
	/**
	 * Tar in ett djup och skickar ut trycket i vatten
	 * @param deep (m) vilket djup det ska va
	 * @return (Pa) skickar tillbaka v�tsketrycket 
	 */
	public static double pressureUnderWater(double deep) {
		double pressure = 0;
		pressure = FluidTable.WATER.density * G * deep;
		return pressure;
	}
	
	/**
	 * Tar in massan och hastigheten och skickar ut kinetiskt energi v�rde
	 * @param mass (kg) massan p� objektet
	 * @param velocity (m/s) objektets hastighet
	 * @return (J) skickar tillbaka kinetiska energi v�rdet
	 */
	public static double kineticEnergy(double mass, double velocity) 
	{
		double ke = 0;
		ke = (mass * Math.pow(velocity, 2)) / 2;
		return ke;
	}
	
	/**
	 * Tar in massan och h�jden och skickar ut potensiella energi v�rdet 
	 * @param mass (kg) massan p� objektet
	 * @param height (m) h�jden p� objektet
	 * @return (J) skickar tillbaka potensiella energi v�rdet
	 */
	public static double potentialEnergy(double mass, double height) {
		double pe = 0;
		pe = mass * G * height;
		return pe;
	}
	
	/**
	 * Tar in h�jden och skicker ut fallhastighets v�rdet
	 * @param height (m) hur l�ngt den faller
	 * @return (m/s) skickar tillbaka fallhastighets v�rdet
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
	 * @param volume (dm^3) volym v�rdet f�r v�tskan
	 * @return (kg) skickar tillbaka massa f�r v�tskan
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double mass = 0;
		mass = volume * fluid.density;
		return mass;
	}
	
	/**
	 * G�r om volymen av en gas till massan
	 * @param gas gasen
	 * @param volume (dm^3) volym v�rdet f�r gasen
	 * @return (kg) skickar tillbaka gasens massa
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		double mass = 0;
		mass = volume * gas.density;
		return mass;
	}
	
	/**
	 * G�r om volymen av ett fast objekt till dess massa
	 * @param solid fasta objektet
	 * @param volume (dm^3) volym v�rdet f�r fasta objektet
	 * @return (kg) skickar tillbaka fasta objektets massa
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		double mass = 0;
		mass = volume * solid.density;
		return mass;
	}
	
	/**
	 * Tar in str�ckan och tiden och r�knar ut medelhastigheten
	 * @param distance (m) str�ckan
	 * @param time (s) tiden
	 * @return (m/s) skickar tillbaka medelhastigheten
	 */
	public static double svtVelocity(double distance, double time) {
		double svt = 0;
		svt = distance / time;
		return svt;
	}
	
	/**
	 * Tar in hastigheten och tiden och r�knar ut str�ckan
	 * @param velocity (m/s) hastigheten
	 * @param time (s) tiden
	 * @return (m) skickar tillbaka str�ckan
	 */
	public static double svtDistance(double velocity, double time) {
		double svt = 0;
		svt = velocity * time;
		return svt;
	}
	
	/**
	 * Tar in str�ckan och hastigheten och r�knar ut tiden
	 * @param distance (m) str�ckan
	 * @param velocity (m/s) hastighetn
	 * @return (s) skickar tillbaka tiden
	 */
	public static double svtTime(double distance, double velocity) {
		double svt = 0;
		svt = distance / velocity;
		return svt;
	}
	
	/**
	 * Tar in kraften och str�ckan och r�knar ut arbetet
	 * @param (N) force kraften
	 * @param (m) distance str�ckan 
	 * @return (J) skickar tillbaka arbetet
	 */
	public static double work(double force, double distance) {
		double work = 0;
		work = force * distance;
		return work;
	}
	
	/**
	 * Tar in arbetet och tiden och r�knar ut effekten
	 * @param (J) work arbetet
	 * @param (s) time tiden
	 * @return (W) skickar tillbaka effekten
	 */
	public static double power(double work, double time) {
		double power = 0;
		power = work / time;
		return power;
	}
	
	/**
	 * Tar in ett material, dess massa och en temperatur skillnad och 
	 * r�knar ut hur mycket energi som beh�vs f�r att v�rma materialet
	 * en viss m�ngd grader (s� mycket temperatur skillnaden �r) 
	 * @param solid Materialet
	 * @param (kg) mass Massan
	 * @param deltaT Temperatur skillnaden
	 * @return (J) skickar tillbaka hur mycket energi som beh�vdes f�r att v�rma upp materialet.
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double heat = 0;
		heat = solid.heatCapacity * mass * deltaT;
		return heat;
	}
	
	/**
	 * Tar in en v�tska, dess volym och en temperatur skillnad och r�knar
	 * ut hur mycket energi som beh�vs f�r att 
	 * v�rma upp v�tskan temperatur skillnaden
	 * @param fluid V�tskan
	 * @param volume (dm^3) v�tskans volym
	 * @param deltaT temperatur skillnaden
	 * @return (J) skickar tillbaka hur mycket energi som beh�vs f�r att v�rma upp v�tskan
	 */
	public static double heat(FluidTable fluid, double volume, double deltaT) {
		double heat = 0;
		double mass = 0;
		mass = volume * fluid.density;
		heat = fluid.heatCapacity * mass * deltaT;
		return heat;
	}
	
	/**
	 * Tar in en gas, dess volym och en temperatur skillnad och
	 * r�knar ut hur mycket energi som beh�vs f�r att
	 * v�rma upp gasen tempeatur skillnaden
	 * @param gas gasen
	 * @param volume (dm^3) gasens volym
	 * @param deltaT temperatur skillnaden
	 * @return (J) skickar tillbaka hur mycket enregi som behlvs f�r att v�rma upp gasen
	 */
	public static double heat(GasTable gas, double volume, double deltaT) {
		double heat = 0;
		double mass = 0;
		mass = volume * gas.density;
		heat = gas.heatCapacity * mass * deltaT;
		return heat;
	}
	
	/**
	 * Tar in hastighet och r�knar ut hur h�gt upp�t ett f�rem�l kommer. 
	 * @param velocity (m/s) hastigheten
	 * @return (m) skickar tillbaka hur h�gt f�rem�let kommer
	 */
	public static double velocityToHeight(double velocity) {
		velocity = velocity / 2;
		return velocity;
	}
	
	/**
	 * Tar in hastigheten och tiden och r�knar ut accelerationen
	 * @param (m/s) velocity hastigheten
	 * @param (s) time tiden
	 * @return (m/s^2) skickar tillbaka accelerationen
	 */
	public static double acceleration(double velocity, double time) {
		double acceleration = 0;
		acceleration = velocity / time;
		return acceleration;
	}
	
	/**
	 * Tar in accelerationen och massan p� ett f�rem�l r�knar ut kraften
	 * @param mass (kg) massa
	 * @param acceleration (m/s^2) accelerationen
	 * @return (N) skickar tillbaka kraften p� f�rem�let
	 */
	public static double force(double mass, double acceleration) {
		double force = 0;
		force = mass * acceleration;
		return force;
	}
	
	/**
	 * Tar in a l�ngden och b l�ngden p� en triangel och r�knar ut c l�ngden
	 * @param a a l�ngden
	 * @param b b l�ngden
	 * @return skickar tillbaka c l�ngden av triangeln
	 */
	public static double pythagoras(double a, double b) {
		double pytha = 0;
		a = Math.pow(a, 2);
		b = Math.pow(b, 2);
		pytha = Math.sqrt(a + b);
		return pytha;
	}
}
