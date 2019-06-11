package Erbauer;

public class MountainbikeBuilder extends BikeBuilder{

	@Override
	public AbstractBike buildBike() {
		// TODO Auto-generated method stub
		AbstractBike concreteBike = new Mountainbike("Mountain Bike");
		this.bike = concreteBike;
		return concreteBike;
	}

	@Override
	public ITire buildTires() {
		// TODO Auto-generated method stub
		ITire tire = new MountainbikeTires(2F,30F);
		this.bike.setTires(tire);
		return tire;
	}

	@Override
	public IFrame buildFrame() {
		// TODO Auto-generated method stub
		IFrame frame = new MountainbikeFrame(30F,"black");
		this.bike.setFrame(frame);
		return frame;
	}

	@Override
	public IGearShift buildGearShift() {
		// TODO Auto-generated method stub
		IGearShift gear = new MountainbikeGearShift(10);
		this.bike.setGearShift(gear);
		return gear;
	}

	@Override
	public AbstractBike getResults() {
		// TODO Auto-generated method stub
		return bike;
	}
	
	

}
