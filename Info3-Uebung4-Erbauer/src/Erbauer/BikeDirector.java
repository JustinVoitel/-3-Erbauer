package Erbauer;

public class BikeDirector {
	private BikeBuilder bikeBuilder;
	public BikeDirector(BikeBuilder bikeBuilder) {
		this.bikeBuilder = bikeBuilder;
	}
	
	public void construct() {
		AbstractBike bike = this.bikeBuilder.buildBike();
		System.out.println("Bauen eines "+bike.getName()+" angefangen");
		
		IFrame frame = this.bikeBuilder.buildFrame();
		System.out.println("Rahmen mit der Farbe "+frame.getColor()+" wurde montiert");
		
		ITire tires = this.bikeBuilder.buildTires();
		System.out.println("R�der mit St�rke "+tires.getDiameter()+" wurde montiert");

		IGearShift gear = this.bikeBuilder.buildGearShift();
		System.out.println("Schaltung mit "+gear.getGearCount()+" G�ngen wurde montiert");

		
	}
	
	
}
