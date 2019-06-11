package Erbauer;
// Reifenbreite, Reifengr��e, Gewicht des Rahmens, Farbe des Rahmens, Anzahl der G�nge
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
		return this.name+" mit einem Rahmen in "+frame.getColor()+", der "+frame.getWeight()+"kg wiegt; R�der mit einem Durchmesser von "+tires.getDiameter()+" und einer St�rke von "+tires.getStrength()+"; Gangsch�ltung mit "+gearShift.getGearCount()+" G�ngen";
	}
	
	public String getName() {
		return this.name;
	}
}
