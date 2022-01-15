package pkg;

public class InheritanceDemo {

	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(10,20,1);
		System.out.println("Gear is: "+mountainBike.gear);
		System.out.println("Seat height is: "+mountainBike.seatHeight);
		System.out.println("Bike speed is: "+mountainBike.speed);
		mountainBike.applyBrake(1);
		System.out.println("Bike speed after applying break is: "+mountainBike.speed);
		mountainBike.speedUp(21);
		System.out.println("Bike speed after speed up: "+mountainBike.speed);
		

	}

}
