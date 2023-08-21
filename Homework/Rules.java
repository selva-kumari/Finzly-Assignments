package Interface;

public class Rules {

	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.accelerate();
		c.brake();
		Motorcycle m=new Motorcycle();
		m.start();
		m.accelerate();
		m.brake();
	}

}
