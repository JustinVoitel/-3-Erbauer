package Erbauer;

public class BikeDirector {
	private BikeBuilder bikeBuilder;
	public BikeDirector(BikeBuilder bikeBuilder) {
		this.bikeBuilder = bikeBuilder;
	}
	
	public void construct() {
		this.bikeBuilder.buildBike();
		
		this.bikeBuilder.buildFrame();
		this.bikeBuilder.buildTires();
		this.bikeBuilder.buildGearShift();
		
	}
	
	
}
