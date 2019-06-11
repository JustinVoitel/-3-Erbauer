package Erbauer;

public class MountainbikeFrame implements IFrame {
	private Float weight;
	private String color;
	
	public MountainbikeFrame(Float weight, String color) {
		this.weight = weight;
		this.color = color;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	@Override
	public Float getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}
	
	
}
