package Erbauer;
// Reifenbreite, Reifengröße, Gewicht des Rahmens, Farbe des Rahmens, Anzahl der Gänge
public abstract class AbstractBike{
	protected String name;
	protected ITire tires;
	protected IFrame frame;
	protected IGearShift gearShift;
	
	public void setTires(ITire tires) {
		this.tires = tires;
	}
	
	public void setFrame(IFrame frame) {
		this.frame = frame;
	}
	
	public void setGearShift(IGearShift gear) {
		this.gearShift = gear;
	}

	public ITire getTires() {
		return tires;
	}

	public IFrame getFrame() {
		return frame;
	}

	public IGearShift getGearShift() {
		return gearShift;
	}
	
	public String toString() {
		return this.name+" with a "+frame.getColor()+" frame that weights "+frame.getWeight()+"kg";
	}
	
	public String getName() {
		return this.getName();
	}
}
