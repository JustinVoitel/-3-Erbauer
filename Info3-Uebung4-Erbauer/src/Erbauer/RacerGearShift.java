package Erbauer;

public class RacerGearShift implements IGearShift {
	private int gearCount;
	
	public RacerGearShift(int count) {
		this.gearCount = count;
	}
	@Override
	public int getGearCount() {
		// TODO Auto-generated method stub
		return this.gearCount;
	}

}
