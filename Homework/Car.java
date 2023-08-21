package Interface;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Start the car");
		
	}

	@Override
	public void accelerate() {
		System.out.println("apply accelerate to speedup");
	}

	@Override
	public void brake() {
		System.out.println("Use brake for stop car");
	}

}
