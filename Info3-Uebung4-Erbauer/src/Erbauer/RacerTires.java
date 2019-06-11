package Erbauer;

public class RacerTires implements ITire {
	public Float strength;
	public Float diameter;
	
	public RacerTires(Float strength, Float diameter) {
		this.strength = strength;
		this.diameter = diameter;
	}

	@Override
	public Float getStrength() {
		// TODO Auto-generated method stub
		return this.strength;
	}

	@Override
	public Float getDiameter() {
		// TODO Auto-generated method stub
		return this.diameter;
	}
	
}
