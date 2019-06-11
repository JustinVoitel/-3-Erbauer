package Erbauer;

public class Client {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RACER
		BikeBuilder racerBuilder = new RacerBuilder();
		BikeDirector racerDirector = new BikeDirector(racerBuilder);
		racerDirector.construct();
		
		AbstractBike racer = racerBuilder.getResults();
		System.out.println(racer.toString());
		System.out.println("");
		
		//MOUNTAINBIKE
		BikeBuilder mtnbikeBuilder = new MountainbikeBuilder();
		BikeDirector mtnbikeDirector = new BikeDirector(mtnbikeBuilder);
		mtnbikeDirector.construct();
		
		AbstractBike mtnbike = mtnbikeBuilder.getResults();
		System.out.println(mtnbike.toString());
	}
}
