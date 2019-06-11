package Erbauer;

public class RacerBuilder extends BikeBuilder{

	
	
	@Override
	public AbstractBike buildBike() {
		// TODO Auto-generated method stub
		AbstractBike concreteBike = new Racer("Racer");
		this.bike = concreteBike;
		return concreteBike;
	}

	@Override
	public ITire buildTires() {
		// TODO Auto-generated method stub
		ITire tire = new RacerTires(2.1F,29F);
		this.bike.setTires(tire);
		return tire;
	}

	@Override
	public IFrame buildFrame() {
		// TODO Auto-generated method stub
		IFrame frame = new RacerFrame(20F,"silver");
		this.bike.setFrame(frame);
		return frame;
	}

	@Override
	public IGearShift buildGearShift() {
		// TODO Auto-generated method stub
		IGearShift gear = new RacerGearShift(4);
		this.bike.setGearShift(gear);
		return gear;
	}

	@Override
	public AbstractBike getResults() {
		// TODO Auto-generated method stub
		return bike;
	}

}
