package Erbauer;

public class RacerFrame implements IFrame {
	private Float weight;
	private String color;
	
	public RacerFrame(Float weight, String color) {
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
