package Erbauer;

public abstract class BikeBuilder {
	protected AbstractBike bike;
	
	public abstract AbstractBike buildBike();	
	public abstract ITire buildTires();
	public abstract IFrame buildFrame();
	public abstract IGearShift buildGearShift();
	public abstract AbstractBike getResults();
}
