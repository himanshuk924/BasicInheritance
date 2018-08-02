package BasicInheritanceA2Shape;

public class Test {

	public static void main(String[] args) {

		Shape[] s1 = new Shape[3];// Creating array of objects
		s1[0] = new Circle();// Instantiating circle class
		s1[1] = new Triangle();// Instantiating Triangle class
		s1[2] = new Polygon();// Instantiating Polygon class
		for (int i = 0; i < 3; i++) {
			s1[i].draw();// Invoking draw method
		}
	}

}
