package BasicInheritanceA1Shape;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c1=new Circle();//c1 is reference of objects
		c1.draw();//circle method draw will override draw method of parent class Shape
		c1=new Polygon();
		c1.draw();//polygon method draw will override draw method of parent class Shape
		c1=new Rectangle();
		c1.draw();//Rectangle method draw will override draw method of parent class Shape
	}

}
