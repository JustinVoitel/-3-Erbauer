package Erbauer;

public class MountainbikeGearShift implements IGearShift {
	private int gearCount;
	
	public MountainbikeGearShift(int count) {
		this.gearCount = count;
	}
	@Override
	public int getGearCount() {
		// TODO Auto-generated method stub
		return this.gearCount;
	}

}
